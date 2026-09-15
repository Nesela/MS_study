package stream01.io;

import javax.annotation.processing.Filer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File02 {
    void main() {
        write();
        read();
    }

    public static void write() {
        // FileWriter
        /*
        java.lang.Object
            java.io.Writer
                java.io.OutputStreamWriter
                    java.io.FileWriter
         */
        FileWriter fw = null;

        try {
            fw = new FileWriter("test01.txt");
            fw.write("Hello, World!\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                    IO.println("write complete");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void read() {
/*
        java.lang.Object
          java.io.Reader
            java.io.InputStreamReader
              java.io.FileReader
 */
        FileReader fr = null;

        try {
            fr = new FileReader("test01.txt");
            int i = 0;

            // InputStreamReader
            // read() : The character read, or -1 if the end of the stream has been reached
            while ((i = fr.read()) != -1 ) {
                IO.println((char)i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            IO.println("read complete");
        }
    }

}
