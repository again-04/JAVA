package _07Thread;

import java.lang.reflect.Executable;
import java.util.concurrent.*;

public class ThreadDemo {
    public static void main ( String[] args ) {
//        ExecutorService pool1 = Executors.newFixedThreadPool( 3 );
//        // 获取线程池对象
//        pool1.submit( new MyRunnable( ) );
//        // 提交任务
//        pool1.shutdown( );
//        // 销毁线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,
                // 核心线程数量，能小于0
                6,
                // 最大线程数量，不能小于0和核心线程数量
                60,
                // 空闲线程最大存活时间
                TimeUnit.SECONDS,
                // 时间单位
                new ArrayBlockingQueue<>( 3 ),
                // 任务队列
                Executors.defaultThreadFactory( ),
                // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy( )
        );
        
    }
}
