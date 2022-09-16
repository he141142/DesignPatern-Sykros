package Patterns.StrategyPattern.Entity;

import java.util.ArrayList;
import java.util.List;

public class Weapon {

  private String name;
  private int amount;
  private int durability;
  private String locationFound;
  private List<String> skills;

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getDurability() {
    return durability;
  }

  public void setDurability(int durability) {
    this.durability = durability;
  }

  public String getLocationFound() {
    return locationFound;
  }

  public void setLocationFound(String locationFound) {
    this.locationFound = locationFound;
  }

  public Weapon(WeaponBuilder weaponBuilder){
      this.name = weaponBuilder.name;
      this.amount = weaponBuilder.amount;
      this.locationFound = weaponBuilder.locationFound;
      this.durability = weaponBuilder.durability;
      this.skills = weaponBuilder.skills;
  }

  public static class WeaponBuilder {
    String name;
    int amount;

    private int durability;
    private String locationFound;
    private List<String> skills;


    public WeaponBuilder( String _name, int _amount){
      this.amount = _amount;
      this.name = _name;
    }

    public WeaponBuilder setDurability(int durability){
      this.durability = durability;
      return this;
    }
    public WeaponBuilder setLocationFound(String locationFound){
      this.locationFound = locationFound;
      return this;
    }

    public WeaponBuilder addSkill(String skill){
        this.skills.add(skill);
        return this;
    }

    public WeaponBuilder setSkill(ArrayList<String> skillList){
      this.skills = skillList;
      return this;
    }


    public Weapon build(){
        return new Weapon(this);
    }

  }

}
