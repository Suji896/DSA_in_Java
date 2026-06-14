package Search;

public class binarySearch {
    public static int Bin_search(int[]arr, int target){
        int min=0;
        int max=arr.length-1;
        while(min<=max){
            int mid= (min+max)/2;
            if(target > arr[mid]){
            min=mid+1;
            }
            else if(target < arr[mid]){
                max=mid-1;
            }else{
                return mid;
            }
        
        }
        return -1;
    }
    public static void main(String[] args){
        
        // Array must be sorted for binary search to work
        int[] a={5,7,10,12,15,20,27,31,36,42,55,58,60,65,70,80};
        
        int index=Bin_search(a,20);
        if(index==-1){
            System.out.println("Target not found");
        }
        else{System.out.println("Target found at index: "+index);}

    
    }
}
