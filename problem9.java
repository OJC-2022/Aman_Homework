import java.util.Scanner;
//print even numbers starting from n to 2;
public class problem9 {
    public static void printEven(int num){
        for(int i=num;i>=2;i=i-2){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printEven(n);
        sc.close();
    }
}
