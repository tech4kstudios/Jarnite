//Define package
package jarnite;

//Import dependencies
import java.util.Scanner;

public class main_menu {
  
// ----------[ MAIN MENU ]----------
  
  public static void main(String[] args) throws InterruptedException {
    
    //Return to menu if invalid
    boolean invalid = false;
    while (true) {
      for (int i = 0; i < 50; ++i) System.out.println();
      
      //Creates a new scanner called MenuInput
      Scanner menu_input = new Scanner(System.in);
      
      //Prints out main menu pseudo-gui
      System.out.println(" *******************************************************************************");
      System.out.println(" *                                                                             *");
      System.out.println(" *                                                                             *");
      System.out.println(" *                  ~ WELCOME TO THE JARNITE BATTLE GROUNDS ~                  *");
      System.out.println(" *                                                                             *");
      System.out.println(" *                    Select an option to begin:                               *");
      System.out.println(" *                      1. Start                                               *");
      System.out.println(" *                      2. Instructions                                        *");
      System.out.println(" *                      3. List of Commands                                    *");
      System.out.println(" *                      4. Quit                                                *");
      System.out.println(" *                                                                             *");
      System.out.println(" *                                                                             *");
      System.out.println(" *                                                                             *");
      System.out.println(" *                                                                             *");
      System.out.println(" *                                                                             *");
      System.out.println(" *                                                                             *");
      System.out.println(" *  Version: JBG-0.something-alpha                                             *");
      System.out.println(" *  \u00a9 2018 | Tech4K Studios                                                    *");
      System.out.println(" *******************************************************************************");
      if (invalid) {System.out.println("Unknown option, try again by choosing a number!");}
      //No more copyright symbol problems!
      
      //Requests input from user
      String menu_selection = menu_input.next();
      for (int i = 0; i < 50; ++i) System.out.println();
      
      //Processes the request
      if (menu_selection.equals("1")) {
        menu_input.close();
        
        //Send user to starting location
        geolocation.LocationLibrary(args);
      }
      else if (menu_selection.equals("2")) {
        
        //TODO: add instructions
        System.out.println("TODO: add instructions");
        
        //Exit to main menu prompt
        System.out.println("Type 'menu' to exit to the Main Menu.");
        
        //Process user input
        while (true) {
          
          //Scanner checking for user input
          String exit = menu_input.next();
          
          //Check Entered Number
          if (exit.equals("menu")) {
            main(args);
          }
          else
          {
            System.out.println("Unknown option, try again!");
          }
        }
      }
      else if (menu_selection.equals("3")) {
        commands.ListOfCommands();
        
        //Exit to main menu prompt
        System.out.println("Type 'menu' to exit to the Main Menu.");
        
        //Process user input
        while (true) {
          
          //Scanner checking for user input
          String exit = menu_input.next();
          
          //Check Entered Number
          if (exit.equals("menu")) {
            main(args);
          }
          else
          {
            System.out.println("Unknown option, try again!");
          }
        }
      }
      else if (menu_selection.equals("4")) {
        
        //Terminate the program
        System.exit(0);
      }
      else 
      {
        invalid = true;
      }
    }
  }
}
