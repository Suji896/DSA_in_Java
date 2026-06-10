package Challenges_Basic;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
		int x= sc.nextInt();
		while(x!=0){
			int a= sc.nextInt();
			int esum=0;
			int osum=0;
			while(a!=0){
				int rem=a%10;
				if(rem%2==0){
					esum+=rem;
				}else{
					osum+=rem;
				}
				a=a/10;
			}
			if(osum%3==0){
				System.out.println("Yes");
			}
			else if(esum%4==0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			x--;
		}
        sc.close();
    }
}
