import java.util.Scanner;

//print n numbers which is divisible by m and number should start from m

public class problem10 {
    public static void printSequence(int n,int m){
        int i=m;
        int counter=0;
        while(true){
            if(n==counter) break;
            else{
                System.out.println(i);
                i=i+m;
                counter++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printSequence(n, m);
        sc.close();
    }
}
