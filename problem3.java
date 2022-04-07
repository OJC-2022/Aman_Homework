import java.util.Scanner;
//find the area Triangle

public class problem3 {
    public static float getArea(float base,float height){
        return (base*height)/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        float res=getArea(base, height);
        System.out.println("Area of Triangle : "+res+" sq units");
        sc.close();
    }
}
