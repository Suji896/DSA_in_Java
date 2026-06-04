package Patterns;
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");     
        int n = sc.nextInt();
        int m = 2 * n - 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j>=n-1-i && j<=n+i-1){
                    System.out.print("1 ");
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
