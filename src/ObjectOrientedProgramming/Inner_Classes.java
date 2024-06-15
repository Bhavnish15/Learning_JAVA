package ObjectOrientedProgramming;

//class Outer{
//    int x = 34;
//    class Inner{
//        int y = 22;
//        public void innerDisplay(){
//            System.out.println(x+" "+y);
//        }
//    }
//    public void outerDisplay(){
//        Inner i = new Inner();
//        i.innerDisplay();
//
//    }
//}

class Outer{
    public void display(){
        class Inner{
            public void show(){
                System.out.println("HELLO");
            }
        }
        Inner i = new Inner();
        i.show();
    }
}




public class Inner_Classes {
    public static void main(String[] args) {
      new Outer().display();
    }
}
