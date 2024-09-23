package _02Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main ( String[] args ) {
        ArrayBlockingQueue<String>queue = new ArrayBlockingQueue<>( 1 );
        // 创建阻塞队列对象
        // ArrayBlockingQueue底层是数组，所以需要指定队列长度
        
        Cook cook = new Cook( queue );
        Foodie foodie = new Foodie( queue );
        // 创建线程对象，并传入阻塞队列
        
        cook.start();
        foodie.start();
        // 开启线程
    }
}
