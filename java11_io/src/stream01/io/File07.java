package stream01.io;

import java.io.*;

public class File07 {
    void main() {
        String fileName = "a.png";

        String currentDir = System.getProperty("user.dir");
        IO.println(currentDir);

        byte[] imageBytes = readImage(fileName);

        if (imageBytes != null) {
            writeIamge(imageBytes, "b.png");
        }
    }

    public static void writeIamge(byte[] bytes, String fileName){
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName))) {

            bos.write(bytes);

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static byte[] readImage(String fileName) {

        // BufferedInputStream(FileInputStream)

        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(fileName)
        )){
            byte[] bytes = bis.readAllBytes();
            IO.println(fileName + " \t length : " + bytes.length);

            return bytes;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
