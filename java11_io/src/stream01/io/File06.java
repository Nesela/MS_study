package stream01.io;

import javax.swing.plaf.basic.BasicBorders;
import java.io.*;
import java.util.List;

/*
[Input/Output}Stream 분류
    - 종류
        Byte Streams : 이미지, 영상 ...(이진 데이터) -> byte 단위로 처리
        Character Streams : 텍스트 데이터 (문자형 데이터) -> 문자 단위로 처리 + encoding 고려 (Reader / Writer)
   - 역할
        기본 스트림 : data / destination / resource 등에 직접 연결 (file, network, ...)
        보조 스트림 : 기본트스림에 추가적인 기능 -> stream chaining
                                       ex) new BufferedReader(new FileReader(file));
 */

public class File06 {
    void main() {
//        write();
//        writeList();
//        read();
        writeUsingBuffer();
//        readUsingBuffer01();
        readUsingBuffer02();
    }

    public static void readUsingBuffer02() {
        try (BufferedReader br = new BufferedReader(new FileReader("test05.txt"))) {
            // br.lines()
            // public Stream<String> lines()
            br.lines().forEach(IO::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readUsingBuffer01() {
        try (BufferedReader br = new BufferedReader(new FileReader("test05.txt"))) {
//            int i = 0;
            String str = null;

            // br.readLine()
            // while((i = fr.read())!=-1{
            // public String readline() throws IOException
            while ((str = br.readLine())  != null) {
                IO.print(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeUsingBuffer() {
        var messages = List.of("Hello\n", "World\n", "java\n");


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test05.txt", true))) {
            for (String message : messages) {
                bw.write(message);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

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