package jarnite;

import java.util.Random;

public class item_random_spawn {
  
  static int r1;
  static int r2;
  static int r3;
  static int found = 0;
  
  public static void main(String[] args) throws InterruptedException {
    
    String[] item = {"", "", "", "", "", "", "", "", "", "", "xtfinderv2", "Car Keys", "Health Pack", "Ammo Crate", "Pistol Ammo", "Rifle Ammo", "Stun Gun Cartridge", "", "", "", "Baton", "Knife", "Axe", "Stun Gun", "Pistol", "AMR"};
    
    //Random number generator
    Random rd = new Random();
    if (!game.invalid && !game.badmove) {
      r1 = rd.nextInt(101);
      //System.out.println(r1);
    }
    
    //28% of an item spawning per cycle.
    if (r1 >= 1 && r1 <= 28) {
      if (!game.invalid && !game.badmove) {
        r2 = rd.nextInt(101);
        //System.out.println(r2);
      }
      
      //Car keys 25%
      if (r2 >= 1 && r2 <= 25) {
        found = 12;
      }
      
      //Health pack 40%
      else if (r2 >= 26 && r2 <= 70) {
        found = 13;
      }
      
      //Ammo create 30%
      else if (r2 >= 71 && r2 <= 100) {
        found = 14;
      }
      
    }
    
    //20% of an weapon spawning per cycle.
    else if (r1 >= 29 && r1 <= 48) {
      if (!game.invalid && !game.badmove) {
        r3 = rd.nextInt(101);
        //System.out.println(r3);
      }
      
      //Baton 24%
      if (r3 >= 1 && r3 <= 24) {
        found = 21;
      }
      
      //Knife 20%
      else if (r3 >= 25 && r3 <= 44) {
        found = 22;
      }
      
      //Axe 18%
      else if (r3 >= 45 && r3 <= 62) {
        found = 23;
      }
      
      //Stun gun 18%
      else if (r3 >= 63 && r3 <= 80) {
        found = 24;
      }
      
      //Pistol 12%
      else if (r3 >= 81 && r3 <= 92) {
        found = 25;
      }
      
      //AMR 8%
      else if (r3 >= 93 && r3 <= 100) {
        found = 26;
      }
    }
    
    if (found == 0) {
      //System.out.println("game.invalid " + game.invalid);
      //System.out.println("game.badmove " + game.badmove);
      System.out.println("\n No item or weapon found...\n");
    }
    else
    {
      
      System.out.println("\n\t# " + item + " has been located at " + geolocation.locations[geolocation.locationNo] + "! #\n");
    }
  }
}
