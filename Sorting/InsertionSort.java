package Sorting;

public class InsertionSort {
    public static void Insertion_Sort(int []arr){
        for(int counter=1;counter<arr.length-1;counter++){
            int val=arr[counter];
            int j=counter-1;

            while(j>=0 && arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
    public static void main(String[] args){
        int[] array={83,99,65,11,23,78,45};
        Insertion_Sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
    }
    
}
