package Arrays;
import java.util.*;
public class dutch_national_flag {

    public static void main(String args[]) {
        
        Scanner scn=new Scanner(System.in);
        
        int n = scn.nextInt(); 
        int[] array=new int[n];

		for (int i = 0; i < n; i++){ 
			array[i]=scn.nextInt();
		}

		sortColors(array); 

		for (int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}

        scn.close();

    }

    public static void sortColors(int[] arr) {
		if (arr == null || arr.length <= 1) {
        return; // No sorting needed for empty or 1-element arrays
        }
		int n= arr.length;
		int mid=0;
		int low=0;
		int high=n-1;
        while(mid<=high){
			if(arr[mid]==0){
				//swap arr[low] and arr[mid]
				int temp= arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}else if(arr[mid]==1){
				mid++;
			}else{
				//swap arr[mid] and arr[high]
				int temp= arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
			
		}
    }
}
