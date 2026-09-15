package stream01.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File04 {
    void main() {
        write();
        read();
    }

    public static void write() {

        try (FileWriter fw = new FileWriter("test03.txt")) {
            fw.write("Hello, World!\n");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {

        try (FileReader fr = new FileReader("test03.txt")) {
            int i = 0;

            while ((i = fr.read()) != -1) {
                IO.print((char) i);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
