package five_main_ways_create_objcet;

import java.io.*;

public class UsingDeserialization implements Serializable
{
    void meth()
    {
        System.out.println("Meth Called using Deserialization Object");
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        //serializable
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(new UsingDeserialization());
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"));
        UsingDeserialization obj = (UsingDeserialization) in.readObject();
        obj.meth();
    }
}
