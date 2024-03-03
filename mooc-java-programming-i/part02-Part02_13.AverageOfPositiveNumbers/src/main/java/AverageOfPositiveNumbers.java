
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to keep track of
        int totalCountPositive = 0;
        int totalSum = 0;
        
        // Keep prompting the user for input
        // until they input a zero
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check whether the input is zero or not
            if (num == 0) {
                break;
            } else if (num > 0) {
                totalCountPositive = totalCountPositive + 1;
                totalSum = totalSum + num;
            }
        }
        
        // Check the count of positive number
        if (totalCountPositive == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            // Calculate the average of the sum of positive numbers
            double average = (double) totalSum / totalCountPositive;
            
            // Display the result
            System.out.println(average);
        }
    }
}
