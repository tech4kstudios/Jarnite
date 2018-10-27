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
      String npc = npcs[rand.nextInt(npcs.length)];

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

      //Define Other Variables
      int space; //deifne spacing variable

      //Pre-Define Various Types of Greetings & Storylines
      String greeting0 = " Hello! My name is " + npc + " and I would like to kill you... *smiles politely*\n";
      String greeting1 = " Hey! I'm " + npc + "! It's nice to meet you. *handshake*\n";
      String greeting2 = " YOU SHALL NOT PASS! *stabs stick into ground, holding it upright with right hand*\n";
      String[] greetings = {greeting0, greeting1, greeting2};
      int greetingNo = rand.nextInt(2);
      String greeting = greetings[greetingNo];

// ----------[ PLAYER & NPC MECHANICS ]----------

      System.out.println("\t# " + npc + " has been spotted in this location! #\n");
      //Eg:      # Sharon has been spotted in this location!

      //while(npcHealth > 0) {

        //Print Welcome Dialogue
        System.out.println(greeting);

        // ----------[ Display Health Stats TUI Window ]----------
        System.out.println(" *******************************************************************************");
        System.out.println(" *   --[ STATS ]--                                                             *");

        //Display Player Health; correctly space out TUI window
        System.out.print(" *       Health:  ");
        System.out.print(playerHealth);
          String output = Integer.toString(playerHealth);
          space = 61 - output.length();
          for (int i = 0; i < space; i++) {
            System.out.print(" ");
          }
          System.out.println("*");

        //Display NPC's Health; correctly space out TUI window
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
      //}

  }

}
