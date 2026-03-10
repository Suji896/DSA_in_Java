package Reccursion;
import java.util.Scanner;
public class fibonacci {
    static int Fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int x= sc.nextInt();
        System.out.print("Fibonacci series: ");
        for(int i=0;i<x;i++){
            System.out.print(Fib(i)+" ");
        }
        sc.close();
    }
}
