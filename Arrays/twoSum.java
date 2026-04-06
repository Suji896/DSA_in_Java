package Arrays;
import java.util.HashMap;
public class twoSum {
    public static void main(String[] args) {
        int [] arr={2,3,7,6,5};
        int n= arr.length;

        //brute force
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j]==9){
        //             System.out.println(i+","+j);
        //             return;
        //         }
        //     }
        // }

        //optimal approach using hashmap

        
    
        HashMap<Integer,Integer> sum= new HashMap<>();
        for(int i=0;i<n;i++){
            int x= arr[i];
            int complement= 9-x;

            if(sum.containsKey(complement)){
                System.out.print(i+","+sum.get(complement));
                return;
            }
            else{
                sum.put(arr[i],i);
            }
        }
    }
}
