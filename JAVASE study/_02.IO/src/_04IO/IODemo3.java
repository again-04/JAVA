package _04IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用AutoCloseable
 */
public class IODemo3  {
    public static void main ( String[] args ) throws FileNotFoundException {
        
        long start = System.currentTimeMillis( );
        
        FileInputStream fis = new FileInputStream( "./文件复制/四月是你的谎言.mp4" );
        FileOutputStream fos = new FileOutputStream( "./src/_04IO/vedio.mp4" );
        
        try (fis; fos){
            byte[] bytes = new byte[5 * 1024 * 1024];
            int len;
            while ( ( len = fis.read( bytes ) ) != -1 ) {
                fos.write( bytes, 0, len );
            }
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        }
        
        long end = System.currentTimeMillis( );
        System.out.println( end - start );
        // 计算 copy 所花费的时间（单位：毫秒）
    }
}
