//Define package
package jarnite;

//Import scanner
import java.util.Scanner;


public class game {
  
  static String cmd;
  static boolean invalid = false;
  static boolean badmove = false;
  
  public static void main(String[] args) throws InterruptedException {
    
    //Main game loop
    game:
      while(true){
      
      out:
        while (true) {
        //Checks from the previous command
        if (!invalid && !badmove && !player.battleCommenced) {
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
          item_random_spawn.found = 0;
        }
        
        clear.c();
        //Validates the user's move
        geolocation.main(args);
        
        //Item & weapon random spawn
        item_random_spawn.main(args);
        
        //NPC attack loop
        //player.attack();
        
        //NPC loop
        player.main(args);
        
        if (player.die) {
          endgame.main(args);
        }
        
        if (badmove) {
          System.out.println(" Invalid move!");
          badmove = false;
        }
        else if (invalid) {
          System.out.println("\n Unknown command, type '?' for a list of commands!\n");
          invalid = false;
        }
        
        
        //----------Asks user for next command.
        //System.out.print(" geolocation.next = ");
        System.out.print(" > ");
        
        Scanner input = new Scanner(System.in);
        cmd = input.next();
        
        //If user requests help menu
        if (cmd.equals("?")) {
          while (true) {
            commands.ListOfCommands();
            
            System.out.println(" Type 'back' to return to previous screen.");
            
            cmd = input.next();
            if (cmd.equals("back")) {
              invalid = false;
              break out;
            }
          }
        }
        //If user requests inventory
        else if (cmd.equals("inv")) {
          inv.open();
          break out;
        }
        //Perform move
        geolocation.move();
        
        //Back to the beginning!
        break;
        
      }
    }
  }
}
