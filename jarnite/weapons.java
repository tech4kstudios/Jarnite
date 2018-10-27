//Define package
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

// ----------[ ITEMS LIST ]----------

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
  }

}
