//Define package
package jarnite;

//Import dependencies
import java.util.*;

public class geolocation {

  //Sets the static starting spawn location
  //static String location = "kiren_hills";

  //Generate random starting spawn location
  static String [] locations = {"kiren_hills","hersha_forest","mana_lake","serga_lake","trenlo_hills","surrey_hills","nimba_hills","serpa_forest", "harvey_village", "nambi_hills", "shorte_plane", "longdon_plane", "north_jen_city", "chiffley_village", "kelna_forest", "brupton_plane", "west_jen_city", "jen_city_centre", "east_jen_city", "frena_district", "pahje_district", "mika_district", "south_jen_city", "lucto_district", "yana_district"}; //Index 0 to 24
  static Random RandomLocation = new Random();
  static int LocationNumber = RandomLocation.nextInt(25);
  static String location = locations[LocationNumber];

  //Creates a new scanner called input - USED IN GEOLOCATION
  static Scanner input = new Scanner(System.in);
  static String cmd;

  //Define Car Keys
  static int car_keys = inventory.car_keys;

// ----------[ GEOLOCATION ]----------

  public static void main(String[] args) throws InterruptedException {
    LocationLibrary(args);
  }

  static void LocationLibrary(String[] args) throws InterruptedException {

    while(true) {

    if(location.equals("kiren_hills")){
      kiren_hills(args);
    }
    else if(location.equals("hersha_forest")){
      hersha_forest(args);
    }
    else if(location == "mana_lake"){
      mana_lake(args);
    }
    else if(location == "serga_lake"){
      serga_lake(args);
    }
    else if(location == "trenlo_hills"){
      trenlo_hills(args);
    }
    else if(location == "surrey_hills"){
      surrey_hills(args);
    }
    else if(location == "nimba_hills"){
      nimba_hills(args);
    }
    else if(location == "serpa_forest"){
      serpa_forest(args);
    }
    else if(location == "harvey_village"){
      harvey_village(args);
    }
    else if(location == "nambi_hills"){
      nambi_hills(args);
    }
    else if(location == "shorte_plane"){
      shorte_plane(args);
    }
    else if(location == "longdon_plane"){
      longdon_plane(args);
    }
    else if(location == "north_jen_city"){
      north_jen_city(args);
    }
    else if(location == "chiffley_village"){
      chiffley_village(args);
    }
    else if(location == "kelna_forest"){
      kelna_forest(args);
    }
    else if(location == "brupton_plane"){
      brupton_plane(args);
    }
    else if(location == "west_jen_city"){
      west_jen_city(args);
    }
    else if(location == "jen_city_centre"){
      jen_city_centre(args);
    }
    else if(location == "east_jen_city"){
      east_jen_city(args);
    }
    else if(location == "frena_district"){
      frena_district(args);
    }
    else if(location == "pahje_district"){
      pahje_district(args);
    }
    else if(location == "mika_district"){
      mika_district(args);
    }
    else if(location == "south_jen_city"){
      south_jen_city(args);
    }
    else if(location == "lucto_district"){
      lucto_district(args);
    }
    else if(location == "yana_district"){
      yana_district(args);
    }
    else{
      System.out.println("ADMIN: Location not found!"); //ADMIN: System message, not for user
    }

    }
  }

// ----------[ Global Positioning ]----------

static void kiren_hills(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.east = hersha_forest");
  System.out.println("geolocation.south = surrey_hills");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(args);
    location = "hersha_forest"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "hersha_forest"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "hersha_forest"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "hersha_forest"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    kiren_hills(args);
  }
  else if(cmd.equals("mv-sneak.south")) {
    location = "surrey_hills"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "surrey_hills"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "surrey_hills"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "surrey_hills"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    kiren_hills(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void hersha_forest(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.east = mana_lake");
  System.out.println("geolocation.south = nimba_hills");
  System.out.println("geolocation.west = kiren_hills");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "mana_lake"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "mana_lake"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "mana_lake"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "mana_lake"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    hersha_forest(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "nimba_hills"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "nimba_hills"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "nimba_hills"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "nimba_hills"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    hersha_forest(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "kiren_hills"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "kiren_hills"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "kiren_hills"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "kiren_hills"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    hersha_forest(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void mana_lake(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.east = serga_lake");
  System.out.println("geolocation.south = serpa_forest");
  System.out.println("geolocation.west = hersha_forest");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "serga_lake"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "serga_lake"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "serga_lake"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "serga_lake"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    mana_lake(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "serpa_forest"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "serpa_forest"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "serpa_forest"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "serpa_forest"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    mana_lake(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "hersha_forest"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "hersha_forest"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "hersha_forest"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "hersha_forest"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    mana_lake(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void serga_lake(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.east = trenlo_hills");
  System.out.println("geolocation.south = harvey_village");
  System.out.println("geolocation.west = mana_lake");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "trenlo_hills"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "trenlo_hills"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "trenlo_hills"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "trenlo_hills"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    serga_lake(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "harvey_village"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "harvey_village"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "harvey_village"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "harvey_village"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    serga_lake(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "mana_lake"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "mana_lake"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "mana_lake"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "mana_lake"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    serga_lake(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void trenlo_hills(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.south = nambi_hills");
  System.out.println("geolocation.west = serga_lake");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "nambi_hills"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "nambi_hills"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "nambi_hills"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "nambi_hills"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    trenlo_hills(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "serga_lake"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "serga_lake"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "serga_lake"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "serga_lake"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    trenlo_hills(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void surrey_hills(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = kiren_hills");
  System.out.println("geolocation.east = nimba_hills");
  System.out.println("geolocation.south = shorte_plane");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "kiren_hills"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "kiren_hills"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "kiren_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "kiren_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    surrey_hills(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "nimba_hills"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "nimba_hills"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "nimba_hills"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "nimba_hills"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    surrey_hills(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "shorte_plane"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "shorte_plane"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "shorte_plane"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "shorte_plane"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    surrey_hills(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void nimba_hills(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = hersha_forest");
  System.out.println("geolocation.east = serpa_forest");
  System.out.println("geolocation.south = longdon_plane");
  System.out.println("geolocation.west = surrey_hills");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "hersha_forest"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "hersha_forest"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "hersha_forest"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "hersha_forest"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    nimba_hills(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "serpa_forest"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "serpa_forest"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "serpa_forest"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "serpa_forest"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    nimba_hills(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "longdon_plane"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "longdon_plane"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "longdon_plane"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "longdon_plane"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    nimba_hills(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "surrey_hills"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "surrey_hills"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "surrey_hills"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "surrey_hills"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    nimba_hills(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void serpa_forest(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = mana_lake");
  System.out.println("geolocation.east = harvey_village");
  System.out.println("geolocation.south = north_jen_city");
  System.out.println("geolocation.west = nimba_hills");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "mana_lake"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "mana_lake"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "mana_lake"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "mana_lake"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    serpa_forest(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "harvey_village"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "harvey_village"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "harvey_village"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "harvey_village"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    serpa_forest(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "north_jen_city"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "north_jen_city"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "north_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "north_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    serpa_forest(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "nimba_hills"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "nimba_hills"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "nimba_hills"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "nimba_hills"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    serpa_forest(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void harvey_village(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = serga_lake");
  System.out.println("geolocation.east = nambi_hills");
  System.out.println("geolocation.south = chiffley_village");
  System.out.println("geolocation.west = serpa_forest");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "serga_lake"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "serga_lake"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "serga_lake"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "serga_lake"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    harvey_village(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "nambi_hills"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "nambi_hills"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "nambi_hills"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "nambi_hills"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    harvey_village(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "chiffley_village"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "chiffley_village"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "chiffley_village"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "chiffley_village"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    harvey_village(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "serpa_forest"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "serpa_forest"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "serpa_forest"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "serpa_forest"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    harvey_village(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void nambi_hills(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = trenlo_hills");
  System.out.println("geolocation.south = kelna_forest");
  System.out.println("geolocation.west = harvey_village");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "trenlo_hills"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "trenlo_hills"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "trenlo_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "trenlo_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    nambi_hills(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "kelna_forest"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "kelna_forest"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "kelna_forest"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "kelna_forest"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    nambi_hills(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "harvey_village"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "harvey_village"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "harvey_village"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "harvey_village"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    nambi_hills(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void shorte_plane(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = surrey_hills");
  System.out.println("geolocation.east = longdon_plane");
  System.out.println("geolocation.south = brupton_plane");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "surrey_hills"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "surrey_hills"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "surrey_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "surrey_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    shorte_plane(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "longdon_plane"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "longdon_plane"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "longdon_plane"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "longdon_plane"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    shorte_plane(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "brupton_plane"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "brupton_plane"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "brupton_plane"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "brupton_plane"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    shorte_plane(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void longdon_plane(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = nimba_hills");
  System.out.println("geolocation.east = north_jen_city");
  System.out.println("geolocation.south = west_jen_city");
  System.out.println("geolocation.west = shorte_plane");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "nimba_hills"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "nimba_hills"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "nimba_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "nimba_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    longdon_plane(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "north_jen_city"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "north_jen_city"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "north_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "north_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    longdon_plane(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "west_jen_city"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "west_jen_city"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "west_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "west_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    longdon_plane(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "shorte_plane"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "shorte_plane"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "shorte_plane"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "shorte_plane"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    longdon_plane(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void north_jen_city(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = serpa_forest");
  System.out.println("geolocation.east = chiffley_village");
  System.out.println("geolocation.south = jen_city_centre");
  System.out.println("geolocation.west = longdon_plane");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "serpa_forest"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "serpa_forest"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "serpa_forest"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "serpa_forest"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    north_jen_city(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "chiffley_village"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "chiffley_village"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "chiffley_village"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "chiffley_village"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    north_jen_city(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "jen_city_centre"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "jen_city_centre"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "jen_city_centre"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "jen_city_centre"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    north_jen_city(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "longdon_plane"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "longdon_plane"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "longdon_plane"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "longdon_plane"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    north_jen_city(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void chiffley_village(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = harvey_village");
  System.out.println("geolocation.east = kelna_forest");
  System.out.println("geolocation.south = east_jen_city");
  System.out.println("geolocation.west = north_jen_city");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "harvey_village"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "harvey_village"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "harvey_village"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "harvey_village"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    chiffley_village(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "kelna_forest"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "kelna_forest"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "kelna_forest"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "kelna_forest"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    chiffley_village(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "east_jen_city"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "east_jen_city"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "east_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "east_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    chiffley_village(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "north_jen_city"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "north_jen_city"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "north_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "north_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    chiffley_village(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void kelna_forest(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = nambi_hills");
  System.out.println("geolocation.south = frena_district");
  System.out.println("geolocation.west = chiffley_village");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "nambi_hills"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "nambi_hills"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "nambi_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "nambi_hills"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    kelna_forest(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "frena_district"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "frena_district"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "frena_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "frena_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    kelna_forest(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "chiffley_village"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "chiffley_village"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "chiffley_village"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "chiffley_village"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    kelna_forest(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void brupton_plane(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = shorte_plane");
  System.out.println("geolocation.east = west_jen_city");
  System.out.println("geolocation.south = pahje_district");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "shorte_plane"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "shorte_plane"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "shorte_plane"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "shorte_plane"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    brupton_plane(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "west_jen_city"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "west_jen_city"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "west_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "west_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    brupton_plane(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "pahje_district"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "pahje_district"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "pahje_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "pahje_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    brupton_plane(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void west_jen_city(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = longdon_plane");
  System.out.println("geolocation.east = jen_city_centre");
  System.out.println("geolocation.south = mika_district");
  System.out.println("geolocation.west = brupton_plane");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "longdon_plane"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "longdon_plane"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "longdon_plane"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "longdon_plane"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    west_jen_city(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "jen_city_centre"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "jen_city_centre"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "jen_city_centre"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "jen_city_centre"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    west_jen_city(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "mika_district"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "mika_district"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "mika_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "mika_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    west_jen_city(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "brupton_plane"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "brupton_plane"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "brupton_plane"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "brupton_plane"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    west_jen_city(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void jen_city_centre(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = north_jen_city");
  System.out.println("geolocation.east = east_jen_city");
  System.out.println("geolocation.south = south_jen_city");
  System.out.println("geolocation.west = west_jen_city");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "north_jen_city"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "north_jen_city"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "north_jen_city"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "north_jen_city"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    jen_city_centre(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "east_jen_city"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "east_jen_city"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "east_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "east_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    jen_city_centre(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "south_jen_city"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "south_jen_city"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "south_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "south_jen_city"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    jen_city_centre(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "west_jen_city"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "west_jen_city"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "west_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "west_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    jen_city_centre(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void east_jen_city(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = chiffley_village");
  System.out.println("geolocation.east = frena_district");
  System.out.println("geolocation.south = lucto_district");
  System.out.println("geolocation.west = jen_city_centre");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "chiffley_village"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "chiffley_village"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "chiffley_village"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "chiffley_village"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    east_jen_city(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "frena_district"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "frena_district"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "frena_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "frena_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    east_jen_city(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "lucto_district"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "lucto_district"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "lucto_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "lucto_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    east_jen_city(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "jen_city_centre"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "jen_city_centre"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "jen_city_centre"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "jen_city_centre"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    east_jen_city(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void frena_district(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = kelna_forest");
  System.out.println("geolocation.south = yana_district");
  System.out.println("geolocation.west = east_jen_city");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "kelna_forest"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "kelna_forest"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "kelna_forest"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "kelna_forest"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    frena_district(args);
  }
  if(cmd.equals("mv-sneak.south")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "yana_district"; //South
  }
  else if(cmd.equals("mv-walk.south")) {
    load_mv_walk.main(new String[] { "args" });
    location = "yana_district"; //South
  }
  else if(cmd.equals("mv-sprint.south")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "yana_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "yana_district"; //South
  }
  else if(cmd.equals("mv-drive.south") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    frena_district(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "east_jen_city"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "east_jen_city"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "east_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "east_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    frena_district(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void pahje_district(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = brupton_plane");
  System.out.println("geolocation.east = mika_district");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "brupton_plane"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "brupton_plane"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "brupton_plane"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "brupton_plane"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    pahje_district(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "mika_district"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "mika_district"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "mika_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "mika_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    pahje_district(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void mika_district(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = west_jen_city");
  System.out.println("geolocation.east = south_jen_city");
  System.out.println("geolocation.west = pahje_district");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "west_jen_city"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "west_jen_city"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "west_jen_city"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "west_jen_city"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    mika_district(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "south_jen_city"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "south_jen_city"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "south_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "south_jen_city"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    mika_district(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "pahje_district"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "pahje_district"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "pahje_district"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "pahje_district"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    mika_district(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void south_jen_city(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = jen_city_centre");
  System.out.println("geolocation.east = lucto_district");
  System.out.println("geolocation.west = mika_district");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "jen_city_centre"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "jen_city_centre"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "jen_city_centre"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "jen_city_centre"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    south_jen_city(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "lucto_district"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "lucto_district"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "lucto_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "lucto_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    south_jen_city(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "mika_district"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "mika_district"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "mika_district"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "mika_district"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    south_jen_city(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void lucto_district(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = east_jen_city");
  System.out.println("geolocation.east = yana_district");
  System.out.println("geolocation.west = south_jen_city");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "east_jen_city"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "east_jen_city"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "east_jen_city"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "east_jen_city"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    lucto_district(args);
  }
  if(cmd.equals("mv-sneak.east")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "yana_district"; //East
  }
  else if(cmd.equals("mv-walk.east")) {
    load_mv_walk.main(new String[] { "args" });
    location = "yana_district"; //East
  }
  else if(cmd.equals("mv-sprint.east")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "yana_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "yana_district"; //East
  }
  else if(cmd.equals("mv-drive.east") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    lucto_district(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "south_jen_city"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "south_jen_city"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "south_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "south_jen_city"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    lucto_district(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

static void yana_district(String[] args) throws InterruptedException {
  System.out.println(" ");
  System.out.println("geolocation.current = " + location);
  System.out.println("geolocation.north = frena_district");
  System.out.println("geolocation.west = lucto_district");
  System.out.println("geolocation.next = ");
  cmd = input.next();

  if(cmd.equals("mv-sneak.north")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "frena_district"; //North
  }
  else if(cmd.equals("mv-walk.north")) {
    load_mv_walk.main(new String[] { "args" });
    location = "frena_district"; //North
  }
  else if(cmd.equals("mv-sprint.north")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "frena_district"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "frena_district"; //North
  }
  else if(cmd.equals("mv-drive.north") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    yana_district(args);
  }
  if(cmd.equals("mv-sneak.west")) {
    load_mv_sneak.main(new String[] { "args" });
    location = "lucto_district"; //West
  }
  else if(cmd.equals("mv-walk.west")) {
    load_mv_walk.main(new String[] { "args" });
    location = "lucto_district"; //West
  }
  else if(cmd.equals("mv-sprint.west")) {
    load_mv_sprint.main(new String[] { "args" });
    location = "lucto_district"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 1) {
    load_mv_drive.main(new String[] { "args" });
    location = "lucto_district"; //West
  }
  else if(cmd.equals("mv-drive.west") && car_keys == 0) {
    System.out.println("Scour the map to find the car keys to be able to drive.");
    yana_district(args);
  }
  else {
    commands.AskForHelp(args);
    //System.out.println("Unknown command, type '?' for a list of commands!");
  }

}

}
