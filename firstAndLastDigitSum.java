public class firstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(569));
    }

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number >= 10) {
            firstDigit = number /= 10;

        }
        return (firstDigit + lastDigit);
    }

}
