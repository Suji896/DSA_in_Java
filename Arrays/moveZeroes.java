package Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        // int arr[]={0,1,0,3,4};
        int arr[]={1,0,4,5,0,6,0,7};
        int n= arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        
       for(int k:arr){
        System.out.print(k+" ");
       }
    }
}
