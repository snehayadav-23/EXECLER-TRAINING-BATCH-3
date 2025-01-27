public class Demo002 {
    public static void main(String[] args) {
        // Define the range
        int n = 100;

        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check for FizzBuzz (divisible by both 3 and 5)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check for Fizz (divisible by 3)
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check for Buzz (divisible by 5)
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }
}
