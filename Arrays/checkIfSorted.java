package Arrays;
public class checkIfSorted {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,9};
        int flag=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){

            }else{
                flag--;
                break;
            }
        }
        if(flag==1){
            System.out.println("array is sorted.");
        }else{
            System.out.println("array is not sorted");
        }
    }
    
}
