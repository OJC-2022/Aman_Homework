import java.util.Scanner;
// print odd number between two number n and m where n < m

public class problem12 {
    public static boolean isEven(int num){
        if(num%2==0) return true;
        else return false;
    }
    public static void printOdd_in_Range(int n,int m){
        for(int i=n+1;i<m;i++){
            if(i%2==0) continue;
            else System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int from=sc.nextInt();
        int upto=sc.nextInt();
        printOdd_in_Range(from, upto);
        sc.close();
    }
}
