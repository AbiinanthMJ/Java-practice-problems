package vh;

public class n28 {
  void oddSeries(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            System.out.print(num + " ");
            num += 2;   
            count++;    
        }
    }

    public static void main(String[] args) {
        
        n28 obj = new n28();

      
        int n = 5;

        System.out.println("First " + n + " Even numbers:");
        obj.oddSeries(n);
    }
}   

