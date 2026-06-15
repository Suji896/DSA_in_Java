package Sorting;
public class BubbleSort {
    public static void Bubble_Sort(int[] arr){
        for(int counter=0;counter<arr.length-1;counter++){
            for(int j=0;j<arr.length-1-counter;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String [] args){
        
        int [] array={88,67,54,34,21,10,3};
        Bubble_Sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
