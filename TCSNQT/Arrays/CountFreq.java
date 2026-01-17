class CountFreq{
    public static void countFrequency(int[] arr, int maxValue) {
        int[] freq = new int[maxValue + 1];
        for (int num : arr) freq[num]++;
        for (int i = 0; i < freq.length; i++) if (freq[i] > 0) System.out.println(i + " → " + freq[i]);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        countFrequency(arr, 4);
    }
}
