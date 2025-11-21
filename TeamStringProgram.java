//Insert Relevant Package Name
import static JonathanMurphyLibrary.ReverseWords;
import static JonathanMurphyLibrary.ReverseString;
import static DanielSukhanovLibrary.CountWords;
import static DanielSukhanovLibrary.CountNum;
import static JonathanMurphyLibrary.PalindromeChecker;
import static ShaneCaulfieldLibrary.ConvertUpper;
//placeholder import static ShaneCaulfieldLibrary.;
//placeholder import static DylanSmithLibrary.;
import static  DylanSmithLibrary.generateAcronym.;
import java.util.Scanner;//imports the scanner tool


public class TeamStringProgram {
    //This initailizes all are variables and makes them global variables
    public static Scanner userInput = new Scanner( System.in);
    public static String userString, chosenOption, runAgain;;
    private static boolean hasOutput = false, endProgram = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //We prompt the user to enter the string that will be used in all the operations
        System.out.println("Welcome, \n Please enter a string to be analysed.");
        //We do check to make sure its a valid string and reprompt the user if not
        do {
            System.out.print("Enter string here: ");
            userString = userInput.nextLine();//scanner scanning for user input
        } while (userString == null);
        //We make a while loop that can run the code until the user wishes to quit
        do {
            //We check if the user has aready done an operation before prompting them with the quit menu
            if (hasOutput == true) {
                System.out.println("Do you want to end the Program \n1. Yes \n2. No\nEnter number here:");
                runAgain = userInput.nextLine();
                switch (runAgain) {
                    case "1" -> {
                        endProgram = true;
                    }
                    case "2" -> {
                        endProgram = false;
                    }
                }
            }
            
            //We run this as long as the user did not prompt the program to quit
            if (endProgram == false) {
                //We prompt the user to enter the number of the operation they wish to carry out on their string 
                System.out.println("Enter the number of the operation you wish to carry out on the string.");
                System.out.println("1. Count Vowels \n2. Reverse the String \n3. Convert String to uppercase \n4. Generate an acronym \n5. Count the number of words \n6. Count the number of characters \n7. count the number of digits \n8. Reverse each word in the string \n9. Check if the string is a palindrome");//menu output of the possible functions
                System.out.print("Enter the option number here: ");
                chosenOption = userInput.nextLine();
                //once we have an option, we check what case it matches and launch the respective function
                switch (chosenOption) {
                    case "1" -> {
                        CountVowel(userString);// Function from DanielSukhanovLibrary.java
                    } 
                    case "2" -> {
                        ReverseString(userString);// Function from JonathanMurphyLibrary.java
                    }
                    case "3" -> {
                        ConvertUpper(userString);// Function from ShanCaulfieldLibrary.java
                    }
                    case "4" -> {
                        System.out.println("Your acronym is " + generateAcronym(userString));//// Function from DylanSmithLibrary.java
                    }
                    case "5" -> {
                        CountNum(userString);// Function from DanielSukhanovLibrary.java
                    }
                    case "6" -> {
                        //Function here
                    }
                    case "7" -> {
                        CountWords(userString);// Function from DanielSukhanovLibrary.java
                    }
                    case "8" -> {
                        ReverseWords(userString);// Function from JonathanMurphyLibrary.java
                    }
                    case "9" -> {
                        PalindromeChecker(userString);// Function from JonathanMurphyLibrary.java
                    }

                }
                //We update the program to know that is has passed the loop atleast once
                hasOutput = true;
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
