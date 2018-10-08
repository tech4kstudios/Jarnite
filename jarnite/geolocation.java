//Define package
package jarnite;

//Import dependencies
import java.util.Scanner;
import java.util.Random;

public class geolocation {
  
  //static 
  
  //Sets the static starting spawn location
  //static String location = "kiren_hills";
  
  
  //Generate random starting spawn location
  static String [] locations = {"kiren_hills","hersha_forest","mana_lake","serga_lake","trenlo_hills","surrey_hills","nimba_hills","serpa_forest", "harvey_village", "nambi_hills", "shorte_plane", "longdon_plane", "north_jen_city", "chiffley_village", "kelna_forest", "brupton_plane", "west_jen_city", "jen_city_centre", "east_jen_city", "frena_district", "pahje_district", "mika_district", "south_jen_city", "lucto_district", "yana_district"}; //Index 0 to 24
  static Random randomLoc = new Random();
  static int locationNo = randomLoc.nextInt(25);
  static String location = locations[locationNo];
  static  boolean spawned = false;
  
  public static void main(String[] args) throws InterruptedException {
    
    
    if (spawned) {
      System.out.println("Your current location is " + locations[locationNo]);
      System.out.println("id " + geolocation.locationNo);
      
    }
    else
    {
      System.out.println("You have spawned at " + locations[locationNo]);
      System.out.println("id " + geolocation.locationNo);
      
      
      
      spawned = true;
    }
    
    if (locationNo > 4) {
      System.out.println("North: " + locations[locationNo - 5]);
    }
    else
    {
      System.out.println("No North!");
    }
    
    if (!String.valueOf(locationNo).contains("4") && !String.valueOf(locationNo).contains("9")) {
      System.out.println("East: " + locations[locationNo + 1]);
    }
    else
    {
      System.out.println("No East!");
    }
    
    if (!String.valueOf(locationNo).contains("5") && !String.valueOf(locationNo).contains("0")) {
      System.out.println("West: " + locations[locationNo - 1]);
    }
    else
    {
      System.out.println("No West!");
    }
    
    if (locationNo < 20) {
      System.out.println("South: " + locations[locationNo + 5]);
    }
    else
    {
      System.out.println("No South!");
    }
    
  }
  static void move() {
    
    switch (game.cmd) {
      
      case "north" :
        if (locationNo > 5) {
        locationNo = locationNo - 5;
        break;
      }
        else
        {
          break;
        }
      case "east" :
        if (String.valueOf(locationNo).contains("4") || String.valueOf(locationNo).contains("9")) {
        break;
      }
        else
        {
          locationNo++;
          break;
        }
      case "west" :
        if (String.valueOf(locationNo).contains("5") || String.valueOf(locationNo).contains("0")) {
        break;
      }
        else
        {
          locationNo--;
          break;
        }
      case "south" :
        if (locationNo < 20) {
        locationNo = locationNo + 5;
        break;
      }
      default :
        game.invalid = true;
        break;
        
    }
  }
}
