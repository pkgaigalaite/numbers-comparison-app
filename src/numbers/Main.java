package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long number1 = 0, number2 = 0;
        boolean inputAccepted = false;
        while (!inputAccepted) {
            System.out.println("Please enter 2 numbers");
            Scanner scanner = new Scanner(System.in);
            try {
                number1 = scanner.nextLong();
                number2 = scanner.nextLong();
                inputAccepted = true;
            } catch (Exception ex) {
                System.out.println("Program accepts only numbers");
            }
        }
        NumberComparator numberComparator = new BinaryComparator();
        NumberGenerator firstNumberGenerator = new NumberGeneratorA();
        NumberGenerator secondNumberGenerator = new NumberGeneratorB();

        NumberDerivation numberDerivation = new NumberDerivation(numberComparator,
                firstNumberGenerator,
                secondNumberGenerator);
        int matchCount = numberDerivation.getResult(number1, number2);
        System.out.println("Match count " + matchCount);
    }
}
