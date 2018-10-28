package jarnite;

import java.util.Scanner;

public class inv {
  static void open() {
    
    Scanner input = new Scanner(System.in);
    String cmd;
    
    ArrayList<String> itemSlots = new ArrayList<String>(8);
    ArrayList<String> weaponSlots = new ArrayList<String>(6);
    
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
      String output = Integer.toString(itemSlots[1]);
      space = 30 - output.length();
      for (int i = 0; i < space; i++) {
        System.out.print(" ");
      }
      System.out.print("     1: ");
      System.out.print(weaponSlots[1]);
      String output = Integer.toString(weaponSlots[1]);
      space = 32 - output.length();
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
