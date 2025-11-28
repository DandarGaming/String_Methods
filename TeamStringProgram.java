//Insert Relevant Package Name
import static JonathanMurphyLibrary.ReverseWords;
import static JonathanMurphyLibrary.ReverseString;
import static DanielSukhanovLibrary.CountWords;
import static DanielSukhanovLibrary.CountNum;
import static JonathanMurphyLibrary.PalindromeChecker;
import static ShaneCaulfieldLibrary.ConvertUpper;
import static DylanSmithLibrary.getLength;
import static DylanSmithLibrary.generateAcronym.;
import java.util.Scanner;


public class TeamStringProgram {
    //This initailizes all are variables and makes them global variables
    public static Scanner userInput = new Scanner( System.in);
    public static String userString, chosenOption, runAgain;;
    private static boolean endProgram = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //We prompt the user to enter the string that will be used in all the operations
        System.out.println("""
                           Welcome, 
                           Please enter a string to be analysed.""");
        //We do check to make sure its a valid string and reprompt the user if not
        do {
            System.out.print("Enter string here: ");
            userString = userInput.nextLine();
        } while (userString.trim().isEmpty());
        //We make a while loop that can run the code until the user wishes to quit
        do {            
            //We run this as long as the user did not prompt the program to quit
                //We prompt the user to enter the number of the operation they wish to carry out on their string 
                System.out.println("Enter the number of the operation you wish"
                        + " to carry out on the string.");
                System.out.println("""
                                   1. Count Vowels 
                                   2. Reverse the String 
                                   3. Convert String to uppercase 
                                   4. Generate an acronym 
                                   5. Count the number of words 
                                   6. Count the number of characters 
                                   7. count the number of digits 
                                   8. Reverse each word in the string 
                                   9. Check if the string is a palindrome""");
                System.out.println("Type any other number to exit the menu");
                System.out.print("Enter the option number here: ");
                chosenOption = userInput.nextLine();
                //once we have an option, we check what case it matches and launch the respective function
                switch (chosenOption) {
                    case "1" -> {
                        CountVowel(userString);
                    } 
                    case "2" -> {
                        ReverseString(userString);
                    }
                    case "3" -> {
                        ConvertUpper(userString);
                    }
                    case "4" -> {
                        System.out.println("Your acronym is " 
                                + generateAcronym(userString));
                        
                    }
                    case "5" -> {
                        CountWords(userString);
                        
                    }
                    case "6" -> {
                        System.out.println("There are " 
                                + getLength(userString) + " characters");
                    }
                    case "7" -> {
                        CountNum(userString);
                    }
                    case "8" -> {
                        ReverseWords(userString);
                    }
                    case "9" -> {
                        PalindromeChecker(userString);
                    }

                }
                //We check if the user has aready done an operation before prompting them with the quit menu
                System.out.println("""
                                   Do you want to end the Program 
                                   1. Yes 
                                   2. No
                                   Enter number here:""");
                runAgain = userInput.nextLine();
                switch (runAgain) {
                    case "1" -> {
                        endProgram = true;
                    }
                    case "2" -> {
                        endProgram = false;
                    }
                }
                
        } while (endProgram == false);

        System.out.println("Goodbye");
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



