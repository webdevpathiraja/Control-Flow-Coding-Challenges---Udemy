public class numberInWord {
    public static void main(String[] args) {
        printNumberInWord(-10);
    }

    public static void printNumberInWord (int number) {
        String numberInWord = switch (number) {
            case 0 -> {yield "zero"; }
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "other";
        };

        System.out.println(number + " = " + numberInWord);

    }
}
