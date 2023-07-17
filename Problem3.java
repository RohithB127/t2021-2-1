
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input a:");
        int a = sc.nextInt();
        if (a < 1)
            System.out.println("Invalid input. 'a' must be greater than or equal to 1.");
        else {
            if (a % 2 == 0)
                a = a - 1;
            System.out.print("Output: ");
            for (int i = 1; i <= a; i++) {

                System.out.print(2 * i - 1);
                if (i != a)
                    System.out.print(", ");

            }
        }
    }
}
