//Insert package name
import java.util.Scanner; // imports Scanner library
//Rename class using Student's Name
public class DanielSukhanovLibrary {

    //Insert student 1's function's below
    //Function 1(Count Words)
public static void CountWords(String userStr) {
        userStr = userStr.replaceAll(" ","");
        String sentence = userStr; 
       int Words = sentence.split("\\s").length;
       System.out.println(Words);

    
}//end function

   //Function 2 (Count Numbers)
public static void CountNum(String userStr) {
        userStr = userStr.replaceAll(" ", "");
        String sentence = userStr;
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
        String sentence = userStr;
        int vowel = 0;
    
        for (char c : text.toLowerCase().toCharArray()) { //text does not exist as a variable
          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowel++;
          }
        }
    
    System.out.println("Vowels: " + count);  // count does not exist as a variable 
    } //end function
} //end class 

