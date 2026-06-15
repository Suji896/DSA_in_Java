package Sorting;
public class SelectionSort{
    public static void Selection_Sort(int[] arr){

        for(int counter=0;counter<arr.length-1;counter++){
            int min=counter;
            for(int j=counter+1;j<=arr.length-1;j++){
                if(arr[j]<arr[min]) min=j;

                int temp=arr[min];
                arr[min]=arr[counter];
                arr[counter]=temp;
                
            }
        }
    }
    public static void main(String [] args){
        
        int [] array={88,67,54,34,21,10,3};
        Selection_Sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}