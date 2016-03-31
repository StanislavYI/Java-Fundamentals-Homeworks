package StreamsAndFiles;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\slavi\\Desktop\\" +
                    "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\text-files.zip");
            ZipOutputStream zos = new ZipOutputStream(fos);

            String wordsFile = "C:\\Users\\slavi\\Desktop\\" +
                    "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\words.txt";
            String countCharsFile = "C:\\Users\\slavi\\Desktop\\" +
                    "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\count-chars.txt";
            String linesFile = "C:\\Users\\slavi\\Desktop\\" +
                    "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\lines.txt";

            addToZip(wordsFile, zos);
            addToZip(countCharsFile, zos);
            addToZip(linesFile, zos);

            zos.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println("File not found!");
        }
    }

    public static void addToZip(String nameOfFile, ZipOutputStream zos) throws IOException {
        File file = new File(nameOfFile);
        FileInputStream fis = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(nameOfFile);
        zos.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];
        int length;

        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }

        zos.closeEntry();
        fis.close();
    }
}
