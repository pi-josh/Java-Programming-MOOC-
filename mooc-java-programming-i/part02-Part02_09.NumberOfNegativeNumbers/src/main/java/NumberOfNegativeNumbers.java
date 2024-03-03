
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variable to keep track of the
        // total count of negative numbers
        int totalNegative = 0;
        
        // Prompt the user for a number
        // until they input a zero
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check whether they input a negative number or not
            if (num < 0) {
                totalNegative = totalNegative + 1;
                continue;
            } else if (num == 0) {
                break;
            }
        }
        
        // Display the result
        System.out.println("Number of negative numbers: " + totalNegative);
    }
}
