import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        
        // Loop to read three lines of input
        for (int i = 0; i < 3; i++) {
            String str = scan.next();
            int num = scan.nextInt();
            
            // Print formatted output
            System.out.printf("%-15s%03d%n", str, num); //(formatting, Object, args) 
            //%-15s ensures that the string is left-justified and takes up 15 characters.
            //%03d ensures the integer is padded with zeroes if it has fewer than three digits.
            //%n adds a newline after each formatted line.
        }
        
        System.out.println("================================");
    }
}
