package problems;//// Java program for the above approach:
//import java.util.*;
//// Class to represent huffman tree
//class BinarySearchTree {
//    int data;
//    BinarySearchTree left, right;
//    BinarySearchTree(int x) {
//        data = x;
//        left = null;
//        right = null;
//    }
//}
//class GfG {
//
//    // Function to traverse tree in preorder
//    // manner and push the huffman representation
//    // of each character.
//    static void preOrder(BinarySearchTree root, ArrayList<String> ans, String curr) {
//        if (root == null) return;
//
//        // Leaf node represents a character.
//        if (root.left == null && root.right == null) {
//            ans.add(curr);
//            return;
//        }
//
//        preOrder(root.left, ans, curr + '0');
//        preOrder(root.right, ans, curr + '1');
//    }
//    // traversal ->
//    static ArrayList<String> huffmanCodes(String s, int[] freq) {
//        int n = s.length();
//        // Min heap for node class.
//        PriorityQueue<BinarySearchTree> pq = new PriorityQueue<>((a, b) -> {
//            if (a.data < b.data) return -1;
//            return 1;
//        });
//        for (int i = 0; i < n; i++) {
//            BinarySearchTree tmp = new BinarySearchTree(freq[i]);
//            pq.add(tmp);
//        }
//
//        // Construct huffman tree.
//        while (pq.size() >= 2) {
//
//            // Left node
//            BinarySearchTree l = pq.poll();
//
//            // Right node
//            BinarySearchTree r = pq.poll();
//
//            BinarySearchTree newNode = new BinarySearchTree(l.data + r.data);
//            newNode.left = l;
//            newNode.right = r;
//
//            pq.add(newNode);
//        }
//
//        BinarySearchTree root = pq.poll();
//        ArrayList<String> ans = new ArrayList<>();
//        preOrder(root, ans, "");
//        return ans;
//    }
//    public static void main(String[] args) {
//        String s = "Multitechengineeringcollege";
//        int[] freq = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
//        ArrayList<String> ans = huffmanCodes(s, freq);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.print(ans.get(i) + " ,");
//        }
//    }
//}
// Java implementation of the approach
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
class GfG {

    static final int MAXSIZE = 1000;
    static final int INF = (int)Double.POSITIVE_INFINITY;

    // Segment Tree array
    static int[] tree = new int[MAXSIZE];

    // Lazy Update array
    static int[] lazy = new int[MAXSIZE];

    // Build our segment tree
    static void build_tree(int[] arr, int arr_size)
    {

        // Stack will use to update
        // the tree value
        Stack<List<Integer> > st = new Stack<>();

        // push the root of the tree
        st.push(Arrays.asList(1, 0, arr_size - 1));

        // Repeat until empty
        while (!st.isEmpty()) {

            // Take the indexes at the
            // top of the stack
            int currnode, curra, currb;

            // value at the top of the
            // stack
            List<Integer> temp = st.peek();
            currnode = temp.get(0);
            curra = temp.get(1);
            currb = temp.get(2);

            // Pop the value from the
            // stack
            st.pop();

            // Flag with INF ranges are merged
            if (curra == INF && currb == INF) {
                tree[currnode] = tree[currnode * 2]
                        + tree[currnode * 2 + 1];
            }

            // Leaf node
            else if (curra == currb) {
                tree[currnode] = arr[curra];
            }

            else {

                // Insert flag node inverse
                // order of evaluation
                st.push(Arrays.asList(currnode, INF, INF));

                int mid = (curra + currb) / 2;

                // Push children
                st.push(Arrays.asList(currnode * 2, curra,
                        mid));
                st.push(Arrays.asList(currnode * 2 + 1,
                        mid + 1, currb));
            }
        }
    }

    // A utility function that propagates
    // updates lazily down the tree
    static void push_down(int node, int a, int b)
    {
        if (lazy[node] != 0) {
            tree[node] += lazy[node] * (b - a + 1);

            if (a != b) {
                lazy[2 * node] += lazy[node];
                lazy[2 * node + 1] += lazy[node];
            }

            lazy[node] = 0;
        }
    }

    // Iterative Range_Update function to
    // add val to all elements in the
    // range i-j (inclusive)
    static void update_tree(int arr_size, int i, int j,
                            int val)
    {

        // Initialize the stack
        Stack<List<Integer> > st = new Stack<>();

        // push the root of the tree
        st.push(Arrays.asList(1, 0, arr_size - 1));

        // Work until empty
        while (!st.isEmpty()) {

            // Take the indexes at the
            // top of the stack
            int currnode, curra, currb;
            List<Integer> temp = st.peek();
            currnode = temp.get(0);
            curra = temp.get(1);
            currb = temp.get(2);
            st.pop();

            // Flag with INF ranges are merged
            if (curra == INF && currb == INF) {
                tree[currnode] = tree[currnode * 2]
                        + tree[currnode * 2 + 1];
            }

            // Traverse the previous updates
            // down the tree
            else {
                push_down(currnode, curra, currb);

                // No overlap condition
                if (curra > currb || curra > j
                        || currb < i) {
                    continue;
                }

                // Total overlap condition
                else if (curra >= i && currb <= j) {

                    // Update lazy array
                    tree[currnode]
                            += val * (currb - curra + 1);

                    if (curra != currb) {
                        lazy[currnode * 2] += val;
                        lazy[currnode * 2 + 1] += val;
                    }
                }

                // Partial Overlap
                else {

                    // Insert flag node inverse
                    // order of evaluation
                    st.push(
                            Arrays.asList(currnode, INF, INF));

                    int mid = (curra + currb) / 2;

                    // Push children
                    st.push(Arrays.asList(currnode * 2,
                            curra, mid));
                    st.push(Arrays.asList(currnode * 2 + 1,
                            mid + 1, currb));
                }
            }
        }
    }

    // A function that find the sum of
    // all elements in the range i-j
    static int query(int arr_size, int i, int j)
    {

        // Initialize stack
        Stack<List<Integer> > st = new Stack<>();

        // push root of the tree
        st.push(Arrays.asList(1, 0, arr_size - 1));

        int result = 0;

        while (!st.isEmpty()) {

            // Take the indexes at the
            // top of the stack
            int currnode, curra, currb;
            List<Integer> temp = st.peek();
            currnode = temp.get(0);
            curra = temp.get(1);
            currb = temp.get(2);
            st.pop();

            // Traverse the previous updates
            // down the tree
            push_down(currnode, curra, currb);

            // No overlap
            if (curra > currb || curra > j || currb < i) {
                continue;
            }

            // Total Overlap
            else if (curra >= i && currb <= j) {
                result += tree[currnode];
            }

            // Partial Overlap
            else {
                int mid = (curra + currb) / 2;

                // Push children
                st.push(Arrays.asList(currnode * 2, curra,
                        mid));
                st.push(Arrays.asList(currnode * 2 + 1,
                        mid + 1, currb));
            }
        }

        return result;
    }

    // Driver Code
    public static void main(String[] args)
    {

        // Initialize our trees with 0
        Arrays.fill(tree, 0);
        Arrays.fill(lazy, 0);

        int arr[] = { 1, 3, 5, 7, 9, 11 };
        int n = arr.length;

        // Build segment tree from given array
        build_tree(arr, n);

        // Print sum of values in array
        // from index 1 to 3
        System.out.printf(
                "Sum of values in given range = %d\n",
                query(n, 1, 3));

        // Add 10 to all nodes at indexes
        // from 1 to 5
        update_tree(n, 1, 5, 10);

        // Find sum after the value is updated
        System.out.printf(
                "Updated sum of values in given range = %d\n",
                query(n, 1, 3));
    }
}

// This code is contributed by sanjeev2552