```
线程池
之前写多线程的弊端，需要用到线程的时候就创建，用完后就消失，很浪费操作系统的资源
线程池的主要核心原理
1、创建线程池
2、提交任务
3、所有任务全部执行完毕，关闭线程池

创建线程池
public static ExecutorService newCachedThreadPool()
创建一个没有上限的线程池
public static ExecutorService newFixedThreadPool(int nThreads)
创建有上限的线程池
```