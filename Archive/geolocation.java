import java.util.*;

public class geolocation {

  //Variable for calling methods of the commands class
  static commands cmds = new commands();

  //Sets the starting spawn location
  static String location = "north_jen_city";

  //Creates a new scanner called input
  static Scanner input = new Scanner(System.in);
  static String cmd;

  public static void main(String[] args) {

    LocationLibrary();

  }

  static void LocationLibrary() {
    //Location Library
    while(true) {

    if(location == "kiren_hills"){
      kiren_hills();
    }
    else if(location == "hersha_forest"){
      hersha_forest();
    } /*
    else if(location == "mana_lake"){
      mana_lake();
    }
    else if(location == "serga_lake"){
      serga_lake();
    }
    else if(location == "trenlo_hills"){
      trenlo_hills();
    }
    else if(location == "surrey_hills"){
      surrey_hills();
    }
    else if(location == "nimba_hills"){
      nimba_hills();
    }
    else if(location == "serpa_forest"){
      serpa_forest();
    }
    else if(location == "harvey_village"){
      harvey_village();
    }
    else if(location == "nambi_hills"){
      nambi_hills();
    }
    else if(location == "shorte_plane"){
      shorte_plane();
    }
    else if(location == "longdon_plane"){
      longdon_plane();
    }
    else if(location == "north_jen_city"){
      north_jen_city();
    }
    else if(location == "chiffley_village"){
      chiffley_village();
    }
    else if(location == "kelna_forest"){
      kelna_forest();
    }
    else if(location == "brupton_plane"){
      brupton_plane();
    }
    else if(location == "west_jen_city"){
      west_jen_city();
    }
    else if(location == "jen_city_centre"){
      jen_city_centre();
    }
    else if(location == "east_jen_city"){
      east_jen_city();
    }
    else if(location == "frena_district"){
      frena_district();
    }
    else if(location == "pahje_district"){
      pahje_district();
    }
    else if(location == "mika_district"){
      mika_district();
    }
    else if(location == "south_jen_city"){
      south_jen_city();
    }
    else if(location == "lucto_district"){
      lucto_district();
    }
    else if(location == "yana_district"){
      yana_district();
    } */
    }
  }

  static void kiren_hills() {
    System.out.println("geolocation.current = " + location);
    System.out.println("geolocation.east = hersha_forest [2, 1]");
    System.out.println("geolocation.south = surrey_hills [1, 2]");
    System.out.println("geolocation.next = ");
    cmd = input.next();

    if(cmd == "?"){
      //ListOfCommands();

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
    else if(cmd == "/mv 2 1") {
      location = "hersha_forest"; //East
    }
    else if(cmd == "/mv 1 2") {
      location = "surrey_hills"; //South
    }
    else {
      cmds.AskForHelp();
      //System.out.println("Unknown command, type '?' for a list of commands!");
    }

  }

  static void hersha_forest() {
    System.out.println("geolocation.current = " + location);
    System.out.println("geolocation.east = mana_lake [3, 1]");
    System.out.println("geolocation.south = nimba_hills [2, 2]");
    System.out.println("geolocation.west = kiren_hills [1, 1]");
    System.out.println("geolocation.next = ");
    cmd = input.next();

    if(cmd == "?"){
      //ListOfCommands(); //Help Page

      System.out.println("----------[ LIST OF COMMANDS ]----------");
      System.out.println("/inv                      Opens inventory");
      System.out.println("/[entity] stat            Shows stats about an entity");
      System.out.println("/mv [x] [y]               Moves player to specified coordinates");
      System.out.println("/[item] pickup            Picks up an item");
      System.out.println("/[item] drop              Drops an item");
      System.out.println("/heal                     Heals the player using first aid kits");
      System.out.println("/[item] equip             Equips the item");
      System.out.println("--------[ END LIST OF COMMANDS ]--------");

    }
    else if(cmd == "/mv 3 1") {
      location = "mana_lake"; //East
    }
    else if(cmd == "/mv 2 2") {
      location = "nimba_hills"; //South
    }
    else if(cmd == "/mv 1 1") {
      location = "kiren_hills"; //West
    }
    else {
      cmds.AskForHelp();
    }

      input.close();

  }

}
