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
    
    while(true){
      
      out:
        while (true) {
        
        if (!invalid && !badmove) {
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
        
        geolocation.main(args);
        
        if (badmove) {
          System.out.println("Invalid move!");
          badmove = false;
        }
        else if (invalid) {
          System.out.println("Unknown command, type '?' for a list of commands!");
          invalid = false;
        }
        
        System.out.print("geolocation.next = ");
        
        Scanner input = new Scanner(System.in);
        cmd = input.next();
        
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
        else if (cmd.equals("inv")) {
          openinventory.main(args);
          break out;
        }
        
        geolocation.move();
        
        break;
        
      }
    }
  }
}
