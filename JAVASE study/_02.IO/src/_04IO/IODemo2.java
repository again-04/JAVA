package _04IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用try···catch;写文件复制
 */
public class IODemo2 {
    public static void main ( String[] args ) {
        
        long start = System.currentTimeMillis( );
        
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try {
            fis = new FileInputStream( "./文件复制/四月是你的谎言.mp4" );
            fos = new FileOutputStream( "./src/_04IO/vedio.mp4" );
            byte[] bytes = new byte[5 * 1024 * 1024];
            int len;
            while ( ( len = fis.read( bytes ) ) != -1 ) {
                fos.write( bytes, 0, len );
            }
        } catch ( IOException e ) {
            throw new RuntimeException( e );
        } finally {
            if ( fos != null ) {
                try {
                    fos.close( );
                } catch ( IOException e ) {
                    throw new RuntimeException( e );
                }
            }
            if ( fis != null ) {
                try {
                    fis.close( );
                } catch ( IOException e ) {
                    throw new RuntimeException( e );
                }
            }
        }
        
        long end = System.currentTimeMillis( );
        System.out.println( end - start );
        // 计算 copy 所花费的时间（单位：毫秒）
    }
}
