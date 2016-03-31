package StreamsAndFiles;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Double> list = new ArrayList<>();
        list.addAll(Arrays.asList(0.5, 9.8, 5.6, 7.9, 12.32));

        File file = new File("C:\\Users\\slavi\\Desktop\\" +
                "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\doubleS.list");

        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(file)
        );

        String str = String.valueOf(list);
        outputStream.writeObject(str);
        outputStream.flush();

        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(file)
        );

        System.out.println(String.valueOf(inputStream.readObject()));
    }
}
