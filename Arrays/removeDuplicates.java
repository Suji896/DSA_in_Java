package Arrays;
// removing duplicates from sorted array

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5,5,6,7,8,8,9};
       int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }

        
    }
    
}
