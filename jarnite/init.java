//Define package
package jarnite;

// ----------[ INITIALISATION ]----------

public class init {

  // Initialize and run the Main Menu
  public static void main(String[] args) throws InterruptedException {
    InitWeapons();
    main_menu.main(args);
  }

// ----------[ Initialise Weapons ]----------

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

  static void InitItems() {
    
  }

}
