package Sorting.MergeSort;
import java.util.Arrays;
public class MergeSort {
//    public int[] ms(int [] arr ){
//       if(arr.length==1){
//           return arr;
//       }
//       int mid=arr.length/2;
//       int [] left = ms(Arrays.copyOfRange(arr,0,mid));
//       int [] right = ms(Arrays.copyOfRange(arr,mid,arr.length));
//       return merge(left,right);
//    }
//    public int[] merge(int[] left, int [] right){
//      int [] joined = new int[left.length+right.length];
//      int i=0,j=0,k=0;
//      while(i<left.length&&j<right.length){
//          if (left[i] < right[j]) joined[k++] = left[i++];
//          joined[k++] = right[j++];
//      }
//      while(i<left.length){
//          joined[k++]=left[i++];
//      }
//      while(j<right.length){
//          joined[k++]=right[j++];
//      }
//      return joined;
//    }

    public  int [] ms(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = ms(Arrays.copyOfRange(arr,0,mid));
        int [] right = ms(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public  int[] merge(int []left , int []right ){
        int [] joined = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j])joined[k++]=left[i++];
            joined[k++]=right[j++];
        }
        while (i<left.length){
                joined[k++]=left[i++];
        }
        while (j<right.length){
                joined[k++]=right[j++];
        }
        return joined;
    }
    public void display(int [] arr) {
        for (int t : arr) {
            System.out.print(t + ", ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,7,2,5,5,7,3,};
        MergeSort ms = new MergeSort();
        int[] sorted=ms.ms(arr);
        ms.display(sorted);
    }
}
