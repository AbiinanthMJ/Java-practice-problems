package problems;

import java.util.Iterator;
import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args) {
        validparanthesis obj = new validparanthesis();
        System.out.println(obj.isvalidparanthesis());

    }
    boolean isvalidparanthesis () {
        String s = "{[(*))]}";
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i > 0 && c == s.charAt(i - 1)) {
                continue;
            }
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            }
            else if (c=='*') {
                continue;
            }
            else {
                    if (st.isEmpty()) return false;
                    if((c=='}'&&st.peek()=='{')||(c==']'&&st.peek()=='[')||(c==')'&&st.peek()=='(')){
                        st.pop();
                    }
                    else {
                        return false;
                    }

                }
            }
        return st.isEmpty();
    }
}
