package Recursion;
import java.util.Scanner;
public class sumOfDigits {
    static int DigitSum(int a){
        if(a==0){
            return 0;
        }

        return (a%10)+DigitSum((a/10));

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        System.out.print("Sum of Digits: ");
        System.out.println(DigitSum(n));
        sc.close();
    }
    
}
