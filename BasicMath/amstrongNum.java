package BasicMath;
import java.util.Scanner;

public class amstrongNum {
    static int count(int a){
        int cnt=0;
        while(a>0){
            cnt++;
            a=a/10;

        }

        return cnt;
    }
    static boolean amstrong(int a){
        int sum=0;
        int original=a;
        while(a>0){
            int r = a%10;

            sum = sum+ (int)(Math.pow(r,count(original)));
            a=a/10;

        }
        return (sum==original);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("The given num is amstrong num : "+amstrong(n));
        sc.close();


    }
}
