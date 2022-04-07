import java.util.Scanner;
//find sum of first n natural numbers;

public class problem11 {
    public static int getSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++) sum+=i;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=getSum(n);
        System.out.print("Sum of First "+n+" natural numbers is : "+res);
        sc.close();
    }
}
