//Define package
package jarnite;

//Import dependencies
import java.util.Scanner;
import java.util.Random;

public class geolocation {
  
  //Sets the static starting spawn location
  //static String location = "kiren_hills";
  
  //Generate random starting spawn location
  static String [] locations = {"kiren_hills","hersha_forest","mana_lake","serga_lake","trenlo_hills","surrey_hills","nimba_hills","serpa_forest", "harvey_village", "nambi_hills", "shorte_plane", "longdon_plane", "north_jen_city", "chiffley_village", "kelna_forest", "brupton_plane", "west_jen_city", "jen_city_centre", "east_jen_city", "frena_district", "pahje_district", "mika_district", "south_jen_city", "lucto_district", "yana_district"}; //Index 0 to 24
  static Random randomLoc = new Random();
  static int locationNo = randomLoc.nextInt(25);
  static String location = locations[locationNo];
  
  //Define other variables
  static boolean spawned = false;
  static String[] cmdsplit;
  static String cmd1 = "";
  static String cmd2;
  static int move;
  
  public static void main(String[] args) throws InterruptedException {
    
    //Check if already spawned
    if (spawned) {
      System.out.println("geolocation.current = " + locations[locationNo]);
      //System.out.println("Current map id: " + geolocation.locationNo);
      
    }
    else
    {
      System.out.println("geolocation.current = " + locations[locationNo]);
      //System.out.println("Current map id:  " + geolocation.locationNo);
      
      spawned = true;
    }
    
    //Check adjacent areas
    if (locationNo > 4) {
      System.out.println("geolocation.north = " + locations[locationNo - 5]);
    }
    else
    {
      //System.out.println("No North!");
    }
    
    if (!String.valueOf(locationNo).contains("4") && !String.valueOf(locationNo).contains("9")) {
      System.out.println("geolocation.east = " + locations[locationNo + 1]);
    }
    else
    {
      //System.out.println("No East!");
    }
    
    if (locationNo < 20) {
      System.out.println("geolocation.south = " + locations[locationNo + 5]);
    }
    else
    {
      //System.out.println("No South!");
    }
    
    if (!String.valueOf(locationNo).contains("5") && !String.valueOf(locationNo).contains("0")) {
      System.out.println("geolocation.west = " + locations[locationNo - 1]);
    }
    else
    {
      //System.out.println("No West!");
    }
  }
  
  
  static void move() {
    
    cmdsplit = game.cmd.split("\\.");
    
    //Check if the format is something.something
    if (cmdsplit.length != 2) {
      game.invalid = true;
      return;
    }
    
    cmd1 = cmdsplit[0];
    cmd2 = cmdsplit[1];
    
    if (!cmd1.matches("drive|sneak|sprint|walk")) {
      game.invalid = true;
      return;
    }
    
    //Check if move is legal
    switch (cmd2) {
      
      case "north" :
        if (locationNo > 5) {
        locationNo = locationNo - 5;
        break;
      }
        else
        {
          game.badmove = true;
          break;
        }
      case "east" :
        if (String.valueOf(locationNo).contains("4") || String.valueOf(locationNo).contains("9")) {
        game.badmove = true;
        break;
      }
        else
        {
          locationNo++;
          break;
        }
      case "south" :
        if (locationNo < 20) {
        locationNo = locationNo + 5;
        break;
      }
        else
        {
          game.badmove = true;
          break;
        }
      case "west" :
        if (String.valueOf(locationNo).contains("5") || String.valueOf(locationNo).contains("0")) {
        game.badmove = true;
        break;
      }
        else
        {
          locationNo--;
          break;
        }
      default :
        game.invalid = true;
        return;
        
    }
  }
}
