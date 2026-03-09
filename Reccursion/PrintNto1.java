package Reccursion;
import java.util.Scanner;
public class PrintNto1 {
    static void Nto1(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        
        Nto1(a-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int i=n;
        System.out.println("output:");
        Nto1(n);
        
        sc.close();

    }
}
