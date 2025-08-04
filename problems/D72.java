package problems;

public class D72 {
    //DFS Question it is used to avoid the exploration of all the possible subsets -->
    //Take way the concept of DFS to use the exploration of all the concepts
    //65536 subsets it is not feasible
    int maxor = 0;   // instance variable
    int count = 0;   // instance variable

    public static void main(String[] args) {
        int[] arr = {3,2,1,5};
        D72 o = new D72();
        // calculate maxor
        for (int num : arr) {
            o.maxor |= num;
        }
        o.dfs(arr, 0, 0);
        System.out.println(o.count);
    }
    void dfs(int[] arr, int index, int currentor) {
        if (index == arr.length) {
            if (currentor == maxor) {
                count++;
            }
            return; // ✅ must return to avoid unnecessary recursion
        }
        // include current element
        dfs(arr, index + 1, currentor | arr[index]);
        // exclude current element
        dfs(arr, index + 1, currentor);
    }
}
