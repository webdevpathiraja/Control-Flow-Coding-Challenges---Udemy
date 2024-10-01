import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number or any character to exit: ");
            String numberString = scanner.nextLine();

            try {
                double validNum = Double.parseDouble(numberString);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }

                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }

                loopCount++;
            } catch (NumberFormatException nfe) {
                System.out.println("Program Exiting");
                break;
            }

        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}
