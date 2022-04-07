import java.util.Scanner;
//print n odd numbers
public class problem8 {
    public static void printOdd(int n){
        int i=1,counter=0;
        while(true){
            if(n==counter) break;
            else{
                System.out.println(i);
                i=i+2;
                counter++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printOdd(n);
        sc.close();
    }
}
