package ObjectOrientedProgramming;

import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.Objects;

class Circle{
   public double radius;
   public double  area(){
        return Math.PI * radius * radius;
   }public double perimeter(){
       return 2 * Math.PI * radius;
   }public double circumference(){
       return perimeter();
   }
}
class Rectangle{
    int length;
    int breadth;
    double area(){
        return length * breadth;
    }double perimeter(){
        return 2 * (length +breadth);
    }boolean isSquare(){
        return length == breadth;
    }
}

class Cylinder{
    double radius;
    double height;

    double lidArea(){
        return Math.PI * radius * radius;
    }
    double totalSurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    double volume(){
        return lidArea() * height;
    }
    double circumference(){
        return 2 * Math.PI * radius;
    }
}


class Students{
    private int roll;
    private String name;
    String course;
    private int m1, m2, m3;

    public void setRoll(int rollNumber){
        if(roll > 0){
            roll = rollNumber;
        }
    }
    public String setName(String nameStr){
        return name = nameStr;
    }
    public void setMarks(int marks1, int marks2, int marks3){
        m1 = marks1;
        m2 = marks2;
        m3 = marks3;
    }

    int total(){
        return m1 + m2 + m3;
    }
    double average(){
        return (double)total() / 3;
    }
    String grade(){
        if(average() > 60){
            return "A";
        }
        if(total() > 90){
            return "A+";
        }
        return "B";
    }
}


// Constructors
class Ractangle{
    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public  Ractangle(){
        length =1;
        breadth =2;
    }public Ractangle(int l, int b){
        length = l;
        breadth = b;
    }
}

    class Cylinderr{
         int radius;
        private int height;
        public int getRadius(){
            return radius;
        }
        public int setRadius(int r){
            return radius = r;
        }
        public int getHeight(){
            return height;
        }
        public int setHeight(int h){
            return height = h;
        }
        public int dimensions(int radius, int height){
            return radius * height;
        }

        //Constructors
        public Cylinderr(){
            radius = 12;
            height = 20;
        }
        public Cylinderr(int r){
            radius = r;
        }
        public Cylinderr(int radius, int h){
            this.radius = radius;
            height = h;
        }
}


class Product{
    private String itemNo;
    private String name;
    private int price;
    private int quantity;

    //Getters
    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    //Setters
    public void setPrice(int price){
        if(this.price > 20){
            this.price = price;
        }
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Constructors
    public Product(String itemNo){
        this.itemNo = itemNo;
    }
    public Product(String itemNo, String name){
        this.itemNo = itemNo;
        this.name = name;
    }
    public Product(String itemNo, int price, int quantity, String name){
        this.price = price;
        this.itemNo = itemNo;
        this.quantity = quantity;
        this.name = name;
    }

}



class Customer{
    private String CusId;
    private String name;
    private String address;
    private int phoneNo;

    // Getters

    public String getCusId() {
        return CusId;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int phoneNumber(){
        return phoneNo;
    }

    // Setters

    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(int phoneNo){
        this.phoneNo = phoneNo;
    }

    // Constructors

    public Customer(String cusId){
        this.CusId = cusId;
    }
    public Customer(String cusId, String name){
        this.CusId = cusId;
        this.name = name;
    }
     public Customer(String cusId, String name, String address, int phoneNo){
        this.CusId = cusId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
     }
}





class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    // Getters
    public String getSubID(){
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtain(){
        return marksObtain;
    }

    // Setters
    public void setMaxMarks(int maxMarks){
        this.maxMarks = maxMarks;
    }
    public void setMarksObtain(int marksObtain){
        this.marksObtain = marksObtain;
    }

    // Constructors
    public Subject(String subID){
        this.subID = subID;
    }
    public Subject(String subID, String name){
        this.subID = subID;
        this.name = name;
    }
    public Subject(String subID, String name, int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String toString(){
        return "\nSubject ID: "+subID+"\nName: "+name+"\nMax Marks: "+ maxMarks;
    }
}


class Student{
    private int rollNo;
    private String name;
    private String dept;
    private String[] subjects;

    // Getters
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public String[] getSubjects(){
        return subjects;
    }


    // Setters
    public void setSubjects(String ...subjects){
        for(String a : subjects) {
            this.subjects = new String[]{a};
        }
    }

    // Constructors
    public Student(int rollNo){
        this.rollNo = rollNo;
    }
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public Student(int rollNo, String name, String dept, String subjects){
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subjects = new String[]{};
    }

}












public class BasicsofOOPs {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());


        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 20;
        double area = r1.area();
        double perimeter = r1.perimeter();
        boolean isSquare = r1.isSquare();
        System.out.println("The Area is : "+
                area+"and The Perimeter is :"+
                perimeter + "Is Square :"+
                isSquare);


        Cylinder cylinder1 = new Cylinder();
        cylinder1.radius = 7;
        cylinder1.height = 10;
        System.out.println("The Lid Area: "+ cylinder1.lidArea() +
                " The Total Surface Area "+ cylinder1.totalSurfaceArea() +
                " The Volume is: " + cylinder1.volume() +
                " The Circumference is: "+ cylinder1.circumference() );


        Students s1 = new Students();
        s1.setRoll(4144);
        s1.course = "Computer Science";
        s1.setMarks(50, 30, 90);
        System.out.println(" Total Marks of : "+
                s1.setName("Bhavnish Bhardwaj") +"  "+
                s1.total()+ " The Average Marks: "+
                s1.average()+ " The Grade: "+
                s1.grade());


        Ractangle R1 = new Ractangle(10,5);
        System.out.println(R1.getLength());
        System.out.println(R1.getBreadth());




        System.out.println("Cylinderr");

        Cylinderr C1 = new Cylinderr(23, 69);
        Cylinderr C2 = new Cylinderr();
        int radius = C1.getRadius();
        int height = C1.getHeight();

        System.out.println("Radius : "+ radius);
        System.out.println("Height : "+ height);



        System.out.println("Subject");
        Subject subs[] = new Subject[4];
        subs[0] = new Subject("A201", "Bhavnish", 500);
        subs[1] = new Subject("A202", "Ankit", 400);
        subs[2] = new Subject("A203", "Harshita", 300);
        subs[3] = new Subject("A204", "Totra", 200);

        for(Subject s : subs){
            System.out.println(s);
        }












    }

}
