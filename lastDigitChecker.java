public class lastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit (int first, int second, int third) {
        boolean firstValid = first >= 10 && first <= 1000;
        // firstValid will be true if first is between 10 and 1000;
        // otherwise, it will be false.
        boolean secondValid = second >= 10 && second <= 1000;
        boolean thirdValid = third >= 10 && third <= 1000;

        if (!firstValid || !secondValid || !thirdValid) {
            return false;
        }

        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;

        boolean compareLastDigit = (firstLastDigit == secondLastDigit) ||
                (secondLastDigit == thirdLastDigit) ||
                (firstLastDigit == thirdLastDigit);
        //If a match is found, compareLastDigit will be true;
        // otherwise, it will remain false.

        return compareLastDigit;
    }
 }
