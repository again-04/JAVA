package _07IO;

import java.io.*;

public class IODemo1 {
    public static void main ( String[] args ) throws IOException {
        File src = new File( "./文件复制" );
        File dest = new File( "./src/_07IO/dest" );
        
        copyDir( src, dest );
    }
    
    private static void copyDir ( File src, File dest ) throws IOException {
        dest.mkdirs();
        // 文件不存在就直接创建
        
        File[] files = src.listFiles( );
        for ( File file : files ) {
            if ( file.isFile( ) ) {
                FileInputStream fis = new FileInputStream( file );
                FileOutputStream fos = new FileOutputStream( new File( dest, file.getName( ) ) );
                
                byte[] bytes = new byte[1024];
                int len;
                while ( ( len = fis.read( bytes ) ) != -1 ) {
                    fos.write( bytes, 0, len );
                }
                fos.close( );
                fis.close( );
            } else {
                copyDir( file, new File(dest, file.getName()) );
            }
        }
    }
}
