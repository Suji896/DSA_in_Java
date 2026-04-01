package Arrays;
import java.util.ArrayList;
public class IntersectionSortedArrays {
    public static void main(String[] args) {
       int[] arr1={1,1,2,3,3,4,5};
       int[] arr2={2,3,4,5,6};

       ArrayList<Integer> intersection= new ArrayList<>();
       int n= arr1.length;
       int m= arr2.length;
       int i=0;
       int j=0;

       while(i<n && j<m){
        if(arr1[i]<arr2[j]){
            i++;
        }
        else if(arr2[j]<arr1[i]){
            j++;
        }

        else if(arr1[i]==arr2[j]){
            if(intersection.isEmpty()||intersection.get(intersection.size()-1)!=arr1[i]){
                intersection.add(arr1[i]);
                j++;
            }
            i++;
        }
       }

       for (Integer r : intersection) {
        System.out.print(r+" ");
       }
    }
}
