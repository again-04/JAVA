package _06IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo1 {
    public static void main ( String[] args ) throws IOException {
        FileReader fr = new FileReader( "./src/_06IO/a.txt" );
        FileWriter fw = new FileWriter( "./src/_06IO/b.txt" );
        
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            fw.write( ch );
//        }
        
        int len ;
        char [] chars = new char[2];
        while ((len = fr.read( chars)) != -1) {
            fw.write( chars, 0, len );
        }
        
        fw.close();
        fr.close();
    }
}
