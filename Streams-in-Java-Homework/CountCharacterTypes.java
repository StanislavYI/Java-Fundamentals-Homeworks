package StreamsAndFiles;


import java.io.*;

public class CountCharacterTypes {
    private static final String FILE_PATH = "C:\\Users\\slavi\\Desktop\\JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\words.txt";
    private static final String SAVE_PATH = "C:\\Users\\slavi\\Desktop\\JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\count-chars.txt";

    public static void main(String[] args) throws IOException{
        File file = new File(FILE_PATH);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = reader.readLine();

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch == '!' || ch == ',' ||
                    ch == '.' || ch == '?'){
                punctuation++;
            } else if (ch != ' '){
                consonants++;
            }
        }

        File outputFile = new File(SAVE_PATH);

        FileWriter fwriter = new FileWriter(outputFile, true);
        PrintWriter pwriter = new PrintWriter(fwriter, true);

        String output = String.format("Vowels: %d\nConsonants: %d\nPunctuation: %d",
                vowels, consonants, punctuation);

        pwriter.println(output);
    }
}
