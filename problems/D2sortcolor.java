package problems;

public class D2sortcolor {
    public static void main(String[] args) {
        int [] colorarray={2,0,1};
        int low=0;
        int high=colorarray.length-1;
        int middle=0;
        while(middle<=high){
            if(colorarray[middle]==0){
                int temp=colorarray[low];
                colorarray[low]=colorarray[middle];
                colorarray[middle]=temp;
                middle++;
                low++;
            }
            else if(colorarray[middle]==1){
                middle++;
            }
            else {
                int temp=colorarray[high];
                colorarray[high]=colorarray[middle];
                colorarray[middle]=temp;
                high--;
            }
        }
        for(int nums:colorarray){
            System.out.print(nums);
        }
    }
}
