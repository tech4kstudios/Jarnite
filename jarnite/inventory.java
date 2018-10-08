//Define package
package jarnite;

//Import dependencies
import java.util.Scanner;

public class inventory {
  
  static String location = geolocation.location;
  
  static int car_keys = 0;
  
  public static void main(String[] args) throws InterruptedException {
    inventory_system(args);
  }
  
// ----------[ INVENTORY SYSTEM ]----------
  
  static void inventory_system(String[] args) throws InterruptedException {
    
    String [] items = new String[8];
    Scanner invScanner = new Scanner(System.in);
    String response;
    int index = 0;
    
// ----------[ Items ]----------
    
    // ITEM:  Taser
    System.out.print("xtfinderv2.scan = starting");
    System.out.print("xtfinderv2.scan." + location + " = scanning");
    System.out.print("xtfinderv2.scan = found");
    System.out.print("xtfinderv2.scan = stun_gun");
    System.out.print("xtfinderv2.pickup = ");
    response = invScanner.next();
    
    if(response == "stun_gun.pickup") //Command to pick up items
    {
      car_keys = 1;
      items[index] = "stun_gun";
      index++;
    }
    else{
      commands.AskForHelp(args);
    }
    
    // ITEM:  Car Keys
    System.out.print("xtfinderv2.scan = starting");
    System.out.print("xtfinderv2.scan." + location + " = scanning");
    System.out.print("xtfinderv2.scan = found");
    System.out.print("xtfinderv2.scan = car_keys");
    response = invScanner.next();
    
    if(response == "car_keys.pickup")
    {
      items[index] = "car_keys";
      index++;
    }
    else{
      commands.AskForHelp(args);
    }
    
// ----------[ Items in Inventory ]----------
    
    System.out.println("****** Items currently in inventory ******");
    for(int i = 0; i < items.length; i++)
    {
      if(items[i] != null)
      {
        System.out.println("Item slot " + (i + 1) + ": " + items[i]);
      }
      else
      {
        System.out.println("Item slot " + (i + 1) + " is empty ");
      }
    }
  }
}
