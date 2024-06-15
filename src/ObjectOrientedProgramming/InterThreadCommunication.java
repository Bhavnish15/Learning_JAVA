package ObjectOrientedProgramming;

class MyDataa{
    int value;
    boolean flag = true;
    synchronized public void set(int v){
        while(flag =! true) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
            value = v;
            flag = false;
            notify();
    }
    synchronized public int get(){
        int x = 0;
        x = value;
        return x;
    }
}
class Producer extends Thread{
    MyDataa dataa;
    public Producer(MyDataa d){
        dataa = d;
    }
    public void run(){
        int count = 1;
        while(true){
            dataa.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}
class Consumer extends Thread{
    MyDataa dataa;
    public Consumer(MyDataa d){
        dataa = d;
    }
    public void run(){
        int value;
        while (true){
            value = dataa.get();
            System.out.println("Consumer "+value);
        }
    }
}


public class InterThreadCommunication {
    public static void main(String[] args) {
        MyDataa data = new MyDataa();

        Producer p = new Producer(data);
        Consumer m = new Consumer(data);
        p.start();
        m.start();


    }
}
