import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Splitandtransverse {
    public static void main(String[] args) {
        int [] array = new int[] {24,12,25,36,48,20,54,88,98,100};
        int k = 3;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        List<Integer>List1 = new ArrayList<>();
        List<Integer>List2= new ArrayList<>();
        for(int i=0;i<k;i++){
            List1.add(array[i]);
        }
        for(int i=k;i<array.length;i++){
            List2.reversed().add(array[i]);
        }
        for(int nums : List2){
            List1.add(nums);
        }
        System.out.println(List1);
    }
}
