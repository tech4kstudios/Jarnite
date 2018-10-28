//Define Package
package jarnite;

//Import Dependencies
import java.util.Scanner;
import java.util.Random;

public class player {

  //System Objects
  static Random rand = new Random();

  //NPC Stats
  static int maxNpcHealth = 80;
  static int npcHealth = rand.nextInt(maxNpcHealth);

  //Player Stats
  static int playerHealth = 100;

  public static void main(String[] args) {

    //System Objects
    Scanner in = new Scanner(System.in);

    //NPC's
    String[] npcs = { "Bob", "Sharon", "Gerald", "Thomas", "Namantha", "Syro", "Skye", "Coulson" };
    String npc = npcs[rand.nextInt(npcs.length)];

    //NPC Stats
    while(npcHealth < 65) { //Force min player health
      npcHealth = rand.nextInt(maxNpcHealth);
    }

    //Define Other Variables
    int space; //deifne spacing variable
    int beginningIntLow = 0; int beginningIntHigh = 3; //Define min and max array locations for story beginning
    int climaxIntLow = 3; int climaxIntHigh = 7; //Define min and max array locations for story climax
    int resolutionIntLow = 8; int resolutionIntHigh = 10; //Define min and max array locations for story resolution
    boolean battleCommenced = false;

    //Pre-Define Various Types of Greetings & Storylines
    String[] greetings = {" Hello! My name is " + npc + " and I would like to kill you... *smiles politely*\n", " Hey! I'm " + npc + "! It's nice to meet you. *handshake*\n", " YOU SHALL NOT PASS! *stabs stick into ground, holding it upright with right\n hand while giving a stern look*\n"};
    int greetingNo = rand.nextInt(greetings.length);
    String greeting = greetings[greetingNo];

    //Beginning storylines
    String sb1 =  " I have been walking for hours now! *panting* I am really close to my final\n destination...\n";
    String sb2 =  " Please! I need you help! *drops down on the floor*\n";
    String sb3 =  " Oh my god! I think I know you from somewhere... We should get to know each\n other better!\n";
    //Climax storylines
    String sc1 =  " On my way here, I came accross some people who wanted me dead! Oh wait - I \n am the one who took out that group with my bare hands! I must have forgotten\n to mention that before.\n";
    String sc2 =  " Whatever you do, don't look back. *acting scared* All those people that I\n destroyed, I don't want to have to do the same to you - but you have such a nice\n and pretty face; a clean canvas for a knife to carve... *evil smile*\n";
    String sc3 =  " AAARRRGGHH! *tightly clutching left shoulder* It hurts! It hurts! You must\n suffer too! Or not...\n";
    String sc4 =  " Well... This marks the end of the road. I don't see my path continuing...\n";
    //Resolution storylines
    String sr1 =  " You're next!\n";
    String sr2 =  " So... I'm going to head off now...\n";
    String sr3 =  " Good luck trying to take me down!\n";

    String[] storylines = {sb1, sb2, sb3, sc1, sc2, sc3, sc4, sr1, sr2, sr3};
    //Define Story Beginning
    int beginning = rand.nextInt(beginningIntHigh - beginningIntLow) + beginningIntLow;
    String storylineBeginning = storylines[beginning];
    //Define Story Climax
    int climax = rand.nextInt(climaxIntHigh - climaxIntLow) + climaxIntLow;
    String storylineClimax = storylines[climax];
    //Define Story Resolution
    int resolution = rand.nextInt(resolutionIntHigh - resolutionIntLow) + resolutionIntLow;
    String storylineResolution = storylines[resolution];

// ----------[ PLAYER & NPC MECHANICS ]----------]

    System.out.println("\n\t# " + npc + " has been spotted in this location! #\n");
    //Eg:      # Sharon has been spotted in this location!

    //Print Welcome Dialogue
    System.out.println(greeting);
    //Print Storyline
    System.out.println(storylineBeginning);
    System.out.println(storylineClimax);
    System.out.println(storylineResolution);

    while(npcHealth > 0) {

      // ----------[ Display Health Stats TUI Window ]----------
      System.out.println(" *******************************************************************************");
      System.out.println(" *   --[ STATS ]--                                                             *");

      //Display Player Health; correctly space out TUI window
      System.out.print(" *       Your HP:  ");
      System.out.print(playerHealth);
      String output = Integer.toString(playerHealth);
      space = 60 - output.length();
      for (int i = 0; i < space; i++) {
        System.out.print(" ");
      }
      System.out.println("*");

      //Display NPC's Health; correctly space out TUI window
      System.out.print(" *       ");
      System.out.print(npc);
      System.out.print("'s HP:  ");
      System.out.print(npcHealth);
      output = Integer.toString(npcHealth);
      output = output + npc;
      space = 62 - output.length();
      for (int i = 0; i < space; i++) {
        System.out.print(" ");
      }
      System.out.println("*");

      System.out.println(" *******************************************************************************\n");

      if (battleCommenced == false) {
        //COMBAT MECHANICS
        System.out.println("\t# You are now in combat with " + npc + " #\n");

        //Combat Countdown
        /*
         System.out.println("\n\t# COMBAT NOW COMMENCING IN 3 #");
         System.out.println("\t# COMBAT NOW COMMENCING IN 2 #");
         System.out.println("\t# COMBAT NOW COMMENCING IN 1 #");
         System.out.println("\t# COMBAT NOW COMMENCED! #\n");
         System.out.println("\n\t# COMBAT NOW COMMENCING IN 3 #");
         */

        battleCommenced = true;
      }

      System.out.print(" > ");
      String input = in.next();
      clear.c();

      if(input.equals("baton.attack")) {
        weapon_stats.maxNpcAttackDamage = 35;
        weapons.batonAttack();
      }
      else if(input.equals("knife.attack")) {
        weapon_stats.maxNpcAttackDamage = 35;
        weapons.knifeAttack();
      }
      else if(input.equals("axe.swing")) {
        weapon_stats.maxNpcAttackDamage = 35;
        weapons.axeSwing();
      }
      else if(input.equals("stun_gun.shoot")) {
        weapon_stats.maxNpcAttackDamage = 35;
        weapons.stun_gunShoot();
      }
      else if(input.equals("pistol.fire")) {
        weapon_stats.maxNpcAttackDamage = 35;
        weapons.pistolFire();
      }
      else if(input.equals("amr.fire")) {
        weapon_stats.maxNpcAttackDamage = 35;
        weapons.amrFire();
      }
      else if(input.equals("punch")) { //TODO: user can punch only if weapons is empty and no ammo
        weapon_stats.maxNpcAttackDamage = 15;
        weapons.punch();
      }

    }

  }

}
