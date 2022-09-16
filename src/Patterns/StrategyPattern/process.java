package Patterns.StrategyPattern;

import Patterns.StrategyPattern.Entity.Action.EnmaBehaviour;
import Patterns.StrategyPattern.Entity.Character;
import Patterns.StrategyPattern.Entity.Weapon;
import Patterns.StrategyPattern.Entity.Zoro;
import Patterns.StrategyPattern.Interface.WeaponBehaviour;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class process {

  List<Character> characterList = new ArrayList<>();

  public void startDeveloping() {
    this.InitCharacter().performUseWeapon();

  }

  public Character InitCharacter() {
    Character zoro = new Zoro.Builder("Zoro", this.BuildWeapon()).setGuild("Straw Hat")
        .setHeight(183).setWeight(70).setWantedAmount(800000000L).build();

    zoro.setWeaponBehaviour(this.weaponBehaviourInit(zoro));
    return zoro;
  }

  public WeaponBehaviour weaponBehaviourInit(Character c) {
    WeaponBehaviour weaponBehaviour = new EnmaBehaviour(c.getWeapon());
    return weaponBehaviour;
  }

  public Weapon BuildWeapon() {
    return new Weapon.WeaponBuilder("Enma", 1).setDurability(99999).setLocationFound("Wanno")
        .setSkill(new ArrayList<>(Arrays.asList("1080 POUND CANNON",
            "TORO SAMON", "BILLION-FOLD WORLD TRICHILIOCOSM", "GREAT DRAGON TWISTER")))
        .build();
  }

}
