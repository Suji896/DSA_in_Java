package Arrays;
public class missingNum{
    public static void main(String[] args) {
        int arr[]={2,3,1,5,6};
        int n= arr.length+1;

        // Solution 1 : sum method
        
        int sum= n*(n+1)/2;
        int sum_arr=0;

        for (int el : arr) {
            sum_arr+=el;
        }
        int missing=sum-sum_arr;

        System.out.println("The missing number is: "+missing);

        // XOR method
        int x1=0;
        
        int x2=0;
        for (int i=0;i<n-1;i++) {
            x2=x2^arr[i];
            x1=x1^(i+1);
        }
        x1=x1^n;
        int num= x1^x2;
        System.out.println("The missing number is: "+num);
    }
}