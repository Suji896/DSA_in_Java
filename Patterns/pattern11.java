package Patterns;
import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(); 
        int num=1;  
        int m = 2 * n - 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j>n-i && j<n+i){
                    System.out.print(num+" ");
                    num++;
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        sc.close();
    }
}
