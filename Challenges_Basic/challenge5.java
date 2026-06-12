package Challenges_Basic;

import java.util.Scanner;

public class challenge5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int dec=0;
		int base=1; // 2^0,2^1,2^2
		while(n!=0){
			int rem=n%10;
			dec = dec + rem * base; 
            base = base * 2;   //move to next power of 2
			n=n/10;
		}
		System.out.println(dec);
        sc.close();
    }
}
