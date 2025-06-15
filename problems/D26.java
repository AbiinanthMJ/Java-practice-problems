package problems;

public class D26 {
    public static void main(String[] args) {
        int num =1101057;
        String numtostr = Integer.toString(num);
        int a = num;
        for (int i = 0; i < numtostr.length(); i++) {
            char c = numtostr.charAt(i);
            String replaced = numtostr.replace(c, '9');
            if (replaced.charAt(0) != '0') {
                a = Math.max(Integer.parseInt(replaced), a);
            }
        }
        String minStr = numtostr;
        char firstChar = minStr.charAt(0);
        if (firstChar != '1') {
            minStr = minStr.replace(firstChar, '1');
        } else {
            for (int i = 1; i < minStr.length(); i++) {
                if (minStr.charAt(i) != '0' && minStr.charAt(i) != '1') {
                    minStr = minStr.replace(minStr.charAt(i), '0');
                    break;
                }
            }
        }
        int b=Integer.parseInt(minStr);
        System.out.println(a-b);
    }
}
