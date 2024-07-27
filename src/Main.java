import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 1) Random random=new Random();
//        int FRN=random.nextInt(1, 99);
//        System.out.println("First random num: "+FRN);
//        int i=0;
//        while (i<20) {
//            int sigma=random.nextInt(1, 99);
//            if (sigma%FRN==0) {System.out.println(sigma);
//                i++;
//            }
//        }
//               2) Random random=new Random();
//                int minNum=50;
//                int maxNum=-50;
//                int zero=0;
//                System.out.println("Write so     1me ugly ahh things: ");
//                while (zero<20) {
//                    int RN=random.nextInt(-50, 50);
//                    System.out.print(RN + " ");
//                    if (RN<minNum)
//                       minNum=RN;
//                    else if(RN>maxNum)
//                       maxNum=RN;
//                    zero++;
//                }
//                System.out.println("\nmin num: " + minNum);
//                System.out.println("max num: " + maxNum);


//        3)System.out.println("Input number: ");
//        Scanner scanner=new Scanner(System.in);
//        int sc=scanner.nextInt();
//        while(sc>0){
//            int sd=scanner.nextInt();
//            sc-=sd;
//            if (sc<0) System.out.println("Try again: ");
//        }
//        System.out.println("Num is w "+sc);


//        4)Scanner scanner=new Scanner(System.in);
//        System.out.println("New Scanner set:");
//        int SFN=0;
//        int SSN=0;
//        while (true) {
//            System.out.println("Input1: " );
//            int num1=scanner.nextInt();
//            System.out.println("Input2: ");
//            int num2=scanner.nextInt();
//            if (num1==num2){
//                break;
//            }
//            SFN+=num1;
//            SSN+=num2;
//        }
//        System.out.println("Sum of all nums: "+SFN);
//        System.out.println("Sum of all secondar nums: "+SSN);
//


//        5)System.out.print("Input niggas: ");
//        Scanner scanner=new Scanner(System.in);
//        int voice=scanner.nextInt();
//        System.out.println(" Even numbers");
//        for (int i = 0; i <= voice; i++) {
//            if (i%2==0) System.out.print(i+", ");
//        }
//        System.out.println("\n Odd numbers");
//        for (int i = 0; i <= voice; i++) {
//            if (i%2==1) System.out.print( i+", " );
//        }

//        6)System.out.println("Input: ");
//        Scanner scanner=new Scanner(System.in);
//        String sc=scanner.nextLine();
//        for (int i = 0; i<1; i++) {
//                System.out.print(sc.charAt(0));
//        }


//        7)Scanner scanner=new Scanner(System.in);
//        int reverse=scanner.nextInt(), counter=0;
//        System.out.println("Input: "+reverse);
//        while (reverse!=0){
//            int divide=reverse%10;
//            counter=counter*10+divide;
//            reverse/=10;
//        }
//        System.out.println("In Reverse: "+counter);

//        8)System.out.println("Input some: ");
//        int scan=new Scanner(System.in).nextInt();
//        int[] array=new int[scan];
//        int n= array.length;
//        Random random=new Random();
//        for (int i = 0; i<n ; i++) {
//            array[i] = random.nextInt(1000, 9999);
//        }System.out.println("Nums from last ind:");
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }


//        9)System.out.println("Input some: ");
//        int scan = new Scanner(System.in).nextInt();
//        int[] array = new int[scan];
//        int n = array.length;
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(10, 99);
//        }
//        System.out.println("\nfirst part of an array:");
//        for (int i = 0; i < n / 2; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("\nSecond part of an aray:");
//        for (int i = n / 2; i < n; i++) {
//            System.out.print(array[i] + " ");
//        }



//        10)System.out.println("Input some: ");
//        int scan = new Scanner(System.in).nextInt();
//        int[] array = new int[scan];
//        int n = array.length;
//        Random random = new Random();
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(10, 99);
//        }
//        System.out.println("Even numbers: ");
//        for (int i = 0; i < n; i++) {
//            if (i%2==0) System.out.print(i+", ");
//        }
//        System.out.println("\nOdd numbers: ");
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 1) System.out.print(i+", ");
//        }
    }
}