package problems;

class dailytemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        int start=0; int end =start+1;
        while(start<n){
            if (end >= n) {
                result[start] = 0;
                start++;
                end = start + 1;
                continue;
            }
            if(temperatures[start]<temperatures[end]){
                result[start]=end-start;
                start++;
                end=start+1;
            }
            if(temperatures[start]==temperatures[end]){
                start++;
                end=start+1;
                continue;
            }
            else {
                end++;
            }
        }
        return result;
    }
}