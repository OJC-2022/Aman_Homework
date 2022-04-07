import java.util.Scanner;

public class problem5 {
    public static void printFinbonacci(int  n){
        int a=1,b=1;
        System.out.print(a+" ");
        for(int i=1;i<n;i++){
            int temp=a+b;
            System.out.print(b+" ");
            a=b;
            b=temp;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFinbonacci(n);
        sc.close();
    }
}
