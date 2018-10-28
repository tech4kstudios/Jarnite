//Define package
package jarnite;

//Import java dependencies
import java.util.Random;

public class weapons {

  //System Objects
  static Random rand = new Random();

  //Declare Weapon Details
  static int batonAttackDamage;
  static int knifeAttackDamage;
  static int axeSwingDamage;
  static int stunGunShootDamage;
  static int pistolFireDamage;
  static int amrFireDamage;
  static int punchDamage;

  //NPC Damage
  static int npcAttackDamage;

  public static void main(String[] args) {
    //INVENTORY VALIDATION
  }

// ----------[ ATTACK MECHANICS ]----------

  static void batonAttack() {
    //Randomize Damage Amount
    batonAttackDamage = rand.nextInt(weapon_stats.maxBatonDamage - weapon_stats.minBatonDamage) + weapon_stats.minBatonDamage;
    npcAttackDamage = rand.nextInt(weapon_stats.maxNpcAttackDamage - weapon_stats.minNpcAttackDamage) + weapon_stats.minNpcAttackDamage;
    //Deduct Damage from Health
    player.npcHealth -= batonAttackDamage;
    player.playerHealth -= npcAttackDamage;
  }

  static void knifeAttack() {
    //Randomize Damage Amount
    knifeAttackDamage = rand.nextInt(weapon_stats.maxKnifeDamage - weapon_stats.minKnifeDamage) + weapon_stats.minKnifeDamage;
    npcAttackDamage = rand.nextInt(weapon_stats.maxNpcAttackDamage - weapon_stats.minNpcAttackDamage) + weapon_stats.minNpcAttackDamage;
    //Deduct Damage from Health
    player.npcHealth -= knifeAttackDamage;
    player.playerHealth -= npcAttackDamage;
  }

  static void axeSwing() {
    //Randomize Damage Amount
    axeSwingDamage = rand.nextInt(weapon_stats.maxAxeDamage - weapon_stats.minAxeDamage) + weapon_stats.minAxeDamage;
    npcAttackDamage = rand.nextInt(weapon_stats.maxNpcAttackDamage - weapon_stats.minNpcAttackDamage) + weapon_stats.minNpcAttackDamage;
    //Deduct Damage from Health
    player.npcHealth -= axeSwingDamage;
    player.playerHealth -= npcAttackDamage;
  }

  static void stun_gunShoot() {
    //Randomize Damage Amount
    stunGunShootDamage = rand.nextInt(weapon_stats.maxStunGunDamage - weapon_stats.minStunGunDamage) + weapon_stats.minStunGunDamage;
    npcAttackDamage = rand.nextInt(weapon_stats.maxNpcAttackDamage - weapon_stats.minNpcAttackDamage) + weapon_stats.minNpcAttackDamage;
    //Deduct Damage from Health
    player.npcHealth -= stunGunShootDamage;
    player.playerHealth -= npcAttackDamage;
  }

  static void pistolFire() {
    //Randomize Damage Amount
    pistolFireDamage = rand.nextInt(weapon_stats.maxPistolDamage - weapon_stats.minPistolDamage) + weapon_stats.minPistolDamage;
    npcAttackDamage = rand.nextInt(weapon_stats.maxNpcAttackDamage - weapon_stats.minNpcAttackDamage) + weapon_stats.minNpcAttackDamage;
    //Deduct Damage from Health
    player.npcHealth -= pistolFireDamage;
    player.playerHealth -= npcAttackDamage;
  }

  static void amrFire() {
    //Randomize Damage Amount
    amrFireDamage = rand.nextInt(weapon_stats.maxAmrDamage - weapon_stats.minAmrDamage) + weapon_stats.minAmrDamage;
    npcAttackDamage = rand.nextInt(weapon_stats.maxNpcAttackDamage - weapon_stats.minNpcAttackDamage) + weapon_stats.minNpcAttackDamage;
    //Deduct Damage from Health
    player.npcHealth -= amrFireDamage;
    player.playerHealth -= npcAttackDamage;
  }

  static void punch() {
    //Randomize Damage Amount
    punchDamage = rand.nextInt(weapon_stats.maxPunchDamage - weapon_stats.minPunchDamage) + weapon_stats.minPunchDamage;
    npcAttackDamage = rand.nextInt(weapon_stats.maxNpcAttackDamage - weapon_stats.minNpcAttackDamage) + weapon_stats.minNpcAttackDamage;
    //Deduct Damage from Health
    player.npcHealth -= punchDamage;
    player.playerHealth -= npcAttackDamage;
  }

}
