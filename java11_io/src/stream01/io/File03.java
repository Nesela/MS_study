package stream01.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File03 {
    void main() {
        try {
            write();
            read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void write() throws IOException {

        FileWriter fw = null;

        fw = new FileWriter("test02.txt");
        fw.write("Hello, World!\n");

        fw.close();

    }

    public static void read() throws IOException {

        FileReader fr = null;

        fr = new FileReader("test02.txt");
        int i = 0;

        while ((i = fr.read()) != -1) {
            IO.println((char) i);
        }

        fr.close();
    }

}
