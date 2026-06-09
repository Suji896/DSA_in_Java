package Challenges_Basic;
import java.util.Scanner;
public class challenge1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n<=1){
                for (int j = 1; j <= i; j++){
                System.out.print(i);
                }
            }else{
                for(int j=1;j<=i;j++){
                    if(j==1 || j==i){
                        if(i==1){
                            System.out.print(i);
                        }else{
                        System.out.print(i-1);
                        }
                    }else{
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
        }
        sc.close();

    }
}
