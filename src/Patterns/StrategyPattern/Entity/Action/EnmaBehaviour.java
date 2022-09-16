package Patterns.StrategyPattern.Entity.Action;

import Patterns.StrategyPattern.Entity.Weapon;
import Patterns.StrategyPattern.Interface.WeaponBehaviour;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EnmaBehaviour implements WeaponBehaviour {

  Weapon weapon;
  ArrayList<String> actionSets = new ArrayList<>();

  public EnmaBehaviour(Weapon weapon){
    this.weapon = weapon;
  }

  @Override
  public void perFormBehaviourLogic() {
    System.out.format("This Weapon %s has base %d skill\n",this.weapon.getName(),this.weapon.getSkills().size());
    this.getAndSetActionSet();
    this.DisplayActionSet();

  }

  public ArrayList<String> getAndSetActionSet(){
    this.actionSets = (ArrayList<String>) this.getAllSkill().stream().map(skill ->
        {
          return "Perform: " + skill;
        }
    ).collect(Collectors.toList());
    return this.actionSets;
  }

  public void DisplayActionSet(){
        this.actionSets.forEach(
            act-> System.out.format("Skill Set [%s]\n",act)
        );
  }

  public ArrayList<String> getAllSkill() {
    return (ArrayList<String>) this.weapon.getSkills();
  }

}
