package _03Thread;

/**
 * 多线程练习1（卖电影票）
 * 一共1000张电影票，可以在两个窗口购买，每次购买的时间为3000millis
 */
public class ThreadDemo {
    public static void main ( String[] args ) {
        Window w1 = new Window();
        Window w2 = new Window();
        
        w1.setName( "a" );
        w2.setName( "b" );
        
        w1.start();
        w2.start();
    }
}
