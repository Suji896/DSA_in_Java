package Patterns;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i-1 || j>i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=n-2;i>0;i--){
            for(int j=0;j<n;j++){
                if(j<n-i-1 || j>i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();    }
}
