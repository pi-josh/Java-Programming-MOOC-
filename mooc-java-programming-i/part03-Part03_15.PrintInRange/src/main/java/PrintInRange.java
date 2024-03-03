
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(7);
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);
        
        System.out.println("The numbers in the range [2, 4]");
        printNumbersInRange(numbers, 2, 4);
        
        System.out.println("The numbers in the range [2, 4]");
        printNumbersInRange(numbers, 3, 7);
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
