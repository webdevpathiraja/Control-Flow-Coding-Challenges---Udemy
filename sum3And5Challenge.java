public class sum3And5Challenge {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 & 5");
                sum += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("The total of the numbers that are" +
                " divisible by both 3 & 5 = " + sum);
    }


}
