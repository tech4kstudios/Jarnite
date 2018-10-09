//Define package
package jarnite;

//Import scanner
import java.util.Scanner;


public class game {
  
  static String cmd;
  static boolean invalid = false;
  static boolean badmove = false;
  
  public static void main(String[] args) throws InterruptedException {
    
    while(true){
      
      out:
        while (true) {
        
        if (!invalid && !badmove) {
          switch (geolocation.cmd1) {
            case "drive":
              load_mv_drive.main(args);
              break;
            case "sneak":
              load_mv_sneak.main(args);
              break;
            case "sprint":
              load_mv_sprint.main(args);
              break;
            case "walk":
              load_mv_walk.main(args);
              break;
            default:
              break;
          }
        }
        
        clear.c();
        
        geolocation.main(args);
        
        System.out.println("Enter command here");
        
        if (badmove) {
          System.out.println("Invalid move!");
          badmove = false;
        }
        else if (invalid) {
          System.out.println("Invalid command, type '?' for a list of commands!!");
          invalid = false;
        }
        
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
          while (true) {
            clear.c();
            System.out.println("Inventory opened!");
            System.out.println("Type exit to exit.");
            cmd = input.next();
            if (cmd.equals("exit")) {
              invalid = false;
              break out;
            }
          }
        }
        
        geolocation.move();
        
        break;
        
      }
    }
  }
}