package stream02.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class File03 {
    void main() {
        readFromPosition("test08.txt");
    }

    public static void readFromPosition(String fileName) {
        try (FileChannel channel = FileChannel.open(Path.of(fileName), StandardOpenOption.READ)){

            // The new position, a non-negative integer counting the number of bytes from the beginning of the file
            channel.position(5);

            ByteBuffer buffer = ByteBuffer.allocate(20);

            int read = channel.read(buffer);
            IO.println("read byte : " + read);

            buffer.flip();

            while (buffer.hasRemaining()) {
                IO.println((char) buffer.get());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
