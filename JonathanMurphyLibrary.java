//Insert package name

//Rename class using Student's Name
public class JonathanMurphyLibrary {

    //Insert student 2's function's below

   //Example function 
    public static void PalindromeChecker(String userStr) {
        //make a list to contain the chars from the string input
        //Run the for loop to input the chars into the list
        //Compare the list in reverse compared to the string in normal layout
        //Then if the chars are the same, move on to next and check again,
        //If different, stop and saynot a palindrome
        //MAke sure spaces ont interfere, if they do do something about it
        //Idea 1 to deal with spaces: make 2 if statements above the comparision if statement, 
        //this checks if the current char of the string is a space, if so skip it and add 1 to the count
        //then check if the list has a space, if so do the same as the string
        StringBuilder palindromeBuilder = new StringBuilder();
        int palindromeLen = userStr.length();
        for (int i = palindromeLen; i > 0;) {
            i -= 1;
            palindromeBuilder.append(userStr.charAt(i));
        }
        String palindrome = palindromeBuilder.toString();
        userStr = userStr.replaceAll(" ", "");
        palindrome = palindrome.replaceAll(" ", "");
        if (palindrome.equals(userStr)) {
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("No palindrome");
        }
    }

   //Function 2
    public static void ReverseWords(String userStr) { 
        int len = userStr.length();
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
                System.out.print(" ");
                //A space shows that a word ended
                //So we now loop backwards through the List and print out the chars
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
        
        System.out.println("");
    }

  //Function 3 (if applicable)
   
    
} //end class 
