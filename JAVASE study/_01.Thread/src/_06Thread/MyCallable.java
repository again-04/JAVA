package _06Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable< Integer > {
    ArrayList< Integer > list;
    
    public MyCallable ( ArrayList< Integer > list ) {
        this.list = list;
    }
    
    @Override
    public Integer call ( ) throws InterruptedException {
        ArrayList< Integer > box = new ArrayList<>( );
        while ( true ) {
            synchronized ( MyCallable.class ) {
                if ( list.size( ) == 0 ) {
                    System.out.println( Thread.currentThread( ).getName( ) + box );
                    break;
                } else {
                    Collections.shuffle( list );
                    Integer price = list.remove( 0 );
                    box.add( price );
                }
            }
            Thread.sleep( 10 );
        }
        if ( box.size( ) == 0 ) {
            return null;
        } else {
            return Collections.max( box );
        }
    }
}
