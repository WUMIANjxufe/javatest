package com.example.thread;
/*
* Thread
*优点编程比较简单，可以直接使用Thread类中的方法
* 缺点：可扩展性较差，不能再继承其他的类
* */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i =0;i<100;i++){
            System.out.println(getName()+"HelloWorld");
        }
    }
}
