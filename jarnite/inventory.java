//Define Package
package jarnite;

//Import Dependencies
import java.util.Scanner;
import java.util.ArrayList;

public class inventory {
  static int[] itemSlots = new int[7];
  static int[] weaponSlots = new int[5];
  
  static void open() {
    
    Scanner input = new Scanner(System.in);
    String cmd;
    
    
    //Inventory management loop
    while (true) {
      clear.c();
      geolocation.cmd1 = "";
      
      System.out.println(" *******************************************************************************");
      System.out.println(" *                       ---------[ INVENTORY ]---------                       *");
      System.out.println(" *                                                                             *");
      System.out.println(" *   --[ ITEMS ]--                         --[ WEAPONS ]--                     *");
      
      //Display Inventory Slot 1 + Weapon Slot 1; correctly space out TUI window
      System.out.print(" *     1: ");
      System.out.print(itemSlots[1]);
      String output1 = Integer.toString(itemSlots[1]);
      int space = 30 - output1.length();
      for (int i = 0; i < space; i++) {
        System.out.print(" ");
      }
      System.out.print("     1: ");
      System.out.print(weaponSlots[1]);
      String output2 = Integer.toString(weaponSlots[1]);
      space = 32 - output2.length();
      for (int i = 0; i < space; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      
      System.out.println(" *                                                                             *");
      System.out.println(" *******************************************************************************\n");
      
      System.out.println(" Type 'back' to return to previous screen.");
      cmd = input.next();
      if (cmd.equals("back")) {
        game.invalid = false;
        break;
      }
    }
  }
}
