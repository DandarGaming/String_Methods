//Insert package name
import java.util.Scanner; // imports Scanner library
//Rename class using Student's Name
public class DanielSukhanovLibrary {

    //Insert student 1's function's below
public static void CountWords(String userStr) {
        userStr = userStr.repalceAll(" ","");
        Scanner input = new Scanner(System.in); // Declaration for Scanner
        System.out.println("Please input your sentence");
        String sentence = input.nextLine();
       int Words = sentence.split("\\s").length;
       System.out.println(Words);

    
}//end class

   //Function 2
public static void CountNum(String userStr) {
        userStr = userStr.replaceAll(" ", "");
        Scanner input = new Scanner(System.in); // Declaration for Scanner
        System.out.println("Please input your sentence");
        String sentence = input.nextLine();
        int Numcount = 0;// sets the integer variable Numcount to zero 

        for (char i : sentence.toCharArray()) {//for loop to check through the character array of sentence variable
          if (Character.isDigit(i)) {
            Numcount++;
          }
        }
        System.out.println("Digits: " + Numcount);
}

  //Function 3 (if applicable)
   
    
} //end class 

//TODO: CHANGE THE CLASSES INTO FUNCTIONS!!!!
