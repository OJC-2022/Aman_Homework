import java.util.Scanner;
public class MiniCalculator{
    static{
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\tWelcome to Mini Calculator");
        System.out.println("------------------------------------------------------------");
    }

    public static void miniCalculator(){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Mini Calculator");
            System.out.println("\t1. Add\n"+"\t2. Subtract\n"+"\t3. Multiply\n"+"\t4. Divide\n"+"\t5. Remainder\n"+"\t6. Exit");
            System.out.println("Enter your choice :");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter two integer numbers : ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.print("Enter two integer numbers : ");
                    int a1=sc.nextInt();
                    int b1=sc.nextInt();
                    System.out.println(a1-b1);
                    break;
                case 3:
                    System.out.print("Enter two integer numbers : ");  
                    int a2=sc.nextInt();
                    int b2=sc.nextInt();
                    System.out.println(a2*b2);
                    break;
                case 4:
                    System.out.print("Enter two integer numbers : ");
                    int a3=sc.nextInt();
                    int b3=sc.nextInt();
                    if(b3==0) System.out.println("OOPS....!! division by Zero!!");
                    else System.out.println(a3/b3);  
                    break;
                case 5:  
                    System.out.print("Enter two integer numbers : ");
                    int a4=sc.nextInt();
                    int b4=sc.nextInt();
                    if(b4==0) System.out.println("OOPS....!! division by Zero!!");
                    else System.out.println(a4%b4);  
                    break;    
                case 6:
                    return;  
                default:
                    System.out.println("Invalid Choice!!"+"\nPlease choose valid choice");
                    break;
            }
            
        }while(true);

    }
    public static void main(String[] args){
        miniCalculator();
    }
}
