package StreamsAndFiles;


import java.io.*;
import java.util.ArrayList;

public class AllCapitals {
    public static void main(String[] args) throws IOException{
        File file = new File(
                "C:\\Users\\slavi\\Desktop\\JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\lines.txt");

        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        String line = fileReader.readLine();
        ArrayList<String> allUpper = new ArrayList<>();

        while (line != null) {
            allUpper.add(line.toUpperCase());
            line = fileReader.readLine();
        }

        FileWriter fwriter = new FileWriter(file, false);
        PrintWriter pwriter = new PrintWriter(fwriter, true);

        for (int i = 0; i < allUpper.size(); i++) {
            pwriter.println(allUpper.get(i));
        }

        pwriter.close();
    }
}
