package stream01.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class File05 {
    void main() {
//        write();
        writeList();
        read();
    }

    public static void writeList() {
        var messages = List.of("Hello\n", "World\n", "java\n");

        try (FileWriter fw = new FileWriter("test04.txt", true)) {
            for (String message : messages) {
                fw.write(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write() {

        try (FileWriter fw = new FileWriter("test04.txt", true)) {
            fw.write("Hello, World!\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {

        try (FileReader fr = new FileReader("test04.txt")) {
            int i = 0;

            while ((i = fr.read()) != -1) {
                IO.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}