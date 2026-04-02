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
        for(int i=1;i<=n;i++){
            x1=x1^i;
        }
        int x2=0;
        for (int val : arr) {
            x2=x2^val;
        }
        int num= x1^x2;
        System.out.println("The missing number is: "+num);
    }
}