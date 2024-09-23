package _03Thread;

public class Window extends Thread {
    static int ticket = 10;
    
    @Override
    public void run ( ) {
        while ( true ) {
            synchronized ( Object.class ) {
                try {
                    if ( ticket > 0 ) {
                        System.out.println( getName( ) + "窗口卖出了一张票， 还剩" + ticket + "张票" );
                        ticket--;
                        Thread.currentThread( ).sleep( 3000 );
                    } else {
                        break;
                    }
                } catch ( InterruptedException e ) {
                    throw new RuntimeException( e );
                }
            }
        }
    }
}
