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

线程池细节
1、创建一个池子，创建完的时候池子里面是空的
2、提交任务时，池子会创建新的线程对象，任务执行完毕，线程归还给池子，下回再提交任务时，不需要创建新的线程，直接复用已有的线程即可
3、但是如果提交任务时，池子中没有空闲线程，也无法创建新的线程，任务就会排队等待。
```



```
自定义线程池
ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(核心线程数量，最大线程数量，空闲线程最大存活时间，任务队列，创建线程工厂，任务的拒绝策略)

任务不一定先提交先执行

任务拒绝策略
1、ThreadPoolExecutor.AbortPolicy 
默认策略：丢弃任务并抛出RejectedExecutionException异常
2、ThreadPoolExecutor.DiscardPolicy
丢弃任务，但是不抛出异常，这是不推荐的做法
3、ThreadPoolExecutor.DiscardOldestPolicy
抛弃队列中等待最久的任务，然后把当前任务加入队列中
4、ThreadPoolExecutor.CallerRunPolicy
调用任务的run()方法绕过线程池直接执行
```

