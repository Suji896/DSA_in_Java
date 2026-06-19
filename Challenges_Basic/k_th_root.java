package Challenges_Basic;
import java.util.Scanner;

public class k_th_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();
            
            long x = (long) Math.pow(n, 1.0 / k);
            
            while (Math.pow(x, k) > n) {
                x--;
            }
            
            while (Math.pow(x + 1, k) <= n) {
                x++;
            }
            
            System.out.println(x);
        }
        sc.close();
    }
}
