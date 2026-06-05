package Patterns;

import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println();   
        int m = 2 * n - 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j>n-i && j<n+i){
                    System.out.print(i+" ");
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
