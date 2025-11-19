//Insert package name
import java.util.Scanner; // imports Scanner library
//Rename class using Student's Name
public class DanielSukhanovLibrary {

    //Insert student 1's function's below
    //Function 1(Count Words)
public static void CountWords(String userStr) {
        userStr = userStr.replaceAll(" ","");
        Scanner input = new Scanner(System.in); // Declaration for Scanner
        String sentence = input.nextLine();  // You are still declaring and accepting a scanner input when you no longer have a input prompt, is this needed for the code? You still are using the input while not using the userStr which is passed to the function from the main menu file.
       int Words = sentence.split("\\s").length;
       System.out.println(Words);

    
}//end function

   //Function 2 (Count Numbers)
public static void CountNum(String userStr) {
        userStr = userStr.replaceAll(" ", "");
        Scanner input = new Scanner(System.in); // Declaration for Scanner
        String sentence = input.nextLine();
        int Numcount = 0;// sets the integer variable Numcount to zero 

        for (char i : sentence.toCharArray()) {//for loop to check through the character array of sentence variable
          if (Character.isDigit(i)) {
            Numcount++;
          }
        }
        System.out.println("Digits: " + Numcount);
}//end function

  //Function 3 (Count Vowels)
    public static  void CountVowel(String userStr) {
        userStr = userStr.replaceAll(" ", "");
        Scanner input = new Scanner(System.in); // Declaration for Scanner
        String sentence = input.nextLine();
        int vowel = 0;
    
        for (char c : text.toLowerCase().toCharArray()) {
          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowel++;
          }
        }
    
    System.out.println("Vowels: " + count);  
    } //end function
} //end class 

