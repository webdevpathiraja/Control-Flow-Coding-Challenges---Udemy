public class numberToWords {
    public static void main(String[] args) {
numberToWords(156);
    }

    public static void numberToWords(int number) {
        /*if (number < 0) {
            System.out.println("Invalid Value");
        }*/

        int lastDigit = number % 10;
        //int restOfTheDigits = number / 10;

        switch (lastDigit){
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            case 6 -> System.out.println("six");
            case 7 -> System.out.println("seven");
            default -> System.out.println("invalid");





        }
    }

}
