package ObjectOrientedProgramming;
abstract class Superr{public Superr(){System.out.println("Super Constructor");}abstract public void meth2();}
class Subs extends Superr{ public void meth2(){System.out.println("meth2 of sub class");}}


abstract class Shape{
    abstract public double perimeter(double r);
    abstract public int area(int length, int breadth);
}

class Circlee extends Shape{
    public double perimeter(double r){
        return 2 * 3.14 * r * r;
    }
    public int area(int length, int breadth){
        return length * breadth;
    }
}






public class AbstractClasses {
    public static void main(String[] args) {
//        Superr s1 = new Subs();
//        s1.meth2();


        Shape shape1 = new Circlee();
       double result1 = shape1.perimeter(8.2);
        int result = shape1.area(4,3);
        System.out.println(result);
        System.out.println(result1);
    }
}
