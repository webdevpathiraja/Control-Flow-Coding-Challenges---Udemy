public class flourPackProblem {
    public static void main(String[] args) {
        // Test the canPack method with bigCount = 1, smallCount = 0, and goal = 4
        System.out.println(canPack(1, 0, 4));
    }

    /**
     * This method checks if it is possible to achieve the goal weight
     * using bigCount bags (each weighing 5 kg) and smallCount bags (each weighing 1 kg).

     * bigCount - the number of big bags (each weighing 5 kg)
     * smallCount - the number of small bags (each weighing 1 kg)
     * goal - the target weight to achieve
     * boolean - true if the goal can be achieved using the available bags, false otherwise
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // If any of the input values are negative, return false
        if (bigCount < 0 || goal < 0 || smallCount < 0) {
            return false;
        }

        int bigWeight = 5; // Each big bag weighs 5 kg
        boolean result = false; // Initialize the result to false
        int totalBigWeight = bigCount * bigWeight; // Calculate total weight of all big bags

        // Check if we can meet the goal using only big bags or a
        // combination of both big and small bags
        if (totalBigWeight >= goal) {
            // Calculate the remaining weight that needs to be filled after using big bags
            int remainingWeight = goal % bigWeight;

            // If small bags can cover the remaining weight, set result to true
            if (smallCount >= remainingWeight) {
                result = true;
            }

        } else {
            // If the total weight of big bags is less than the goal,
            // check if the remaining weight can be covered by small bags
            if (smallCount >= (goal - totalBigWeight)) {
                result = true;
            }
        }

        // Return the final result
        // (true if we can pack the flour, false otherwise)
        return result;
    }
}

