import java.util.*;
//import geolocation.*;

public class commands {

  //Variable for calling methods of the geolocation class
  static geolocation gps = new geolocation();

  public static void main(String[] args) {


    System.out.println("Enter command"); //Used for testing purposes

  }

    static void AskForHelp() {
      //Create new scanner called helper_input
      Scanner helper_input = new Scanner(System.in);

      //Notify user of incorrect command and check for user input
      System.out.println("Unknown command, type '?' for a list of commands!");
      String helper_cmd = helper_input.next();

      //Process user input and provide respose
      if (helper_cmd.equals("?")) {
         ListOfCommands();
       }
      else {
        gps.LocationLibrary();
      }

    }

    static void ListOfCommands() {
      //List of Commands Output
      System.out.println("---------[ LIST OF COMMANDS ]---------");
      System.out.println("/inv                    Opens inventory");
      System.out.println("/[entity] stat          Shows stats about an entity");
      System.out.println("/mv [x] [y]             Moves player to specified coordinates");
      System.out.println("/[item] pickup          Picks up an item");
      System.out.println("/[item] drop            Drops an item");
      System.out.println("/heal                   Heals the player using first aid kits");
      System.out.println("/[item] equip           Equips the item");
      System.out.println("-------[ END LIST OF COMMANDS ]-------");
    }

}
