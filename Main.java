import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();

            System.out.println("Hello, " + name + ". Please enter your annual income:");
            int income = scanner.nextInt();

            System.out.println("Now, please enter your credit score:");
            int creditScore = scanner.nextInt();

            System.out.println("Finally, please enter your debt to income ratio (as a percentage):");
            double debtToIncomeRatio = scanner.nextDouble();

            if (income >= 60000 && creditScore >= 650 && debtToIncomeRatio <= 35.0) {
                System.out.println("You qualify to rent an apartment.");
            } else {
                System.out.println("Sorry, you don't qualify to rent an apartment.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter only numeric values for income, credit score, and debt to income ratio.");
        } finally {
            scanner.close();
        }
    }
}
