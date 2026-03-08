package BasicMath;
import java.util.Scanner;
public class PrimeNumber {
    static int divisors(int a){
        int cnt=0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                if(i!=a/i){
                    cnt+=2;
                }
                else{
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        if(divisors(n)>2){
            System.out.println("It is not a prime number.");

        }else{
            System.out.println("It is a prime number.");
        }
        sc.close();
    }
}
