package ObjectOrientedProgramming;

class LowBalanceException extends Exception{
    public String toString(){
        return "Balance Should be more then 5000, try again!!";
    }
}


class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is Full";
    }
}
class StackUnderFlow extends Exception {
    public String toString(){
        return "Stack is Empty";
    }
}
class Stack {
    private int size;
    private int top = -1;
    private int S[];

    public Stack(int sz){
        size = sz;
        S = new int[sz];
    }
    public void push(int x) throws StackOverFlow{
        if(top == size -1){
           throw new StackOverFlow();
        }
        top++;
        S[top] = x;
    }
    public int pop() throws StackUnderFlow{
        int x = -1;
        if(top == -1){
            throw new StackUnderFlow();
        }
        x = S[top];
        top--;
        return x;
    }
}




public class Exceptions {

    Stack s = new Stack(5);





    static void fun1(){
        try {
            throw new LowBalanceException();
        }catch (LowBalanceException e){
            System.out.println(e);
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
