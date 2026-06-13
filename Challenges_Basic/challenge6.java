package Challenges_Basic;
import java.util.Scanner;
public class challenge6 {
    public static int anybaseTo_Decimal(int n, int b){
        int b_exp=1;
        int dec=0;
        while(n!=0){
            int rem=n%10;
            dec = dec + b_exp*rem;
            b_exp=b_exp*b;
            n=n/10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int base=sc.nextInt();
        int d=anybaseTo_Decimal(num,base);
        System.out.println(d);
        sc.close();
    }
}
