package vh;

public class n27 {
    void oddSeries(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            System.out.print(num + " ");
            num += 2;   
            count++;    
        }
    }

    public static void main(String[] args) {
        
        n27 obj = new n27();

      
        int n = 5;

        System.out.println("First " + n + " odd numbers:");
        obj.oddSeries(n);
    }
}

    

