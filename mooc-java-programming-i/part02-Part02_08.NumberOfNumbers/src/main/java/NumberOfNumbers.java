
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variable to keep track of the count of numbers
        int totalNum = 0;
        
        while (true) {
            // Prompt the user for a number
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            // Check whether the number is zero or not
            if (num == 0) {
                break;
            } else {
                totalNum = totalNum + 1;
            }
        }
        
        // Display the total amount of numbers
        System.out.println("Number of numbers: " + totalNum);
    }
}
