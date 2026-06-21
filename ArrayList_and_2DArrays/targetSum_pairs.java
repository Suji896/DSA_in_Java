package ArrayList_and_2DArrays;
import java.util.Scanner;
import java.util.Arrays;

public class targetSum_pairs{
    public static void targetSum(int[] arr, int n, int target) { 
        int left = 0;
        int right = n - 1;

        while (left < right) { 
            int sum = arr[left] + arr[right];

            if (sum > target) {
                right--; 
            } else if (sum < target) {
                left++;  
            } else {
                System.out.println(arr[left] + " and " + arr[right]); 
                left++;  
                right--; 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        Arrays.sort(arr); 
        
        targetSum(arr, n, target); 
        
        sc.close();
    }
}
