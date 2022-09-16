package Patterns.ObserverPattern.Action;

import Patterns.ObserverPattern.Entity.Character;
import Patterns.ObserverPattern.Interfaces.CharacterObserver;
import Patterns.ObserverPattern.Interfaces.Observer;

public class CharacterObserverImpl implements Observer, CharacterObserver {

  Character c;
  String state;
  String equipment;
  int xAsis;
  int yAsis;

  public CharacterObserverImpl(Character c, String state, String equipment, int xAsis, int yAsis) {
    this.c = c;
    this.state = state;
    this.xAsis = xAsis;
    this.yAsis = yAsis;
    this.equipment = equipment;
  }

  @Override
  public void updateCharacterState(String state, String equipment, int xAsis, int yAsis) {
    this.c.setState(state);
    this.c.setEquipment(equipment);
    this.c.setxAsis(xAsis);
    this.c.setyAsis(yAsis);
  }

  @Override
  public Character getCharacterUpdated() {
    return this.c;
  }

  @Override
  public void update() {
    this.updateCharacterState(this.state,
        this.equipment,
        this.xAsis,
        this.yAsis);
  }
}
