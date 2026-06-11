package Challenges_Basic;
import java.util.Scanner;

//   For every odd number row print 1, odd number of times
//  and for every even number row , print first and last character as 1 and rest of middle characters as 0.

public class challenge4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					if(j==1 || j==i){
						System.out.print("1");
					}else{
						System.out.print("0");
					}
				}else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
        sc.close();
    }
}
