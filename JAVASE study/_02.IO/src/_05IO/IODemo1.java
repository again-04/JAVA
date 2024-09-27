package _05IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class IODemo1 {
    public static void main ( String[] args ) throws IOException {
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes( );
        // 编码，默认UTF-8
        System.out.println( Arrays.toString( bytes1 ) );
        
        bytes1 = str.getBytes( "GBK" );
        System.out.println( Arrays.toString( bytes1 ) );
        
        bytes1 = str.getBytes( );
        
        str = new String( bytes1 );
        System.out.println( str );
        // 解码
        
        str = new String( bytes1, "GBK" );
        System.out.println( str );
    }
}
