
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String text = "";
        do {
            text = scanner.nextLine();
            String[] pieces = text.split(" ");
            
            for(int i = 0; i < pieces.length; i++) {
                if(pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
            }
        } while(text.length() != 0);
    }
}
