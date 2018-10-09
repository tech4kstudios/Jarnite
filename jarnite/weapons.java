//Define package
package jarnite;

public class weapons {

  //Declare Weapon Details
  private String Name;
	private int Quantity;
  private int Damage;
  private int MaxAmmo;
  private int MagazineAmmo;

  private int WeaponLocation; // Will store locationID
  private boolean Available;

 public static void main(String[] args) {
    WeaponsList();
  }

// ----------[ ITEMS LIST ]----------

  // Sets the constructor of the class Weapon
  public Weapon(string WeaponName) {
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
  // Assign number of bullets available in the weapon magazine to the variable magazine-ammo
  public void WeaponMagazineAmmo(int WeaponMagazineAmmo) {
    MagazineAmmo = WeaponMagazineAmmo;
  }
  // Assign availability of the weapon to the variable available
  public void WeaponAvailable(int WeaponAvailable) {
    Available = WeaponAvailable;
  }
  // Assign location of the weapon to the variable location
  public void WeaponLocation(int WeaponLocation) {
    Location = WeaponLocation;
  }

}
