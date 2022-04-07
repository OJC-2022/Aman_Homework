import java.util.Scanner;
//check the number is prime or not;
public class problem6 {
    public static boolean isPrime(int num){
        if(num==0 || num==1) return false;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)) System.out.println("Prime Number");
        else System.out.println("Composite Number");
        sc.close();
    }
}
