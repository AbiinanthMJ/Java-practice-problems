import java.util.*;

public class topkelements {
    public int[] topkelement(int[] nums ,int k ){

        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        System.out.println(counter+"this is the intial counting of the frequencies");
        Map<Integer, List<Integer>> reversedCounter = new HashMap<>();
       for(int num : counter.keySet()){
           int count = counter.get(num);
           reversedCounter.putIfAbsent(count,new ArrayList<>());
           reversedCounter.get(count).add(num);
       }
        System.out.println(reversedCounter+"    this is the reversedcounter");
        List<Integer> frequencies = new ArrayList<>(reversedCounter.keySet());
        Collections.sort(frequencies, Collections.reverseOrder());
        System.out.println(frequencies+"   this is the extracted frequencies which is orded in desending order");
        List<Integer> result = new ArrayList<>();
        for (int freq : frequencies) {
            List<Integer> numbers = reversedCounter.get(freq);
            System.out.println(numbers);
            for (int num : numbers){
                if (result.size() < k) {
                    result.add(num);
                    System.out.println(num+"    this is the looped value of the added num");
                } else {
                    break;
                }
            }
            if (result.size() == k) break;
        }
        System.out.println(result+"   this is the result");
        return result.stream().mapToInt(i -> i).toArray();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {3, 1, 1, 4};
        int k = scanner.nextInt();
        topkelements obj = new topkelements();
        int[] topK = obj.topkelement(numbers, k);
    }
}

