package _02IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
    public static void main ( String[] args ) throws IOException {
        FileOutputStream fos1 = new FileOutputStream( "./src/_02IO/a.txt" );
        String out = "I like JAVA";
        byte[] bytes = out.getBytes( );
        fos1.write( bytes );
        
        out = "\nI like C++";
        bytes = out.getBytes( );
        fos1.write( bytes );
        
        fos1.close( );
        
        FileOutputStream fos2 = new FileOutputStream( "./src/_02IO/a.txt", true );
        // 续写
        out = "\nI like C++";
        bytes = out.getBytes( );
        fos2.write( bytes );
        fos2.close();
    }
}
