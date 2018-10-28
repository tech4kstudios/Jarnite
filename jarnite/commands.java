//Define package
package jarnite;

//Import dependencies
import java.util.Scanner;

public class commands {

  public static void main(String[] args) {
    System.out.println(" Enter command"); //Used for testing purposes
  }

// ----------[ COMMANDS ]----------

  static void AskForHelp(String[] args) throws InterruptedException {
    //Create new scanner called helper_input
    Scanner helper_input = new Scanner(System.in);

    //Notify user of incorrect command and check for user input
    System.out.println(" Unknown command, type '?' for a list of commands!");
    String helper_cmd = helper_input.next();

    //Process user input and provide respose
    if (helper_cmd.equals("?")) {
      ListOfCommands();
    }
    else {
      //geolocation.LocationLibrary(args);
    }

  }

  static void ListOfCommands() {

    geolocation.cmd1 = "";

    //List of Commands Output
    System.out.println("");
    System.out.println(" *******************************************************************************");
    System.out.println(" *                    ---------[ LIST OF COMMANDS ]---------                   *");
    System.out.println(" *                                                                             *");
    System.out.println(" *   --[ PLAYER ]--                                                            *");
    System.out.println(" *  heal                          Heals the player using first aid kits        *");
    System.out.println(" *                                                                             *");
    System.out.println(" *   --[ MOVEMENT ]--                                                          *");
    System.out.println(" *  mv-sneak.[direction]          Sneak in the desired direction; NESW         *");
    System.out.println(" *  mv-walk.[direction]           Walk in the desired direction; NESW          *");
    System.out.println(" *  mv-sprint.[direction]         Sprint in the desired direction; NESW        *");
    System.out.println(" *  mv-drive.[direction]          Drive in the desired direction; NESW         *");
    System.out.println(" *                                                                             *");
    System.out.println(" *   --[ INVENTORY ]--                                                         *");
    System.out.println(" *  inv                           Opens inventory                              *");
    System.out.println(" *  [item-name].pickup            Pick up specified item                       *");
    System.out.println(" *  [item-name].user              Use the specified item                       *");
    System.out.println(" *  [item-name].drop              Drop specified item                          *");
    System.out.println(" *  [item-name].stat              Shows statistics about an item               *");
    System.out.println(" *                                                                             *");
    System.out.println(" *   --[ COMBAT ]--                                                            *");
    System.out.println(" *  punch                         Punch the enemy with your fists              *");
    System.out.println(" *  baton.attack                  Attack the enemy with a baton                *");
    System.out.println(" *  knife.attack                  Attack the enemy with a knife                *");
    System.out.println(" *  axe.swing                     Swing the axe at the enemy                   *");
    System.out.println(" *  stun_gun.shoot                Shoot the enemy with a stun gun              *");
    System.out.println(" *  pistol.fire                   Fire deadly rounds at the enemy              *");
    System.out.println(" *  amr.fire                      Fire deadly rounds at the enemy              *");
    System.out.println(" *                                                                             *");
    System.out.println(" *******************************************************************************");
    System.out.println("");
  }

}
