
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to keep track of
        int totalCountNum = 0;
        int totalSum = 0;
        
        // Prompt the user until they input zero
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check whether they input zero or not
            if (num == 0) {
                break;
            } else {
                totalCountNum = totalCountNum + 1;
                totalSum = totalSum + num;
            }
        }
        
        // Display the results
        System.out.println("Number of numbers: " + totalCountNum);
        System.out.println("Sum of the numbers: " + totalSum);
    }
}
