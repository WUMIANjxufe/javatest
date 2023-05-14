package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/*
* 多线程的第三种实现方式：
* 特点：可以获取多线程运行的结果
* 1、创建一个类MyCallable实现Callable接口
* 2、重写call（是有返回值的，表示多线程运行的结果）
* 3、创建MyCallable的对象（表示多线程要执行的任务）
* 4、创建FutureTask的对象（作用管理多线程运行的结果）
* 5、创建Thread类的对象，并启动（表示线程）
*
* * 优点扩展性强，实现该接口的同时还可以继承其他的类
 * 缺点编程相对复炸，不能直接使用Thraed类中的方法
* */
public class CallableDemo {
    public static void main(String[] args) {
        //创建MyCallable的对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();
        //创建FutureTask的对象（作用管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程的对象
        Thread t1 = new Thread(ft);
        //启动线程
        t1.start();
        //获取多线程运行的结果
        Integer result = null;
        try {
            result = ft.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);
    }
}
class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        //求1——100之间的和
        int sum = 0;
        for (int i = 0;i<=100;i++){
            sum=sum+i;
        }
        return sum;
    }
}