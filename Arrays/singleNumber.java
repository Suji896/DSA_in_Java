package Arrays;

public class singleNumber {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,4,1,3};
        int n= arr.length;
        int s=0;
        for(int i=0;i<n;i++){
            s=s^arr[i];

        }
        System.out.println("Single number found: "+ s);
       
       
    }
}
