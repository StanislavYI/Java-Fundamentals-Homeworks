package StreamsAndFiles;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class CopyJpgFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\slavi\\Desktop\\" +
                "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\grey,mary.jpg");
        File destinationFile = new File("C:\\Users\\slavi\\Desktop\\" +
                "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\new-image-file.jpg");

        FileInputStream fis;
        FileOutputStream fos;

        int buffer;

        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(destinationFile);

            while ((buffer = fis.read()) != -1) {
                fos.write(buffer);
            }

            //byte[] fileContent = Files.readAllBytes(file.toPath());

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
