/*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
    Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
    Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string */

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        double a, b;
        String typeOfOper;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter Type of Operation: ");
        typeOfOper = sc.next();
        switch (typeOfOper) {
            case "add":
                System.out.println(a + b);
                break;
            case "sub":
                System.out.println(a - b);
                break;
            case "mul":
                System.out.println(a * b);
                break;
            case "div":
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("DivideByZeroException, b=0");
        }
    }
}