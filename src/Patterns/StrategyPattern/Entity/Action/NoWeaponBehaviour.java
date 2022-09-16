package Patterns.StrategyPattern.Entity.Action;

import Patterns.StrategyPattern.Interface.WeaponBehaviour;

public class NoWeaponBehaviour implements WeaponBehaviour {

  @Override
  public void perFormBehaviourLogic() {
    System.out.println("Out standing move!");
  }
}
