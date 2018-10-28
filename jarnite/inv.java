package jarnite;

import java.util.Scanner;

public class inv {
  static void open() {
    
    Scanner input = new Scanner(System.in);
    String cmd;
    
    //Inventory management loop
    while (true) {
      clear.c();
      geolocation.cmd1 = "";
      System.out.println("-------------Inventory-----------");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");
      System.out.println("7. ");
      System.out.println("8. ");
      
      System.out.println("\n-------------Weapons-----------");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");

      System.out.println(" Type 'back' to return to previous screen.");
      cmd = input.next();
      if (cmd.equals("back")) {
        game.invalid = false;
        break;
      }
    }
  }
}