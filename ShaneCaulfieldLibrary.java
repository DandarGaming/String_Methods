//Insert package name
import java.util.HashMap;
//Rename class using Student's Name
public class ShaneCaulfieldLibrary {
    //Insert student 3's function's below
  public static void Example(String[] args) {//change this into a function would look like this "public static void Example(Input 1,Input 2)"
    String text = "banana"; // Remove this as we need to use the user input (userStr) See main java file
    HashMap<Character, Integer> freq = new HashMap<>();

    for (char c : text.toCharArray()) {
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }

    System.out.println(freq);
    // Output: {a=3, b=1, n=2}
  }
}

    
   //Example function 
    public static int getLength(String str) { 
        return str.length();
    }

   //Function 2


     String txt = "Hello World";
     System.out.println(txt.toUpperCase());
     System.out.println(txt.toLowerCase());






  //Function 3 (if applicable)

 

    public static void main(String[] args) {
        String input1 = "example function";

        System.out.println(imput1);
        System.out.println(imput1.toUpperCase()); 
      }

  {




    
} //end class 
