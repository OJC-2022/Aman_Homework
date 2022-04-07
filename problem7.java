import java.util.Scanner;
//find the lcm and hcf of two numbers;
public class problem7 {
    public static int getHCF(int num1,int num2){
        int hcf=1;
        for(int i=2;i<(num1<num2?num1:num2);i++){
            if(num1%i==0 && num2%i==0) hcf=i;
        }
        return hcf;
    }
    public static int getLCM(int num1,int num2){
        int start=num1>num2?num1:num2;
        int end=num1*num2;
        int lcm=start;
        for(int i=start;i<end;i++){
            if(i%num1==0 && i%num2==0){
                lcm=i;break;
            }
        }
        return lcm;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=getLCM(n1, n2);
        int hcf=getHCF(n1,n2);
        System.out.println("LCM of "+n1+" and "+n2+" :"+lcm);
        System.out.println("HCF of "+n1+" and "+n2+" :"+hcf);
        sc.close();
    }
}
