//Insert package name
import java.util.Scanner; // imports Scanner library
//Rename class using Student's Name
public class DanielSukhanovLibrary {

    //Insert student 1's function's below
    //Function 1(Count Words)
public static void CountWords(String userStr) {//CountWords Function that utilises userStr
        userStr = userStr.replaceAll(" ","");
        String sentence = userStr; //sentence being declared to userStr
       int Words = sentence.split("\\s").length;
       System.out.println(Words);//Outputs Words Variable

    
}//end function

   //Function 2 (Count Numbers)
public static void CountNum(String userStr) {//CountsNum function that utilises userStr
        userStr = userStr.replaceAll(" ", "");
        String sentence = userStr; //sentence being declared to userStr
        int Numcount = 0;// sets the integer variable Numcount to zero 

        for (char i : sentence.toCharArray()) {//for loop to check through the character array of sentence variable
          if (Character.isDigit(i)) {//checks if the character within the sentence variable is a digit using the if statement utilising i as the position of the sentence
            Numcount++;//Numcount + 1
          }
        }
        System.out.println("Digits: " + Numcount);
}//end function

  //Function 3 (Count Vowels)
    public static  void CountVowel(String userStr) {//CountVowel function that utilises userStr
        userStr = userStr.replaceAll(" ", "");
        String sentence = userStr;
        int vowel = 0;//Declares vowel int variable as 0
    
        for (char c : text.toLowerCase().toCharArray()) {//for loop to loop through the inputted userStr
          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {//checks if the c variable index is a vowel by using the if statement and the "or" function
            vowel++;
          }
        }
    
    System.out.println("Vowels: " + vowel);  //Outputs the amount of Vowels and also concatonates the count variable
    } //end function
} //end class 

