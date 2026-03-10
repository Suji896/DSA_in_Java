package Recursion;
import java.util.Scanner;
public class SumofN {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+ sum(n-1);

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        System.out.println("sum of n numbers:");
        System.out.println(sum(a));

        sc.close();
    }
}
