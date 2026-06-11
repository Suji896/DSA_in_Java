package Challenges_Basic;

import java.util.Scanner;

public class challenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            sum += n;
            if (sum < 0) {
                break;
            }

            System.out.println(n);
        }
        
        sc.close();
    }  
}
