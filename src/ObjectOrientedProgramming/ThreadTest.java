package ObjectOrientedProgramming;

import javax.swing.text.TabSet;

// With Using Thread Class
class MyThread extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

// With Using Runnable Interface
class Tests implements Runnable{
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i+ "  Hello");
            i++;
        }
    }
}



public class ThreadTest {
    public static void main(String[] args) {
        Tests t = new Tests();
        Thread t2 = new Thread(t);
        t2.start();
//        MyThread m = new MyThread();
//        m.start();

        int i = 0;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}
