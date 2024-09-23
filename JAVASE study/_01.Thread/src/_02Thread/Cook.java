package _02Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {
    ArrayBlockingQueue< String > queue;
    
    public Cook ( ArrayBlockingQueue< String > queue ) {
        this.queue = queue;
    }
    
    @Override
    public void run ( ) {
        while ( true ) {
            try {
                queue.put( "面条" );
                // 不需要使用锁，队列内部有锁，锁被拿到后，队列会一直判断队列是否是满的，当队列
                // 不是满的的时候，会结束循环，然后释放锁
                System.out.println( "厨师制作了一碗面条" );
            } catch ( InterruptedException e ) {
                throw new RuntimeException( e );
            }
            
        }
    }
}
