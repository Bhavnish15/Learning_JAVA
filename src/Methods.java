import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Write a Number to Check Prime or Not");
//        int n = sc.nextInt();
//        if(isPrime(n)){
//            System.out.println("Yes it is Prime Number");
//        }else{
//            System.out.println("Not a Prime number");
//        }
//
//
//        System.out.println(GCD(25, 15));
//

//        double result = findArea(6, 8);
//        System.out.println(result);


        int result = sum(5,3,2,1,4,5,7,4,3,1);
        System.out.println(result);
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int GCD(int m, int n){
        while(m != n){
            if(m > n){
                m = m - n;
            }
            if(n > m){
                n = n - m;
            }
        }
        return m;
    }

    static int findArea(int l, int b){
        return l * b;
    }
    static double findArea(int r){
        return Math.PI * r * r;
    }


    // Variable Number of Arguments

    static int Max(int ...varArgs){
        int max = 0;
        for(int i = 0; i < varArgs.length; i++){
            if(max < varArgs[i]){
                max = varArgs[i];
            }
        }
        return max;
    }

    static int sum(int ...varArgs){
        int sum = 0;
        for(int i = 0; i < varArgs.length; i++){
            sum += varArgs[i];
        }
        return sum;
    }














}
