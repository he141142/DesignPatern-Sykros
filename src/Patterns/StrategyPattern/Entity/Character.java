package Patterns.StrategyPattern.Entity;

import Patterns.StrategyPattern.Entity.Action.NoWeaponBehaviour;
import Patterns.StrategyPattern.Interface.CharacterImpl;
import Patterns.StrategyPattern.Interface.WeaponBehaviour;

public class Character implements CharacterImpl {

  String name;
  Weapon weapon;
  WeaponBehaviour weaponBehaviour = null;

  private Long Wanted;
  private String guild;
  private String organization;
  private int weight;
  private int height;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public WeaponBehaviour getWeaponBehaviour() {
    return weaponBehaviour;
  }

  public Long getWanted() {
    return Wanted;
  }

  public void setWanted(Long wanted) {
    Wanted = wanted;
  }

  public String getGuild() {
    return guild;
  }

  public void setGuild(String guild) {
    this.guild = guild;
  }

  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public Character(Builder builder) {
    this.weapon = builder.weapon;
    this.name = builder.name;
    this.Wanted = builder.Wanted;
    this.guild = builder.guild;
    this.organization = builder.organization;
    this.weight = builder.weight;
    this.height = builder.height;
  }


  @Override
  public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
    this.weaponBehaviour = weaponBehaviour;
  }

  @Override
  public void performUseWeapon() {
    if (this.weaponBehaviour == null) {
      this.weaponBehaviour = new NoWeaponBehaviour();
    }
    this.weaponBehaviour.perFormBehaviourLogic();
  }

  public static class Builder {

    String name;
    Weapon weapon;

    private Long Wanted;
    private String guild;
    private String organization;
    private int weight;
    private int height;

    public Builder(String name, Weapon weapon) {
      this.weapon = weapon;
      this.name = name;
    }

    public Builder setWantedAmount(Long Wanted) {
      this.Wanted = Wanted;
      return this;
    }

    public Builder setGuild(String guild) {
      this.guild = guild;
      return this;
    }

    public Builder setOrganization(String organization) {
      this.organization = organization;
      return this;
    }

    public Builder setWeight(int weight) {
      this.weight = weight;
      return this;
    }

    public Builder setHeight(int height) {
      this.height = height;
      return this;
    }

    public Character build() {
      return new Character(this);
    }

  }


}
