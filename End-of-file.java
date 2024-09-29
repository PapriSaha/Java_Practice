import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber =1;

        // Keep reading until there is no more input
        while(scan.hasNext()){
         String Line = scan.nextLine();

         // Print line number followed by the content of the line
         System.out.println(lineNumber + " " + Line);
         
         lineNumber++;
            
        }

        scan.close(); //closing the scanner
    }
}
