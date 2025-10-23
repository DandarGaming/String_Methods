//Insert Relevant Package Name

public class TeamStringProgram {
    public static void main(String[] args) {

      //Decalre and initialise variables 
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

      //Output program heading


      //Loop to repeat program

            //Prompt user for relevant info
            
            //Call a function to display the program menu

            //Call a function to get the users menu choice
            int choice = getChoice(scanner);

            //Switch on the user's menu choice
            switch (choice) {
                case 1:
                    //Call relevant method in relevant library and display result
                    System.out.println("Length of the string: " + Student1NameLibrary.getLength(inputString));
                    break;
 
                default:
                    System.out.println("Invalid choice. Please try again.");
            } //end switch 
      
        //end loop

        scanner.close();

        //Display exit message
      
    }

    private static void displayMenu() {

       //Output menu options
        System.out.println("\nChoose an option:");

    }

  // Modify getChoice method as required
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
} //end class
