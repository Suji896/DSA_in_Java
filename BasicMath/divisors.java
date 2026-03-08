package BasicMath;
import java.util.Scanner;
public class divisors {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        System.out.println("Divisors: ");

        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
        // this has complexity O(n);

        // but we can solve in O(sqrt(n));

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i != i){
                    System.out.print(n/i+" ");
                }
            }

        }

        sc.close();
    }
    
}
