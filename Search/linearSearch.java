package Search;
public class linearSearch{
    public static int linear_search(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int [] a= {40,32,27,58,20,12,67,39,84,76,99};
        int index= linear_search(a,67);
        if(index==-1){
            System.out.println("Target not found");
        }
        else{System.out.println("Target found at index: "+index);}
    }
}