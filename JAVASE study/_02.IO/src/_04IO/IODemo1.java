package _04IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {
    public static void main ( String[] args ) throws IOException {
//        FileInputStream fis = new FileInputStream( "./文件复制/Image.png" );
//        FileOutputStream fos = new FileOutputStream( "./src/_04IO/Image.png" );
//
//        int b;
//        while ((b = fis.read(  )) != -1) {
//            fos.write( b );
//        }
//        fos.close();
//        fis.close();
        
        long start = System.currentTimeMillis();
        
        FileInputStream fis = new FileInputStream("./文件复制/四月是你的谎言.mp4" );
        FileOutputStream fos = new FileOutputStream( "./src/_04IO/vedio.mp4" );
        
        byte[] bytes = new byte[5 * 1024 * 1024];
        int len;
        
        while ((len = fis.read(bytes)) != -1)  {
            fos.write( bytes, 0, len );
        }
        
        
        fos.close();
        fis.close();
        
        long end = System.currentTimeMillis();
        System.out.println(end - start );
        // 计算 copy 所花费的时间（单位：毫秒）
    }
}
