//Define package
package jarnite;

//Import scanner
import java.util.Scanner;


public class game {
  
  static String cmd;
  static boolean invalid = false;
  static boolean badmove = false;
  //static boolean invreturn = false;
  
  public static void main(String[] args) throws InterruptedException {
    //Main game loop
    while(true){
      
      out:
        while (true) {
        //Checks from the previous command
        if (!invalid && !badmove) {
          //Runs progress bars from previous command
          switch (geolocation.cmd1) {
            case "mv-drive":
              load_mv_drive.main(args);
              break;
            case "mv-sneak":
              load_mv_sneak.main(args);
              break;
            case "mv-sprint":
              load_mv_sprint.main(args);
              break;
            case "mv-walk":
              load_mv_walk.main(args);
              break;
            default:
              break;
          }
        }
        
        clear.c();
        //Validates the user's move
        geolocation.main(args);
        
        if (badmove) {
          System.out.println("Invalid move!");
          badmove = false;
        }
        else if (invalid) {
          System.out.println("Unknown command, type '?' for a list of commands!");
          invalid = false;
        }
        //Asks user for next command.
        System.out.print("geolocation.next = ");
        
        Scanner input = new Scanner(System.in);
        cmd = input.next();
        
        //If user requests help menu
        if (cmd.equals("?")) {
          while (true) {
            commands.ListOfCommands();
            System.out.println("Type exit to exit.");
            cmd = input.next();
            if (cmd.equals("exit")) {
              invalid = false;
              break out;
            }
          }
        }
        //If user requests inventory
        else if (cmd.equals("inv")) {
          openinventory.main(args);
          break out;
        }
        //Perform move
        geolocation.move();
        
        break;
        
      }
    }
  }
}
