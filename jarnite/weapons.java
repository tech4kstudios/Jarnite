/*//Define package
package jarnite;

//Import java dependencies
import java.io.*;

public class weapons {

  //Declare Weapon Details
  private String Name;
  private int Quantity;
  private int Damage;
  private int MaxAmmo;
  private int MagazineQuantity;

  private int WeaponLocation; // Will store locationID
  private boolean Available;

 public static void main(String[] args) {
    //WeaponsList();
  }

// ----------[ WEAPONS LIST ]----------

  // Sets the constructor of the class Weapon
  public weapons(String WeaponName) {
    this.Name = WeaponName;
  }
  // Assign quantity of weapons to the variable quantity
  public void WeaponQuantity(int WeaponQuantity) {
    Quantity = WeaponQuantity;
  }
  // Assign weapon damage to the variable damage
  public void WeaponDamage(int WeaponDamage) {
    Damage = WeaponDamage;
  }
  // Assign maximum weapon ammunition per magazine to the variable max-ammo
  public void WeaponMaxAmmo(int WeaponMaxAmmo) {
    MaxAmmo = WeaponMaxAmmo;
  }
  // Assign number of magazines for that weapon to the variable magazine-quantity
  public void WeaponMagazineQuantity(int WeaponMagazineQuantity) {
    MagazineQuantity = WeaponMagazineQuantity;
  }
  // Assign availability of the weapon to the variable available
  public void WeaponAvailable(boolean WeaponAvailable) {
    Available = WeaponAvailable;
  }
  // Assign location of the weapon to the variable location
  public void WeaponLocation(int WeaponLocation) {
    Location = WeaponLocation;

    //Initialize Weapon Spawn Locations
    static String [] locations = {"kiren_hills","hersha_forest","mana_lake","serga_lake","trenlo_hills","surrey_hills","nimba_hills","serpa_forest", "harvey_village", "nambi_hills", "shorte_plane", "longdon_plane", "north_jen_city", "chiffley_village", "kelna_forest", "brupton_plane", "west_jen_city", "jen_city_centre", "east_jen_city", "frena_district", "pahje_district", "mika_district", "south_jen_city", "lucto_district", "yana_district"}; //Index 0 to 24
    static Random randomLoc = new Random();
    static int locationNo = randomLoc.nextInt(25);
    static String WeaponLocation = locations[locationNo];
  }

// ----------[ INITIALIZE WEAPONS ]----------

  static void InitWeapons() {
    // Creating weapons as onjects
    weapons weaponOne = new weapons("Baton");
    weapons weaponTwo = new weapons("Pocket Knife");
    weapons weaponThree = new weapons("Axe");
    weapons weaponFour = new weapons("Stun Gun");
    weapons weaponFive = new weapons("Pistol");
    weapons weaponSix = new weapons("AMR");

    // Define Weapon Properties

    // Baton
    weaponOne.WeaponQuantity(2);
    weaponOne.WeaponDamage(2);
    weaponOne.WeaponMaxAmmo(1);
    weaponOne.WeaponMagazineQuantity(1);
    weaponOne.WeaponLocation(WeaponOneSpawn);
    weaponOne.WeaponAvailable(true);

    // Pocket Knife
    weaponTwo.WeaponQuantity(2);
    weaponTwo.WeaponDamage(5);
    weaponTwo.WeaponMaxAmmo(1);
    weaponTwo.WeaponMagazineQuantity(1);
    weaponTwo.WeaponLocation(WeaponTwoSpawn);
    weaponTwo.WeaponAvailable(true);

    // Axe
    weaponThree.WeaponQuantity(1);
    weaponThree.WeaponDamage(10);
    weaponThree.WeaponMaxAmmo(1);
    weaponThree.WeaponMagazineQuantity(1);
    weaponThree.WeaponLocation(WeaponThreeSpawn);
    weaponThree.WeaponAvailable(true);

    // Stun Gun
    weaponFour.WeaponQuantity(4);
    weaponFour.WeaponDamage(8);
    weaponFour.WeaponMaxAmmo(1);
    weaponFour.WeaponMagazineQuantity(2);
    weaponFour.WeaponLocation(WeaponFourSpawn);
    weaponFour.WeaponAvailable(true);

    // Pistol
    weaponFive.WeaponQuantity(1);
    weaponFive.WeaponDamage(20);
    weaponFive.WeaponMaxAmmo(8);
    weaponFive.WeaponMagazineQuantity(4);
    weaponFive.WeaponLocation(WeaponFiveSpawn);
    weaponFive.WeaponAvailable(true);

    // AMR
    weaponSix.WeaponQuantity(1);
    weaponSix.WeaponDamage(50);
    weaponSix.WeaponMaxAmmo(50);
    weaponSix.WeaponMagazineQuantity(5);
    weaponSix.WeaponLocation(WeaponSixSpawn);
    weaponSix.WeaponAvailable(true);
  }

}
*/