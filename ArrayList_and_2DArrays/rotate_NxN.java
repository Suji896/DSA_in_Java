package ArrayList_and_2DArrays;
import java.util.Scanner;
public class rotate_NxN {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [][] arr=new int[n][n];
        // int n=4;
        // int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,}};

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        System.out.println("After left rotate: ");
        int temp [][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[n-1-j][i]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }


        sc.close();
    }
}
