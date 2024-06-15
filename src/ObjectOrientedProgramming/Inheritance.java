package ObjectOrientedProgramming;


class Account{
    private int accNo;
    private int phoneNo;
    private String name;
    private String address;
    //getters
    public int getAccNo(){
        return accNo;
    }
    public int getPhoneNo(){
        return phoneNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    //Setters
    public void setAddress(String address){
        this.address = address;
    }

    // Constructors
    public Account(int accNo, int phoneNo, String name){
        this.accNo = accNo;
        this.phoneNo = phoneNo;
        this.name = name;
    }
    public Account(){

    }
}
class SavingsAccounts extends Account{
    int amount;

    public void deposit(int accNo, int amount){
        accNo = getAccNo();
        this.amount = amount;
        System.out.println(amount  + " is Deposited to account number : "+ accNo);
    }
    public void withdrawl(int accNo, int withdrwal_amount){
        accNo = getAccNo();
        amount = amount - withdrwal_amount;
        System.out.println(withdrwal_amount+" Amount is successfully withdrwal from "+ accNo);
        System.out.println("Your Balance now is "+ amount);
    }
    public void fixedDeposite(int accNo, int deposit_Amount){
        accNo = getAccNo();
        String name = getName();
        amount += deposit_Amount;
        System.out.println("Amount is successfully deposited to "+ name + "account");
        System.out.println("Your Balance now is "+ amount);
    }

}
class LoanAmount extends Account{
     public void payEMI(int emiAmount, String name, int amount){
         int accountNumber = getAccNo();
         name = getName();
         amount -= emiAmount;
         System.out.println("Mr. "+name+ "You have to pay "+ emiAmount + "as your EMI"+ " ");
         System.out.println("Now Your Balance is "+ amount);
     }
}
class Parent{
    Parent(){
        System.out.println("Parent Class Constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Class Constructor");
    }
}
class GrandChild extends Child{
    GrandChild(){
        System.out.println("Grand Child Constructor");
    }
}

class Rectangles{
    int length;
    int breadth;
    int x = 10;
    Rectangles(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class Cuboid extends Rectangles{
    int height;
    int x = 20;
    Cuboid(int l, int b, int h){
        super(l,b);
        height = h;
    }
    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}







class Super{
    public void display(){
        System.out.println("Super class Display");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Sub class Display");
    }
}


class TV{
    public void switchON(){
        System.out.println("TV is Switched On...");
    }
    public void ChangeChannel(){
        System.out.println("TV channel is changing...");
    }
}
class SmartTV extends TV{
    public void switchON(){
        System.out.println("SmartTv is Switched on...");
    }
    public void ChangeChannel(){
        System.out.println("SmartTV Channel is Changing");
    }
}






public class Inheritance {
    public static void main(String[] args){




//        Account A1 = new Account(4001, 767364334, "Bhavnish Bhardwaj");
//        Account A2 = new Account(4002, 54353434, "Gajraj Singh");
//        A1.setAddress("Jaipur, Rajasthan, India");
//
//        SavingsAccounts A3 = new SavingsAccounts();
//        A3.deposit(4, 3000);
//        A3.withdrawl(44, 1000);
//        A3.fixedDeposite(44, 5000);
//
//        LoanAmount A4 = new LoanAmount();
//        A4.payEMI(2000, "Bhavnish Bhardwaj", 500);

//        GrandChild G1 = new GrandChild();

//         Cuboid c1 = new Cuboid(4,5,6);
//         c1.display();

//        Super s1 = new Sub();
//        s1.display();
//        Sub s2 = new Sub();
//        s2.display();


//        TV t1 = new SmartTV();
//        t1.switchON();
//        t1.ChangeChannel();
//
//        SmartTV smartTv = new SmartTV();
//        smartTv.switchON();
//        smartTv.ChangeChannel();



    }
}
