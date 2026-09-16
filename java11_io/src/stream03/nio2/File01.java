package stream03.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File01 {
    void main() {
        walkingDir();
    }

    public static void walkingDir() {
        /*
            /   : root (최상위
            ./  : 현재 위치
            ../ : 상위

         */
        Path startPath = Paths.get("./");

        try (Stream<Path> stream = Files.walk(startPath)){

            stream.forEach(path -> {
                String type = Files.isDirectory(path) ? "[d]" : "[f]";
                int depth = path.getNameCount() - startPath.getNameCount();
                IO.println("\t".repeat(Math.max(0, depth)) + type + " " + path.getFileName());
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*

io   : input /output stream
nio  : new io
nio2 : nio ver.2 -> nio 확장 (file, directory 관련 기능 추가)

io                        nio                        nio
- stream                - channel / buffer           - java.nio.file
- input / output        - read / write               - Path / Files
- blocking io 중심       - blocking / non-blocking    -

* blocking : thread 1 -> connection 1
  non-blocking : thread 1 -> channel +

 */