package Day10;

import java.io.*;

public class SerializableMain {
    public static  void write() throws IOException {
        File file = new File("C:\\Users\\srika\\OneDrive\\Desktop\\Workspace\\Java\\Day10\\temp.txt");
        Student student = new Student("Mohit","1","1");

        //we specify file to write to in outputStream
        OutputStream outputStream = new FileOutputStream(file);
//        outputStream.write(4);


        //ObjectOutputStream needs outputStream to write to

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(student);

    }

    public static void read() throws IOException, ClassNotFoundException {
        //read from  a file

        //read the object from the file
        File file = new File("C:\\Users\\srika\\OneDrive\\Desktop\\Workspace\\Java\\Day10\\temp.txt");
        InputStream inputStream = new FileInputStream(file);

        //to read an object from a file
        @SuppressWarnings("resource")
        ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);

        //
        Student student = (Student) inputStream1.readObject();

       System.out.println(student);
        System.out.println("hello");

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();

    }
}