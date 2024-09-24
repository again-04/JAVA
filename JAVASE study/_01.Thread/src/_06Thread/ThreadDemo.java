package _06Thread;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 抽奖，比较哪个线程抽到的奖最大
 */
public class ThreadDemo {
    public static void main ( String[] args ) throws ExecutionException, InterruptedException {
        ArrayList< Integer > list = new ArrayList<>( );
        Collections.addAll( list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700 );
        
        MyCallable mc = new MyCallable( list );
        FutureTask< Integer > ft1 = new FutureTask<>( mc );
        FutureTask< Integer > ft2 = new FutureTask<>( mc );
        
        Thread t1 = new Thread( ft1 );
        Thread t2 = new Thread( ft2 );
        
        t1.start( );
        t2.start( );
        
        System.out.println( ft1.get() );
        System.out.println( ft2.get() );
    }
}
