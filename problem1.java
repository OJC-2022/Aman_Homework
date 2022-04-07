import java.util.Scanner;
//print number is even or Odd.
public class problem1{
    public static void isEvenOdd(int num){
        if(num%2==0) System.out.println("Even Number!");
        else System.out.println("Odd Number!");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isEvenOdd(num);
        sc.close();
    }
}