package Recursion;

public class ArraySum {
    static int SumofElements(int [] a,int n){
        if(n==0){
            return 0;
        }
        return a[n-1]+SumofElements(a, n-1);
    }
    public static void main(String args[]){
       
        int[] arr= {1,2,3,4,5};
        System.out.println("Output:");
        System.out.println(SumofElements(arr, arr.length));

    }
}
