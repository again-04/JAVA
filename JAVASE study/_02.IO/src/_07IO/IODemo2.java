package _07IO;

import java.io.*;

public class IODemo2 {
    public static void main ( String[] args ) throws IOException {
        // 加密
//        FileInputStream fis = new FileInputStream( "./src/_07IO/加密/Image.png" );
//        FileOutputStream fos = new FileOutputStream( "./src/_07IO/加密/AfterImage.png" );
        // 解密
        FileInputStream fis = new FileInputStream( "./src/_07IO/加密/AfterImage.png" );
        FileOutputStream fos = new FileOutputStream( "./src/_07IO/加密/ResImage.png" );
        int b;
        while ( ( b = fis.read( ) ) != -1 ) {
            fos.write( b ^ 2 );
        }
        fos.close( );
        fis.close( );
    }
}
