package FlyBirds;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.Random;

public class Column {
    //图片
    BufferedImage image;
    //位置
    int x, y;
    //宽高
    int width, height;
    //柱子间缝隙
    int gap;
    //柱子间距离
    int distance;
    //随机数工具
    Random random = new Random( );
    
    /**
     * 初始化第n个柱子
     */
    public Column ( int n ) throws Exception {
        try ( InputStream is = ClassLoader.getSystemClassLoader( ).getResourceAsStream( "FlyBirds/飞翔的小鸟项目素材/column.png" ) ) {
            image = ImageIO.read( is );
        }
        width = image.getWidth( );
        height = image.getHeight( );
        gap = 144;
        distance = 245;
        x = 550 + ( n - 1 ) * distance;
        y = random.nextInt( 218 ) + 132;
    }
    
    //向左移动一步
    public void step ( ) {
        x--;
        if ( x == -width / 2 ) {
            x = distance * 2 - width / 2;
            y = random.nextInt( 218 ) + 132;
        }
    }
}