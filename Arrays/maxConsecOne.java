package Arrays;

public class maxConsecOne {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1,1,0,1,1,1};
        // int[] arr = {0,1,1,1,1};
        // int[] arr = {0,0,0,0};
        // int[] arr = {1,1,1,1,1};
        
        int count=0;
        int max1=0;

        for(int i=0;i<arr.length;i++){
        
            if(arr[i]==1){
                count++;
                
                
            }
            else if(arr[i]==0){
                if(count>max1){
                    max1=count;
                }
                count*=0;
            }
            
        }
        if(count > max1){
            max1 = count;
        }
       
        
        System.out.println("max consecutive ones:"+max1);

    }
}
