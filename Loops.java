public class Loops {
    // Switch Case:
    /*
     * public static void main(String[] args) {
     * char grade = 'C';
     * 
     * switch (grade) {
     * case 'A':
     * System.out.println("Good");
     * 
     * case 'B':
     * System.out.println("Average");
     * 
     * case 'C':
     * System.out.println("OK-OK");
     * break;
     * case 'D':
     * System.out.println("Worst");
     * 
     * case 'F':
     * System.out.println("FAIL");
     * 
     * default:
     * 
     * }
     * System.out.println("Your Grade is " + grade);
     * }
     * }
     * 
     * 
     * public static void main(String args[]) {
     * /*
     * int x = 1;
     * while (x < 20) {
     * System.out.println(x);
     * x++;
     */
    // Same for accessing array elements through indexing using the while loop
    /*
     * int index = 0;
     * int[] num = { 1, 4, 8, 9, 3, 7 };
     * while (index <= 5) {
     * System.out.println(num[index]);
     * index++;
     */

    // Infinite While Loop
    /*
     * int x = 9;
     * while (true) {
     * System.out.println(x);
     * x++;
     * }
     * }
     */

    // For Loop
    public static void main(String args[]) {
        /*
         * int x = 10;
         * for (int i = 0; i < x; i++) {
         * System.out.println(i);
         * }
         */
        // For Loop in arrays
        /*
         * int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
         * for (int i = 0; i < 5; i++) {
         * System.out.println(number[i]);
         * }
         */

        // Do while loop
        // It need to execute at one time
        // Condition is get checked after the loop execution
        /*
         * int z = 0;
         * do {
         * 
         * if (z == 7) {
         * break;
         * }
         * System.out.println(z);
         * z++;
         * } while (z < 15);
         */
        // Break and Continue statement
        for (int i = 0; i < 20; i++) {

            if (i == 8) {
                continue;
            }
            System.out.println(i);
        }

    }
}