//Insert Relevant Package Name
import static JonathanMurphyLibrary.ReverseWords;
import java.util.Scanner;


public class TeamStringProgram {
    public static Scanner userInput = new Scanner( System.in);
    public static String userString;
    public static String chosenOption;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome, \n Please enter a string to be analysed.");
        do {
            System.out.println("Enter string here: ");
            userString = userInput.nextLine();
        } while (userString == null);
        
        System.out.println("Enter the number of the operation you wish to carry out on the string.");
        System.out.println("1. Count Vowels \n2. Reverse the String \n3. Convert String to uppercase \n4. Generate an acronym \n5. Count the number of words \n6. Count the number of characters \n7. count the number of digits \n8. Reverse each word in the string \n9. Check if the string is a palindrome");
        System.out.println("Enter string here: ");
        chosenOption = userInput.nextLine();
        switch (chosenOption) {
            case "1" -> {
                //Function here
            } 
            case "2" -> {
                //Function here
            }
            case "3" -> {
                //Function here
            }
            case "4" -> {
                //Function here
            }
            case "5" -> {
                //Function here
            }
            case "6" -> {
                //Function here
            }
            case "7" -> {
                //Function here
            }
            case "8" -> {
                ReverseWords(userString);
            }
            case "9" -> {
                JonathanMurphyLibrary.PalindromeChecker(userString);
            }
            
        }
    }
  // Modify getChoice method as required
    /*
    private static int getChoice(Scanner scanner) {
        int choice = -1;
        while (choice < 1 || choice > 3) {
            try {
                System.out.print("Enter your choice (1-3): ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number between 1 and 3.");
            }
        }
        return choice;
    } //end main 
    */
} //end class
