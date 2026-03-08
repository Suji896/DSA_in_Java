package BasicMath;
import java.util.Scanner;
public class GCD {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        int m=sc.nextInt();
        System.out.println("gcd is: "+gcd(n,m));
        sc.close();
    }

        // if we solve it with for loop, (brute force) then it has complexity of O(n)
        // so we will use euclidean algorithm

        //gcd(a,b)=gcd(a%b,b) given than a>b
    static int gcd(int a,int b){

        while(a>0&& b>0){
            if(a>b) a=a%b;
            else b=b%a;

        }
        if(a==0) return b;
        return a;
    }
        
    
}
