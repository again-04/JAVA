package _07IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class IODemo4 {
    public static void main ( String[] args ) throws IOException {
        FileReader fr = new FileReader( "./src/_07IO/修改/新建 文本文档.txt" );
        StringBuilder sb = new StringBuilder( );
        
        int ch;
        while ( ( ch = fr.read( ) ) != -1 ) {
            sb.append( (char) ch );
        }
        fr.close( );
        
        Integer[] arr = Arrays.stream( sb.toString( ).split( "-" ) )
                .map( Integer::parseInt )
                .sorted( )
                .toArray( Integer[]::new );
        FileWriter fw = new FileWriter( "./src/_07IO/修改/res.txt" );
        String s = Arrays.toString( arr ).replace( "， ", "-" );
        String result = s.substring( 1, s.length() - 1 );
        fw.write( result );
        fw.close();
    }
}
