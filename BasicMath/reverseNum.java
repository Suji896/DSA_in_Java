package BasicMath;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the integer: ");
    int n= sc.nextInt();
    
    if(n<0){
        
        n= Math.abs(n);
        System.out.print("-");
    }
   
    while(n>0){
        System.out.print(n%10);
        n=n/10;
    }
    sc.close();
}
}
