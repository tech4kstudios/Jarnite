import java.util.*;

public class JarniteBattleGrounds {

  //Sets the starting spawn location
  static String location = "kiren_hills"; //TODO: Need to convert to randomized version later on

  //Creates a new scanner called input - USED IN GEOLOCATION
  static Scanner input = new Scanner(System.in);
  static String cmd;

  //Declaring inventory system entities
  static int car_keys;

  public static void main(String[] args) {
    //Launches main menu when program is run
    MainMenu();

  }

// ----------[ 1- MAIN MENU ]----------

  static void MainMenu() {
    //Creates a new scanner called MenuInput
    Scanner menu_input = new Scanner(System.in);

    //Prints out main menu pseudo-gui
    System.out.println("*************************************************************************");
    System.out.println("*                                                                       *");
    System.out.println("*                                                                       *");
    System.out.println("*               ~ WELCOME TO THE JARNITE BATTLE GROUNDS ~               *");
    System.out.println("*                                                                       *");
    System.out.println("*                 Select an option to begin:                            *");
    System.out.println("*                   1. Start                                            *");
    System.out.println("*                   2. Quit                                             *");
    System.out.println("*                                                                       *");
    System.out.println("*                                                                       *");
    System.out.println("*                                                                       *");
    System.out.println("*                                                                       *");
    System.out.println("*                                                                       *");
    System.out.println("*                                                                       *");
    System.out.println("*                                                                       *");
    System.out.println("*  Version: JBG-1.0-alpha                                               *");
    System.out.println("*  © 2018 | Tech4K Studios                                              *");
    System.out.println("*************************************************************************");

    //Requests input from user
    String menu_selection = menu_input.next();

    //Processes the request
    if (menu_selection.equals("1")) {
      //Send user to starting location
      LocationLibrary();
    }
    else if (menu_selection.equals("2")) {
      //Terminate the program
      System.exit(0);
    }
    else {
      System.out.println("Unknown option, try again!");
      MainMenu();
    }

    //Close menu_input scanner
    menu_input.close();
  }

// ----------[ 2- COMMANDS ]----------

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
      LocationLibrary();
    }

    //Close menu_input scanner
    helper_input.close();
  }

  static void ListOfCommands() {
    //List of Commands Output
    System.out.println(" ");
    System.out.println("--------------------------[ LIST OF COMMANDS ]--------------------------");
    System.out.println("inv                    Opens inventory");
    System.out.println("[entity] stat          Shows stats about an entity");
    System.out.println("mv [x] [y]             Moves player to specified coordinates");
    System.out.println("[item] pickup          Picks up an item");
    System.out.println("[item] drop            Drops an item");
    System.out.println("heal                   Heals the player using first aid kits");
    System.out.println("[item] equip           Equips the item");
    System.out.println("------------------------[ END LIST OF COMMANDS ]------------------------");
    System.out.println(" ");
  }

// ----------[ 3- GEOLOCATION ]----------

  static void LocationLibrary() {

    while(true) {

    if(location.equals("kiren_hills")){
      kiren_hills();
    }
    else if(location.equals("hersha_forest")){
      hersha_forest();
    }
    else if(location == "mana_lake"){
      mana_lake();
    } /*
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
    else{
      System.out.println("ADMIN: Location not found!"); //ADMIN: System message, not for user
    }

    }
  }

// ----------[ 3.1- Global Positioning ]----------

  static void kiren_hills() {
    System.out.println(" ");
    System.out.println("geolocation.current = " + location);
    System.out.println("geolocation.east = hersha_forest");
    System.out.println("geolocation.south = surrey_hills");
    System.out.println("geolocation.next = ");
    cmd = input.next();

    if(cmd.equals("mv-sneak.east")) {
      load_mv_sneak();
      location = "hersha_forest"; //East
    }
    else if(cmd.equals("mv-walk.east")) {
      load_mv_walk();
      location = "hersha_forest"; //East
    }
    else if(cmd.equals("mv-sprint.east")) {
      load_mv_sprint();
      location = "hersha_forest"; //East
    }
    else if(cmd.equals("mv-drive.east") && car_keys == 1) {
      load_mv_drive();
      location = "hersha_forest"; //East
    }
    else if(cmd.equals("mv-drive.east") && car_keys == 0) {
      System.out.println("Scour the map to find the car keys to be able to drive.");
      kiren_hills();
    }
    else if(cmd.equals("mv-sneak.south")) {
      location = "surrey_hills"; //South
    }
    else if(cmd.equals("mv-walk.south")) {
      load_mv_walk();
      location = "surrey_hills"; //South
    }
    else if(cmd.equals("mv-sprint.south")) {
      load_mv_sprint();
      location = "surrey_hills"; //South
    }
    else if(cmd.equals("mv-drive.south") && car_keys == 1) {
      load_mv_drive();
      location = "surrey_hills"; //South
    }
    else if(cmd.equals("mv-drive.south") && car_keys == 0) {
      System.out.println("Scour the map to find the car keys to be able to drive.");
      kiren_hills();
    }
    else {
      AskForHelp();
      //System.out.println("Unknown command, type '?' for a list of commands!");
    }

  }

  static void hersha_forest() {
    System.out.println(" ");
    System.out.println("geolocation.current = " + location);
    System.out.println("geolocation.east = mana_lake");
    System.out.println("geolocation.south = nimba_hills");
    System.out.println("geolocation.west = kiren_hills");
    System.out.println("geolocation.next = ");
    cmd = input.next();

    if(cmd.equals("mv-sneak.east")) {
      load_mv_sneak();
      location = "mana_lake"; //East
    }
    else if(cmd.equals("mv-walk.east")) {
      load_mv_walk();
      location = "mana_lake"; //East
    }
    else if(cmd.equals("mv-sprint.east")) {
      load_mv_sprint();
      location = "mana_lake"; //East
    }
    else if(cmd.equals("mv-drive.east") && car_keys == 1) {
      load_mv_drive();
      location = "mana_lake"; //East
    }
    else if(cmd.equals("mv-drive.east") && car_keys == 0) {
      System.out.println("Scour the map to find the car keys to be able to drive.");
      hersha_forest();
    }
    if(cmd.equals("mv-sneak.south")) {
      load_mv_sneak();
      location = "nimba_hills"; //South
    }
    else if(cmd.equals("mv-walk.south")) {
      load_mv_walk();
      location = "nimba_hills"; //South
    }
    else if(cmd.equals("mv-sprint.south")) {
      load_mv_sprint();
      location = "nimba_hills"; //South
    }
    else if(cmd.equals("mv-drive.south") && car_keys == 1) {
      load_mv_drive();
      location = "nimba_hills"; //South
    }
    else if(cmd.equals("mv-drive.south") && car_keys == 0) {
      System.out.println("Scour the map to find the car keys to be able to drive.");
      hersha_forest();
    }
    if(cmd.equals("mv-sneak.west")) {
      load_mv_sneak();
      location = "kiren_hills"; //West
    }
    else if(cmd.equals("mv-walk.west")) {
      load_mv_walk();
      location = "kiren_hills"; //West
    }
    else if(cmd.equals("mv-sprint.west")) {
      load_mv_sprint();
      location = "kiren_hills"; //West
    }
    else if(cmd.equals("mv-drive.west") && car_keys == 1) {
      load_mv_drive();
      location = "kiren_hills"; //West
    }
    else if(cmd.equals("mv-drive.west") && car_keys == 0) {
      System.out.println("Scour the map to find the car keys to be able to drive.");
      hersha_forest();
    }
    else {
      AskForHelp();
      //System.out.println("Unknown command, type '?' for a list of commands!");
    }

  }

  static void mana_lake() {
    System.out.println(" ");
    System.out.println("geolocation.current = " + location);
    System.out.println("geolocation.east = serga_lake");
    System.out.println("geolocation.south = harvey_village");
    System.out.println("geolocation.west = mana_lake");
    System.out.println("geolocation.next = ");
    cmd = input.next();

    if(cmd.equals("mv.east")) {
      location = "serga_lake"; //East
    }
    else if(cmd.equals("mv.south")) {
      location = "harvey_village"; //South
    }
    else if(cmd.equals("mv.west")) {
      location = "mana_lake"; //West
    }
    else {
      AskForHelp();
    }

  }

// ----------[ 3.2- Progress Bars ]----------

  static void load_mv_sneak() {
    //Convert chars to array
    String message = "[----------------------------------------]";
    char[] chars = message.toCharArray();

    //Print a char from the array, then sleep for specified time
    for (int i = 0; i < chars.length; i++) {
        System.out.print(chars[i]);
        Thread.sleep(250); //10s
    }
  }

  static void load_mv_walk() {
    //Convert chars to array
    String message = "[----------------------------------------]";
    char[] chars = message.toCharArray();

    //Print a char from the array, then sleep for specified time
    for (int i = 0; i < chars.length; i++) {
        System.out.print(chars[i]);
        Thread.sleep(175); //7s
    }
  }

  static void load_mv_sprint() {
    //Convert chars to array
    String message = "[----------------------------------------]";
    char[] chars = message.toCharArray();

    //Print a char from the array, then sleep for specified time
    for (int i = 0; i < chars.length; i++) {
        System.out.print(chars[i]);
        Thread.sleep(125); //5s
    }
  }

  static void load_mv_drive() {
    //Convert chars to array
    String message = "[----------------------------------------]";
    char[] chars = message.toCharArray();

    //Print a char from the array, then sleep for specified time
    for (int i = 0; i < chars.length; i++) {
        System.out.print(chars[i]);
        Thread.sleep(50); //2s
    }
  }

// ----------[ 4- INVENTORY SYSTEM ]----------

  public static void InventorySystem() {

    //DEFINING PROPERTIES //TODO: Temporary file, set up proper pickup system
    car_keys = 1;
  }

// ----------[ 4.2- Inventory Checks ]----------

  static void inv_check_car_keys() {
    if(car_keys == 1) {
      load_mv_drive();
    }
    else {
      System.out.println("Scour the map to find the car keys to be able to drive.");
    }
  }

  //input.close();

}
