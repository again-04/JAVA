package _07IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class IODemo3 {
    public static void main ( String[] args ) throws IOException {
        FileReader fr = new FileReader( "./src/_07IO/修改/新建 文本文档.txt" );
        StringBuilder sb = new StringBuilder( );
        
        int ch;
        while ( ( ch = fr.read( ) ) != -1 ) {
            sb.append( (char) ch );
        }
        fr.close( );
        
        String str = sb.toString( );
        System.out.println( str );
        String[] arrStr = str.split( "-" );
        
        ArrayList< Integer > list = new ArrayList<>( );
        for ( String s : arrStr ) {
            int i = Integer.parseInt( s );
            list.add( i );
        }
        
        Collections.sort( list );
        
        FileWriter fw = new FileWriter( "./src/_07IO/修改/res.txt" );
        for ( int i = 0; i < list.size( ); i++ ) {
            if ( i == list.size( ) - 1 ) {
                fw.write( list.get( i ) + "");
            } else {
                fw.write( list.get( i ) + "-" );
                System.out.println( i );
            }
        }
        fw.close( );
    }
}
