package BasicMath;
import java.util.Scanner;
public class checkPalindrome {
   static int revNumber(int a){
            int b=0;
            for(int i=0;a>0;i++){
                b=b*10+ (a%10);
                a=a/10;
            }
            return b;
        }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n=sc.nextInt();

        
        if(n==revNumber(n)){
            System.out.println("The given number is a palindrome.");
        }else{
            System.out.println("The given number is not a palindrome.");
        }
        sc.close();
    }
}
