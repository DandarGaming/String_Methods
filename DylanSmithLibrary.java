//Insert package name

//Rename class using Student's Name
public class DylanSmithLibrary {

    //generate acronym
    public static String generateAcronym(String text) {
        String[] words = text.split(" "); // splitting text ino individual words using ( ) to seperate
        String result = ""; // empty string to store acronym 
        String ignore = {"and", "of", "the", "an", "in", "on"}; // ignoring as it will add extra letter to acronym
        for (String word : words) {  //loop through words
            if (!word.isEmpty()) {  //skip extra space
                boolean skip = false; // to check for ignored words 
                for (String i : ignore) { //skip if word is ignored 
                    if (word.equalsIgnoreCase(i)) {
                        skip = true; //skipping word if matches ignore list
                        break; // stopping check
                    }
                }
                if (!skip) {
                    result += Character.toUpperCase(word.charAt(0)); 
                }
            }
        }
        return result;
    }
}

   //Example function 
    public static int getLength(String str) {
        return str.length();
    }

   //Function 2


  //Function 3 (if applicable)
   
    
} //end class 
