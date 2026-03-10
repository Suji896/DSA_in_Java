package Recursion;

import java.util.Scanner;

public class Print1toN {
    static void print1toN (int a){
        
        if(a==0){
            return;
        }
       
        
        print1toN(a-1);
        System.out.println(a);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        
        System.out.println("output:");
        print1toN(n);
        
        sc.close();

    }
}

    

