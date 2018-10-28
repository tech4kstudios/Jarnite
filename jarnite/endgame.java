/*
 ██████╗   █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ ██╗
 ██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗██║
 ██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝██║
 ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗╚═╝
 ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║██╗
 ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝╚═╝
 */

//Define package
package jarnite;

//Import scanner
import java.util.Scanner;

public class endgame {
  
  //Define Scanner
  static Scanner in = new Scanner(System.in);
  
  public static void main(String[] args) throws InterruptedException {
    
    //Print game over text
    System.out.println(" ");
    System.out.println(" ██████╗   █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ ██╗");
    System.out.println(" ██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗██║");
    System.out.println(" ██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝██║");
    System.out.println(" ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗╚═╝");
    System.out.println(" ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║██╗");
    System.out.println("  ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝╚═╝");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    
    System.out.println(" Type main_menu to exit to the main menu.\n");
    
    while(true) {
      //Prompt to exit to main menu
      System.out.print(" > ");
      String input = in.next();
      
      //Exit to main menu
      if(input.equals("main_menu")) {
        clear.c();
        System.out.println(" Lawl!!! You died.."); //Easter Egg
        System.out.println(" Hahahahahaha!"); //Easter Egg
        clear.c();
        init.main(args);
      }
      else {
        clear.c();
        System.out.println(" Incorrect command, try again!");
      }
    }
  }
}
