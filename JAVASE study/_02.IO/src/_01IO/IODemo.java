package _01IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
    public static void main ( String[] args ) throws IOException {
        FileOutputStream fos = new FileOutputStream( "./src/_01IO/a" );
        fos.write( 97 );
        // 一次一个字节
        byte[] bytes = {'\n', 97, 98, 99, 100};
        fos.write( bytes );
        // 一次一个字节数组
        fos.write( bytes, 0, 3 );
        // 一次一个字节数组的部分数据，off为起始索引，len为字节个数
        fos.close( );
    }
}
