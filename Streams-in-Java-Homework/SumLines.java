package StreamsAndFiles;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(
                new FileReader("C:\\Users\\slavi\\Desktop\\JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\lines.txt"));

        String line = fileReader.readLine();

        while (line != null) {
            int sum = 0;

            for (int i = 0; i < line.length(); i++) {
                sum += line.charAt(i);
            }

            System.out.println(sum);
            line = fileReader.readLine();
        }
    }
}
