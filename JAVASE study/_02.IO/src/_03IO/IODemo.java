package _03IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IODemo {
    public static void main ( String[] args ) throws IOException {
        FileInputStream fis1 = new FileInputStream( "./src/_03IO/a.txt" );
        int byte1 = fis1.read();
        System.out.println( (char)byte1 );
        fis1.close();
        // 读取一个字节
        
        FileInputStream fis2 = new FileInputStream( "./src/_03IO/a.txt" );
        int byte2;
        while ((byte2 = fis2.read(  )) != -1) {
            System.out.print( (char)byte2 );
        }
        fis2.close();
        // 循环读取
    }
}
