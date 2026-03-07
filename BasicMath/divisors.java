package BasicMath;
import java.util.Scanner;
public class divisors {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        System.out.println("Divisors: ");

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();

    }
    
}
