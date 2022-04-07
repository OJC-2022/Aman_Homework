import java.util.Scanner;
//find the cube of a number
public class problem4 {
    public static int getCube(int num){
        return num*num*num;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=getCube(num);
        System.out.println("Cube of "+num+" : "+res);
        sc.close();
    }
}
