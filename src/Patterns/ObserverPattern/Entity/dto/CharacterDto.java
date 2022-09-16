package Patterns.ObserverPattern.Entity.dto;

import Patterns.ObserverPattern.Entity.GameData;

public class CharacterDto {

  private String state;
  private int xAsis;
  private int yAsis;
  private String equipment;
  private String presentLabel;
  private GameData gameData;

  public String getState() {
    return state;
  }


  public int getxAsis() {
    return xAsis;
  }

  public int getyAsis() {
    return yAsis;
  }


  public String getEquipment() {
    return equipment;
  }


  public String getPresentLabel() {
    return presentLabel;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setxAsis(int xAsis) {
    this.xAsis = xAsis;
  }

  public void setyAsis(int yAsis) {
    this.yAsis = yAsis;
  }

  public void setEquipment(String equipment) {
    this.equipment = equipment;
  }

  public void setPresentLabel(String presentLabel) {
    this.presentLabel = presentLabel;
  }

  public void setGameData(GameData gameData) {
    this.gameData = gameData;
  }

  public CharacterDto(Builder builder) {
    this.equipment = builder.equipment;
    this.presentLabel = builder.presentLabel;
    this.xAsis = builder.xAsis;
    this.yAsis = builder.yAsis;

  }

  public static class Builder {

    private String state;
    private int xAsis;
    private int yAsis;
    private String equipment;
    private String presentLabel;
    private GameData gameData;

    public Builder(String presentLabel) {
      this.presentLabel = presentLabel;
    }

    public Builder setX(int xAsis) {
      this.xAsis = xAsis;
      return this;
    }

    public Builder setY(int yAsis) {
      this.xAsis = yAsis;
      return this;
    }

    public Builder setState(String state) {
      this.state = state;
      return this;
    }

    public Builder setEquipment(String equipment) {
      this.equipment = equipment;
      return this;
    }

    public CharacterDto build() {
      return new CharacterDto(this);
    }

  }
}
