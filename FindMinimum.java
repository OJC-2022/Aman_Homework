import java.util.Scanner;
//find the  minimum element in array

public class FindMinimum {
    public static int getMinimum(int[] arr){
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<m) m=arr[i];
        }
        return m;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int res=getMinimum(arr);
        System.out.println("Minimum number in the Array is : "+res);
        sc.close();
    }
}
