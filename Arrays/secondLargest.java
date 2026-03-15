package Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int [] arr= {2,3,7,9,5,8};

        for(int j=0;j<arr.length;j++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }

        System.out.println("second Largest: "+arr[arr.length-2]);
    }
}
