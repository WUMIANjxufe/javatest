package com.example.thread;
/*
*
* runnable
* 1.自己定义一个类实现Runnable接口
* 2.重写run方法
* 3.创建自己的类的对象
* 4.创建一个Thread类的对象，开启线程
*
* 优点扩展性强，实现该接口的同时还可以继承其他的类
* 缺点编程相对复炸，不能直接使用Thraed类中的方法
* */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable printA = new PrintChar('a',100);
        Runnable printB = new PrintChar('b',100);
        Runnable print100 = new PrintNum(100);
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class PrintChar implements Runnable{
    private char charToPrint;
    private int times;
    public PrintChar(char c,int t){
        charToPrint = c;
        times = t;
    }
    @Override
    public void run() {
        for (int i = 0;i<times;i++){
            System.out.print(charToPrint);
        }
    }
}
class PrintNum implements Runnable{
    private int lastNum;
    public PrintNum(int n){
        lastNum = n;
    }
    @Override
    public void run() {
        for (int i =0 ;i<=lastNum;i++){
            System.out.print(" "+i);
        }
    }
}
