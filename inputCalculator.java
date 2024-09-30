import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
            inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number or a character to exit: ");
            String input = scanner.nextLine();

            try {
                double validNumber = Double.parseDouble(input);
                count++;
                sum += validNumber;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (count > 0) {
            long average = Math.round((double) sum / count);
            System.out.println("sum = " + sum + " average = " + average);
        } else {
            System.out.println("No valid numbers entered");
        }
    }
}
