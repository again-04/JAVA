package FlyBirds;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

public class Ground {
    //图片
    BufferedImage image;
    //位置
    int x, y;
    //宽高
    int width, height;
    
    //初始化地面
    
    public Ground ( ) throws Exception {
        InputStream is = ClassLoader.getSystemClassLoader( ).getResourceAsStream( "FlyBirds/飞翔的小鸟项目素材/ground.png" );
        image = ImageIO.read( is );
        width = image.getWidth( );
        height = image.getHeight( );
        x = 0;
        y = 500;
    }
    
    //向左移动一步
    public void step ( ) {
        x--;
        if ( x == -109 ) {
            x = 0;
        }
    }
}