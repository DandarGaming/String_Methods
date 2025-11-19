//Insert package name

//Rename class using Student's Name
public class JonathanMurphyLibrary {

    //Insert student 2's function's below

   //Function to check if a strin is a palindrome
    public static void PalindromeChecker(String userStr) {
        //Initialises a string builder variable
        StringBuilder palindromeBuilder = new StringBuilder();
        // clears the list of spaces as they are not considered in palindromes
        userStr = userStr.replaceAll(" ", "");
        //gets the length of the usersinput without spaces
        int palindromeLen = userStr.length();
        //Loops through the palindrome backwards for its length and adds each letter to the string builder
        for (int i = palindromeLen; i > 0;) {
            i -= 1;
            palindromeBuilder.append(userStr.charAt(i));
        }
        //Create a string variable from the data in the string builder
        String palindrome = palindromeBuilder.toString();
        //Checks if the user input and the reversed string are the same
        if (palindrome.equals(userStr)) {
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("No palindrome");
        }
    }

   //Function  to reverse the individual words in the string
    public static void ReverseWords(String userStr) { 
        //gets the length of the users string
        int len = userStr.length();
        //Initialise a string builer
        StringBuilder currentWord = new StringBuilder();
        //create a for loop to loop through the string
        for (int i = 0; i < len; i++) {
            // check if the current char is a space
            if (userStr.charAt(i) == ' ') {
                int listLen = currentWord.length();
                for (int x = listLen; x > 0;) {
                    x -= 1;
                    System.out.print(currentWord.charAt(x));
                }
                currentWord.setLength(0);
                //Spaces is printed to seperate words
                System.out.print(" ");
                //A space shows that a word ended
                //So we now loop backwards through the currentWord List and print out the chars
                //Then we clear the list so it can be used to generate the next word
            }
            else if (i == len - 1) {
                //Here we check if its the last char in the string
                //If it is we add it to the list then do the same thing as the above if statement
                currentWord.append(userStr.charAt(i));
                int listLen = currentWord.length();
                for (int x = listLen; x > 0;) {
                    x -= 1;
                    System.out.print(currentWord.charAt(x));
                }
                currentWord.setLength(0);
                System.out.print(" ");
            }
            else {
                // Since this is not a space we just add the current char the the currentWord list
                currentWord.append(userStr.charAt(i));
                
            }
        }
        //Set up the output window to print on a new line next time
        System.out.println("");
    }

  //Function to reverse the entire string
    public static void ReverseString(String userStr) {
        int len = userStr.length();
        for (int i = len; i > 0;) {
            i -= 1;
            System.out.print(userStr.charAt(i));
        }
        System.out.println(" ");
    }
    
} //end class 
