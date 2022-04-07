import java.util.Scanner;

//check the number is divisible by 7 or not
public class problem2 {
    public static boolean isDivisibleBy7(int num){
        if(num%7==0) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isDivisibleBy7(n)) System.out.println("Yes,Divisible by 7!");
        else System.out.println("No,not Divisible by 7!");
        sc.close();
    } 
}
