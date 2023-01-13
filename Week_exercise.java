package week1;
import java.util.Scanner;
public class Week_exercise {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = inp.nextInt();
        System.out.print("Enter an integer: ");
        int y = inp.nextInt();
        System.out.print("Enter an integer: ");
        int z = inp.nextInt();

        if (z >= y && y >=x && z != x) {
            System.out.println("Increasing");
        } else if (z <= y && y <=x && z != x) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }

    }
}
