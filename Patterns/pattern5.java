package Patterns;
public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>0;i--){
            for(int j=0;j<n;j++){
                if(j<=n-i-1){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            } 
            System.out.println();
        }

    }
}