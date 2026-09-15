package stream01.io;

import java.io.File;

public class File01 {
    void main() {
        walkingDirectory();
    }

    public static void walkingDirectory() {
        /*

          / : 최상위 폴더(디렉토리) = root
         ./ : 현재 폴더 (디렉토리)
        ../ : 상위 폴더 (디렉토리)

         */

        File root = new File("/");
        if (!root.exists()) {
            IO.println("해당 폴더 (디렉토리) 가 존재하지 않습니다!!");
            return;
        }
        File[] files = root.listFiles();
        if (files != null){
            for (File f : files) {
                if (f.isDirectory()) {
                    IO.println("[DIR] :" + f.getName());
                } else if (f.isFile()) {
                    IO.println("[FILE] : " + f.getName());
                }
            }
        }
    }
}
