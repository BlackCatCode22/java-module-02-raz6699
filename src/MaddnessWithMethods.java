import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = getAnIntFromTheUser(scanner, "Enter the first integer: ");
        int secondInt = getAnIntFromTheUser(scanner, "Enter the second integer: ");

        compareTwoInts(firstInt, secondInt);
        int sum = sumTwoInts(firstInt, secondInt);
        System.out.println("The sum of the two integers is: " + sum);

        scanner.close();
    }

    public static int getAnIntFromTheUser(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static int sumTwoInts(int a, int b) {
        return a + b;
    }
}
