package _05Thread;

import java.util.Random;

public class RedPacket extends Thread {
    static int money = 100;
    Random random = new Random( );
    
    public void run ( ) {
        synchronized ( Object.class ) {
            int get = random.nextInt( money );
            if ( get > 0 ) {
                System.out.println( getName( ) + "抢到了" + get + "元" );
            } else {
                System.out.println( getName( ) + "没抢到红包" );
            }
        }
    }
}
