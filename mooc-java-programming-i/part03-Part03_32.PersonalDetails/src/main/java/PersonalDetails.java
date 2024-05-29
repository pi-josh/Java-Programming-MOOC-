
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0, longest = 0;
        double sum = 0, average = 0;
        String longest_name = "";
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int current = parts[0].length();
            count++;
            sum += Double.valueOf(parts[1]);
            
            if(current > longest) {
                longest = current;
                longest_name = parts[0];
            }
        }
        average = sum / count;
        System.out.println("Longest name: " + longest_name);
        System.out.println("Average of the birth years: " + average);
    }
}
