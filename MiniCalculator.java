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
            System.out.print("Enter your choice :");
            char choice=sc.next().charAt(0);
            switch(choice){
                case '1':
                    System.out.print("Enter two numbers : ");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("\tResult = "+(a+b));
                    break;
                case '2':
                    System.out.print("Enter two numbers : ");
                    int a1=sc.nextInt();
                    int b1=sc.nextInt();
                    System.out.println("\tResult = "+(a1-b1));
                    break;
                case '3':
                    System.out.print("Enter two numbers : ");  
                    int a2=sc.nextInt();
                    int b2=sc.nextInt();
                    System.out.println("\tResult = "+(a2*b2));
                    break;
                case '4':
                    System.out.print("Enter two numbers : ");
                    int a3=sc.nextInt();
                    int b3=sc.nextInt();
                    if(b3==0) System.out.println("OOPS....!! division by Zero!!");
                    else System.out.println("\tResult = "+(a3/b3));  
                    break;
                case '5':  
                    System.out.print("Enter two numbers : ");
                    int a4=sc.nextInt();
                    int b4=sc.nextInt();
                    if(b4==0) System.out.println("OOPS....!! division by Zero!!");
                    else System.out.println("Result = "+(a4%b4));  
                    break;    
                case '6':
                    return;  
                default:
                    System.out.print("Invalid choice!!"+"\nPlease choose valid choice!!\n");
                    break;        
            }
            System.out.println();
            
        }while(true);

    }
    public static void main(String[] args){
        miniCalculator();
    }
}
