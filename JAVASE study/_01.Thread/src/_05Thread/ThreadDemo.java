package _05Thread;

public class ThreadDemo {
    public static void main ( String[] args ) {
        RedPacket r1 = new RedPacket( );
        RedPacket r2 = new RedPacket( );
        RedPacket r3 = new RedPacket( );
        RedPacket r4 = new RedPacket( );
        RedPacket r5 = new RedPacket( );
        
        r1.start( );
        r2.start( );
        r3.start( );
        r4.start( );
        r5.start( );
    }
}
