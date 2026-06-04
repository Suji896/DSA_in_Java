package Patterns;

public class pattern8 {
    public static void main(String args[]) {
        int n=5;
        int m= 2*n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<=i || j>=m-i-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();

        }
       
    }
} 
    

