package _04Thread;

public class Gift extends Thread {
    static int gift = 100;
    
    @Override
    public void run ( ) {
        while ( true ) {
            synchronized ( Object.class ) {
                if ( gift > 10 ) {
                    System.out.println( getName( ) + "送出了一份礼品，还剩" + gift + "份礼品" );
                    gift--;
                } else {
                    break;
                }
            }
        }
    }
}
