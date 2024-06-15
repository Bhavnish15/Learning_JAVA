import java.util.Scanner;

public class basic_Operations {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
//        String str = new String("netbins Again");
//        System.out.println(str.length());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.substring(0));
//        System.out.println(str.startsWith("net"));
//        System.out.println(str.startsWith("Ag", 8));
//        System.out.println(str.endsWith("in"));
//        System.out.println(str.indexOf("Again"));
//        System.out.println(str.lastIndexOf("in"));

//        System.out.println("Give 2 numbers:  ");
//        int a = sc.nextInt();
//
//
//        if (a % 2 == 0) {
//            System.out.println(a + "is Even");
//        } else {
//            System.out.println(a + "is Odd");
//        }
//
//        System.out.println("Give a Person Age:  ");
//        int age = sc.nextInt();
//
//        if (age > 18) {
//            System.out.println("The person is Young");
//        } else {
//            System.out.println("The person is not Young");
//        }
//
//        System.out.println("Enter your marks: ");
//        int marks = sc.nextInt();
//
//        if (marks > 40 && marks < 50) {
//            System.out.println("your Grade is C");
//        } else if (marks > 50 && marks < 60) {
//            System.out.println("your Grade is B");
//        } else if (marks > 60 && marks < 70) {
//            System.out.println("Your Grade is A");
//        } else if (marks > 70 && marks < 80) {
//            System.out.println("Your Grade is A+");
//        } else if (marks > 80 && marks < 90) {
//            System.out.println("Your Grade is A++");
//        }


//        System.out.println("Give me a number: ");
//        String num = sc.nextLine();
//
//        if(num.matches("[01]+")){
//            System.out.println("Its a Binary Number");
//        }else if(num.matches("[0-7]+")){
//            System.out.println("Its a Octal Number");
//        }else if(num.matches("[0-9]+")){
//            System.out.println("Its a Decimal Number");
//        }else if(num.matches("[0-9 A-F]+")){
//            System.out.println("Its Hexadecimal Number");
//        }else{
//            System.out.println("Not a Valid Number");
//        }




//        System.out.println("Enter a Number to print a Table: ");
//        int num = sc.nextInt();
//        for(int i = 1; i <= 10; i++ ){
//            System.out.println(num + " * "+ i + " = "+ num * i);
//        }
//        System.out.println("Enter the number to get Sum: ");
//        int num = sc.nextInt();
//        int sum =0;
//        for(int i = 1; i <= num; i++){
//            sum =  sum + i;
//        }
//        System.out.println("Sum is "+ sum);




//        System.out.println("Enter more then 2 digits to get Single digit: ");
//        int num = sc.nextInt();
//        int count = 0;
//        int isArmstrong = 0;
//        int copyOfNum = num;
//        int rev = 0;
//
//        while(num > 0){
//            int modulo = num % 10;
//            isArmstrong = isArmstrong + modulo * modulo * modulo;
//            rev = rev * 10 + modulo;
//            num = num / 10;
//            count++;
//
//            System.out.println(modulo);
//        }
//        System.out.println("Count of Digit: "+count);
//        System.out.println("Reverse of a number: "+ rev);
//
//        if(isArmstrong == copyOfNum){
//            System.out.println("ArmStrong Number.");
//        }else{
//            System.out.println("Not a ArmStrong Number.");
//        }
//
//        if(copyOfNum == rev){
//            System.out.println("Palindrome Number");
//        }else{
//            System.out.println("Its not a Palindrome");
//        }




//        System.out.println("Enter a Number:  ");
//        int n = sc.nextInt();
//        String strr = "";
//        while (n > 0) {
//            int rem = n % 10;
//            n = n /10;
//            strr = strr+rem;
//        }
//        System.out.println(strr);
//        char c;
//        for(int i = strr.length()-1; i >= 0; i--){
//            c = str.charAt(i);
//            switch (c) {
//                case 0 -> System.out.print(" Zero");
//                case 1 -> System.out.print(" One");
//                case 2 -> System.out.print(" Two");
//                case 3 -> System.out.print(" Three");
//                case 4 -> System.out.print(" Four");
//                case 5 -> System.out.print(" Five");
//                case 6 -> System.out.print(" Six");
//                case 7 -> System.out.print(" Seven");
//                case 8 -> System.out.print(" Eight");
//                case 9 -> System.out.print(" Nine");
//                case 10 -> System.out.print(" Ten");
//                default -> System.out.print(" Invalid Number");
//            }
//        }



//        System.out.println("Program to Print AP series.");
//        System.out.println("Enter the value of a, b, and c");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n = sc.nextInt();
//
//        int term = a;
//        for(int i = 0; i < n; i++){
//            System.out.print(term+",");
//            term = term + b;
//        }


//        System.out.println("Program to Print GP Series.");
//        System.out.println("Enter the value of a, b and n");
//        int a = sc.nextInt();
//        int commonRatio = sc.nextInt();
//        int n = sc.nextInt();
//
//        int term = a;
//        for(int i = 0; i < n; i++){
//            System.out.print(term+",");
//            term = term * commonRatio;
//        }


//        System.out.println("Program to find Fibonacci Series");
//        System.out.println("Enter the Number up to which you want fibonacci series...");
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int c;
//        System.out.print(a+","+b+",");
//        for(int i = 0; i < n-2; i++){
//            c = a+b;
//            System.out.print(c+",");
//            a=b;
//            b=c;
//        }


//        System.out.println("Print a * Pattern");
//        for (int i = 1; i <= 5; i++){
//            for(int j = 1; j <= 5; j++){
//                if(j+i > 5){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println("");
//        }




//        System.out.println("Some Array Operations");
//
//        int[] arr = {3,2,5,6,8,4,7,9};
//        int sum = 0; boolean result = false;
//        int searchElement = 5; int max = 0; int secondMax = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//            if(max < arr[i]){
//                secondMax = max;
//                max = arr[i];
//            }else if(secondMax < arr[i]){
//                secondMax = arr[i];
//            }
//
//            if(searchElement == arr[i]){
//                result = true;
//            }
//        }
//        if(result){
//            System.out.println("The is Element is Present.");
//        }else{
//            System.out.println("The Element is Not Present.");
//
//        }
//        System.out.println("Maximum element in array is : "+ max);
//        System.out.println("Second maximum element is: "+ secondMax);
//        System.out.println(sum);


//        System.out.println("Rotation of an Array");
//        int[] arr = {3,9,7,8,12,6,15,5,4,10};
//        int temp = arr[0];
//
//        for(int i = 1; i < arr.length; i++){
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length -1] = temp;
//
//
//        for(int x : arr){
//            System.out.print(x+", ");
//        }


//        System.out.println("Inserting an Element in an array: ");
//        int[] arr = new int[10];
//        arr[0] = 5;
//        arr[1] = 9;
//        arr[2] = 6;
//        arr[3] = 10;
//        arr[4] = 12;
//        arr[5] = 7;

//         for(int i = 5; i > 0; i--){
//             arr[i + 1] = arr[i];
//         }
//         arr[2] = 5;

//        System.out.println("Deletion of an Element in an array: ");
//        for(int i = 0; i < 6; i++){
//            arr[2] = arr[3];
//        }

//        for(int x : arr){
//            System.out.print(x+", ");
//        }


//        System.out.println("Copying array into another array: ");
//        int[] arr = {3,4,5,6,7};
//        int[] arr2 = new int[5];
//        arr2[0] = arr[arr.length - 1];
//
//        int j = 0;
//        for(int i = arr.length-1; i >= 0; i--){
//            arr2[j] = arr[i];
//            j++;
//        }
//        for(int x : arr2){
//            System.out.print(x+", ");
//        }


//        System.out.println("Matrix Multiplication");
//        int[][] arr = {{3,5,9}, {7,6,2}, {4,3,5}};
//        int[][] arr2 = {{1,0,0}, {0,1,0}, {0,0,1}};
//        int arr3[][] = new int[arr.length][arr2.length];
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr2.length; j++){
//                arr3[i][j] = 0;
//                for(int k = 0; k < 3; k++){
//                    arr3[i][j] = arr3[i][j]+ arr[i][k] * arr2[k][j];
//                }
//            }
//        }
//
//
//        for(int i = 0; i < arr3.length; i++){
//            for(int j = 0; j < arr3.length; j++){
//                System.out.print(arr3[i][j]+"  ");
//            }
//            System.out.println();
//        }







    }


}
































