package Patterns.ObserverPattern.Entity;

import Patterns.ObserverPattern.Entity.dto.CharacterDto;
import Patterns.ObserverPattern.Interfaces.Observer;
import java.util.List;

public class Character implements Observer {

  private String label;
  private String state;
  private int xAsis;
  private int yAsis;
  private String equipment;
  private String presentLabel;
  private GameData gameData;

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getxAsis() {
    return xAsis;
  }

  public void setxAsis(int xAsis) {
    this.xAsis = xAsis;
  }

  public int getyAsis() {
    return yAsis;
  }

  public void setyAsis(int yAsis) {
    this.yAsis = yAsis;
  }

  public String getEquipment() {
    return equipment;
  }

  public void setEquipment(String equipment) {
    this.equipment = equipment;
  }

  public String getPresentLabel() {
    return presentLabel;
  }

  public void setPresentLabel(String presentLabel) {
    this.presentLabel = presentLabel;
  }

  public GameData getCharacterData() {
    return gameData;
  }

  public void setCharacterData(GameData gameData) {
    this.gameData = gameData;
  }


  public Character(GameData gameData, String characterName) {
    this.gameData = gameData;
    gameData.registerObserver(this);
    Boolean found = false;
    this.setLabel(characterName);
    for (int i = 0; i < gameData.characterDtos.size(); ++i) {
      CharacterDto characterDto = gameData.characterDtos.get(i);
      if (characterDto.getPresentLabel() == characterName) {
        found = true;
        this.setEquipment(characterDto.getEquipment());
        this.setxAsis(characterDto.getxAsis());
        this.setyAsis(characterDto.getyAsis());
        this.setState(characterDto.getState());
        this.setPresentLabel(characterDto.getPresentLabel());
        break;
      }
    }
    if (!found) {
      throw new RuntimeException("Not Found Character");
    }
  }

  @Override
  public void update() {
    List<CharacterDto> characters = this.gameData.getCharacterDtos();
    for (int i = 0; i < characters.size(); i++) {
      if (characters.get(i).getPresentLabel() == this.presentLabel) {
        this.setyAsis(characters.get(i).getyAsis());
        this.setxAsis(characters.get(i).getxAsis());
        System.out.println(this.presentLabel + "Moved");
        Display();
        return;
      }
    }
  }

  public void Display() {
    System.out.format("%-30s%-20s%-10s%-10s\n"
            + "%-30s%-20s%-10s%-10s\n",
        "State", "Equipment", "X", "Y",
        this.state, this.equipment, this.xAsis, this.yAsis);
  }
}
