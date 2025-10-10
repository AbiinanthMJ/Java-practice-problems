package moduleapplicationsTraining.one;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    ArrayList<People> listofpeople = new ArrayList<>(4);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main o = new Main();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the Name :");
            String name = sc.nextLine();
            System.out.println("Enter the Height :");
            int height = sc.nextInt();
            System.out.println("Enter the Age :");
            int age = sc.nextInt();
            System.out.println("Enter the Character Grade Out of 10:");
            int character = sc.nextInt();
            System.out.println("Enter the Marks for the Three Subjects Out of 100:");
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) {
                marks[j] = sc.nextInt();
            }
            sc.nextLine();
            o.listofpeople.add(o.AddPeople(name, age, height, character, marks));
        }
        sc.close();
        o.display();
    }
    private People AddPeople(String name, int age, int height, int character, int[] marks) {
        People people = new People(name, height, age, character, marks);
        return people;
    }
    public void display() {
        for (People p : listofpeople) {
            System.out.println(p);
        }
    }
}
