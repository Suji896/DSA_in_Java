package Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int [] arr= {2,3,7,9,5,8};
        // int arr[]={5,5,5,5,5};

        int lar=arr[0];
        int slar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                slar=lar;
                lar=arr[i];  
            }
            else if(arr[i]>slar && arr[i]!=lar){
                slar=arr[i];
            }
        }
        if(slar==lar){
            System.out.print("Second largest Not found");
        }
        else{
        System.out.println("second Largest: "+slar);
        }
    }
}
