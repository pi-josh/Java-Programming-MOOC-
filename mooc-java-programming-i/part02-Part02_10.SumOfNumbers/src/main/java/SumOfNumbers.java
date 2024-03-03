
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variable to store the sum of
        // the inputted numbers
        int totalSum = 0;
        
        // Prompt the user until they input a zero
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check whether the input is zero or not
            if (num == 0) {
                break;
            } else {
                totalSum = totalSum + num;
            }
        }
        
        // Display the result
        System.out.println("Sum of the numbers: " + totalSum);
    }
}
