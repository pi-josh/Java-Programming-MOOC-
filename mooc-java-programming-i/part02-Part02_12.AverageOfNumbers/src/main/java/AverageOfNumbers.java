
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to keep track of
        int totalNumCount = 0;
        int totalSum = 0;
        
        // Keep prompting the user for input
        // until they input a zero
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check whether the input is zero or not
            if (num == 0) {
                break;
            } else {
                totalNumCount = totalNumCount + 1;
                totalSum = totalSum + num;
            }
        }
        
        // Calculate the average
        double average = (double) totalSum / totalNumCount;
        
        // Display the result
        System.out.println("Average of the numbers: " + average);
    } 
}
