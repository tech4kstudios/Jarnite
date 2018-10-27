package jarnite;

import java.util.Scanner;

public class openinventory {
  public static void main(String[] args) throws InterruptedException {
    
    Scanner input = new Scanner(System.in);
    String cmd;
    
    //Inventory management loop
    while (true) {
      clear.c();
      geolocation.cmd1 = "";
      System.out.println("-------------Inventory-----------!");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");
      System.out.println("7. ");
      System.out.println("8. ");
      
      System.out.println("\n\n-------------Weapons-----------!");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");

      cmd = input.next();
      if (cmd.equals("exit")) {
        game.invalid = false;
        //game.invbreak = true;
        break;
      }
    }
  }
}