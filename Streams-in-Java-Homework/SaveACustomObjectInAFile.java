package StreamsAndFiles;


import java.io.*;

public class SaveACustomObjectInAFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Course course = new Course("Java Fundamentals", 176);

        File file = new File("C:\\Users\\slavi\\Desktop\\" +
                "JavaStreamsAndFilesHomework\\src\\StreamsAndFiles\\course.save");

        ObjectOutputStream outputStream = new ObjectOutputStream(
            new FileOutputStream(file)
        );

        outputStream.writeObject("The name of the course is " + course.getName() +
            " and it has " + course.getNumberOfStudents() + " students.");

        outputStream.flush();

        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(file)
        );

        System.out.println(inputStream.readObject());
    }
}

class Course {
    private String name;
    private int numberOfStudents;

    public Course(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
