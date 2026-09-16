package stream02.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class File02 {

    void main() {
        String inputFile = "test06.txt";
        String outputFile = "test07.txt";

        // 입력 파일을 읽어 소문자를 대문자로 바꾼 뒤 출력 파일로 저장하는 메서드 호출
        convertToUpperCase(inputFile, outputFile);
    }

    public static void convertToUpperCase(String inputFile, String outputFile) {

        // try-with-resources 구문을 사용하여 작업 완료 후 FileChannel 자원을 자동으로 닫음
        try (
                FileChannel inChannel = FileChannel.open(
                        // 입력 파일 채널을 읽기READ 전용으로 연다.
                        Path.of(inputFile), StandardOpenOption.READ);

                // 출력 파일 채널을 생성CREATE, 쓰기WRITE, 덮어쓰기TRUNCATE_EXISTING 모드로 연다.
                FileChannel outChannel = FileChannel.open(
                        Path.of(outputFile),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE,
                        StandardOpenOption.TRUNCATE_EXISTING);
        ) {

            // 데이터를 임시로 담을 1024바이트(1KB) 크기의 ByteBuffer를 생성한다.
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // 입력 채널에서 버퍼로 데이터를 읽어온다. 더 이상 읽을 데이터가 없으면(-1 또는 0) 반복문을 종료한다.
            while (inChannel.read(buffer) > 0) {
                buffer.flip();
                for (int i = 0; i < buffer.limit(); i++) {
                    byte b = buffer.get(i);

                    if ((b >= 'a') & (b <= 'z')) {
                        buffer.put(i, (byte) (b - 32));
                    }
                }

                outChannel.write(buffer);
                buffer.clear();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
