package ObjectOrientedProgramming;

class MyData{
   synchronized public void display(String s){

            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }

    }
}
class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d = d;
    }
    public void run(){
        d.display("Hello World");
    }
}
class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d = d;
    }
    public void run(){
        d.display("Welcome all");
    }
}

public class Synchronisations {
    public static void main(String[] args) {
        MyData d = new MyData();

        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();

    }
}
