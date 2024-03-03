
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int num, sum = 0, numCount = 0;
        int evenCount = 0, oddCount = 0;
        double ave = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                ave = (double) sum / numCount;
                
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + numCount);
                System.out.println("Average: " + ave);
                System.out.println("Even: " + evenCount);
                System.out.println("Odd: " + oddCount);
                break;
            } else {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                sum += num;
                numCount++;
            }
            
        }

    }
}
