package Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        // int arr[]={0,1,0,3,4};
        int arr[]={1,0,4,5,0,6,0,7};
        int n= arr.length;
        
        for(int i=0;i<n-1;i++){  
            if(arr[i]==0){
                for(int j=i;j<=n-1;j++){
                    if(arr[j]!=0){
                        arr[i]=arr[j];
                        arr[j]=0;
                        break;
                    }
                }
            }
        }
        
       for(int k:arr){
        System.out.print(k+" ");
       }
    }
}
