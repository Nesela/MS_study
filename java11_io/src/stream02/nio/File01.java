package stream02.nio;

import java.nio.ByteBuffer;

public class File01 {
    void main() {
        bufferTest();
    }
    public static void bufferTest() {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        IO.println("1. buffer 초기상태!");
        prn(buffer);

        buffer.put((byte)'A');
        buffer.put((byte)'B');
        buffer.put((byte)'C');
        buffer.put((byte)'D');

        IO.println("2. buffer에 값 4개 들어감!");
        prn(buffer);

        // buffer를 읽기모드로 바꿔주는 메소드 : flip
        buffer.flip();
        IO.println("3. buffer를 읽기모드로 변환!");
        prn(buffer);

        while (buffer.hasRemaining()) {
            IO.println(buffer.get());
            IO.println("4. buffer에서 값 읽어옴!");
            prn(buffer);
        }

        IO.println("5. 끝");
        prn(buffer);
    }


    public static void prn(ByteBuffer buffer){
        IO.println("capacity : " + buffer.capacity());
        IO.println("position : " + buffer.position());
        IO.println("limit    : " + buffer.limit());
    }
}
