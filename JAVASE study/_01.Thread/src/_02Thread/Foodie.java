package _02Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    ArrayBlockingQueue queue;
    
    public Foodie ( ArrayBlockingQueue queue ) {
        this.queue = queue;
    }
    
    @Override
    public void run ( ) {
        while ( true ) {
            try {
                String food = (String) queue.take( );
                // take方法底层同样有锁，所以外面就不用加锁了，锁的嵌套容易导致死锁
                System.out.println( "客人吃了一碗面" );
            } catch ( InterruptedException e ) {
                throw new RuntimeException( e );
            }
        }
    }
}
