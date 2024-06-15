package ObjectOrientedProgramming;

interface Test {
    void test1();
    void test2();
}
class testClass implements Test{
    public void test1(){
        System.out.println("test1 of testClass");
    }
    public void test2(){
        System.out.println("test2 of testClass");
    }
}




class Phone {
    public void call(){System.out.println("Calling a phone call");}
    public void sms(){System.out.println("sending an sms...");}
}
interface ICamera{ void click(); void record();}
interface iMusicPlayer{ void play();void stop();}
class SmartPhone extends Phone implements ICamera, iMusicPlayer{
    public void videoCall(){System.out.println("smartphone is video calling");}
    public void click(){System.out.println("smartphone is clicking photos");}
    public void record(){System.out.println("smartphone is recording video");}
    public void play(){System.out.println("Playing music");}
    public void stop(){System.out.println("Stop playing music");}
}

interface Member{ void Callback(); }
class Customers implements Member{
    String name;
    Customers(String n){
        name = n;
    }
    public void Callback(){
        System.out.println("Ok, I will visit"+ name);
    }
}
class Store{
    Member mem[] = new Member[10];
    int count = 0;
    void register(Member m){
        mem[count++] = m;
    }
    void inviteSale(){
        for(int i = 0; i < count; i++){
            mem[i].Callback();
        }
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Test test = new testClass();
        test.test1();
        test.test2();

        ICamera SmartPhone1 = new SmartPhone();
        SmartPhone1.click();
        SmartPhone1.record();

        Store s = new Store();
        Customers c1 = new Customers(" Bhavnish");
        Customers c2 = new Customers(" Totra");
        s.register(c1);
        s.register(c2);
        s.inviteSale();

    }
}
