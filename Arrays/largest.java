package Arrays;
import java.util.Scanner;
public class largest {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        System.out.print("enter array elements: ");
        int [] arr= new int[n];
        for(int i=1;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        System.out.println("Largest number: "+ lar);
        sc.close();
    } 
}
