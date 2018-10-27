//Define Package
package jarnite;

//Import Dependencies
import java.util.Scanner;
import java.util.Random;

public class player {
  public static void main(String[] args) {

      //System Objects
      Scanner in = new Scanner(System.in);
      Random rand = new Random();

      //NPC's
      String[] npcs = { "Bob", "Sharon", "Gerald" };

      //NPC Stats
      int maxNpcHealth = 80;
      int npcAttackDamage = 25;
      int npcHealth = rand.nextInt(maxNpcHealth);
      while(npcHealth < 65) { //Force min player health
        npcHealth = rand.nextInt(maxNpcHealth);
      }

      //Player Stats
      int playerHealth = 100;
      int playerAttackDamage = 35;

      int space;

// ----------[ PLAYER & NPC MECHANICS ]----------

      String npc = npcs[rand.nextInt(npcs.length)];
      System.out.println("\t# " + npc + " has been spotted in this location! #\n");
      //Eg:      # Sharon has been spotted in this location!

      while(npcHealth > 0) {
        System.out.println(" *******************************************************************************");
        System.out.println(" *   --[ STATS ]--                                                             *");

        //Display Player Health - correctly space out TUI window
        System.out.print(" *       Health:  ");
        System.out.print(playerHealth);
          String output = Integer.toString(playerHealth);
          space = 61 - output.length();
          for (int i = 0; i < space; i++) {
            System.out.print(" ");
          }
          System.out.println("*");

        //Display NPC's Health - correctly space out TUI window
        System.out.print(" *       ");
        System.out.print(npc);
        System.out.print("'s Health:  ");
        System.out.print(npcHealth);
        output = Integer.toString(npcHealth);
        output = output + npc;
          space = 58 - output.length();
          for (int i = 0; i < space; i++) {
            System.out.print(" ");
          }
          System.out.println("*");

        System.out.println(" *******************************************************************************");
      }

  }

}
