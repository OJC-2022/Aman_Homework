import java.util.Scanner;
//find secind minimum element in an Array
public class secondminimum {
    public static int getSecondMinimum(int[] arr){
        int currMin=arr[0];
        int secMin=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<currMin ){
                secMin=currMin;
                currMin=arr[i];
            }
            else if(arr[i]<secMin && arr[i]!=currMin){
                secMin=arr[i];
            }
        }
        return secMin;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
        int res=getSecondMinimum(arr);
        System.out.println("Second minimum element is: "+res);
        sc.close();
    }
}
