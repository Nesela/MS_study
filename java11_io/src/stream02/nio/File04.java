package stream02.nio;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class File04 {
    void main() {
        copyFile("test08.txt", "test09.txt");
    }

    public static void copyFile(String inputFile, String outputFile) {
        try (
                FileChannel original = FileChannel.open(Path.of(inputFile), StandardOpenOption.READ);

                FileChannel copy = FileChannel.open(
                        Path.of(outputFile),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE,
                        StandardOpenOption.TRUNCATE_EXISTING


                )) {
            // public abstract long transferTo(long position,long count,WritableByteChannel target)throws IOException
            original.transferTo(0, original.size(), copy);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}