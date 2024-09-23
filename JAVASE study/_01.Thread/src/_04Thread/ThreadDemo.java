package _04Thread;

/**
 * 多线程练习2（送礼品）
 * 有100份礼品，两个人同时发送，当剩下的礼品小于十份的时候则不再送出
 */
public class ThreadDemo {
    public static void main ( String[] args ) {
        Gift g1 = new Gift( );
        Gift g2 = new Gift( );
        
        g1.setName( "小红" );
        g2.setName( "小蓝" );
        
        g1.start( );
        g2.start( );
    }
}
