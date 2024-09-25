public class allFactors {
    public static void main(String[] args) {
        printFactors(8);
    }

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
            } i++;
        }
    }
}
