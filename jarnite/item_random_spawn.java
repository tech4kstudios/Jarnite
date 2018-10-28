package jarnite;

import java.util.Random;

public class item_random_spawn {
  public static void main(String[] args) throws InterruptedException {
    
    int found = 0;
    
    clear.c();
    
    //Random number generator
    Random rd = new Random();
    int r = rd.nextInt(101);
    
    System.out.println(r);
    
    //16% of an item spawning per cycle.
    if (r >= 1 && r <= 16) {
      r = rd.nextInt(101);
      System.out.println(r);
      
      //Car keys 25%
      if (r >= 1 && r <= 25) {
        found = 12;
      }
      
      //Health pack 40%
      else if (r >= 26 && r <= 70) {
        found = 13;
      }
      
      //Ammo create 30%
      else if (r >= 71 && r <= 100) {
        found = 14;
      }
      
    }
    
    //16% of an weapon spawning per cycle.
    else if (r >= 17 && r <= 33) {
      r = rd.nextInt(101);
      System.out.println(r);
      
      //Baton 24%
      if (r >= 1 && r <= 24) {
        found = 21;
      }
      
      //Knife 20%
      else if (r >= 25 && r <= 44) {
        found = 22;
      }
      
      //Axe 18%
      else if (r >= 45 && r <= 62) {
        found = 23;
      }
      
      //Stun gun 18%
      else if (r >= 63 && r <= 80) {
        found = 24;
      }
      
      //Pistol 12%
      else if (r >= 81 && r <= 92) {
        found = 25;
      }
      
      //AMR 8%
      else if (r >= 93 && r <= 100) {
        found = 26;
      }
    }
    
    if (found == 0) {
      //System.out.println("No item or weapon found...");
    }
    else
    {   
      
      System.out.println("\t# " + found + " has been located at " + geolocation.locations[geolocation.locationNo] + "! #\n Do you want pick it up?");
    }
  }
}