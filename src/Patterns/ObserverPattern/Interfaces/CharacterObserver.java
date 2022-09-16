package Patterns.ObserverPattern.Interfaces;

import Patterns.ObserverPattern.Entity.Character;

public interface CharacterObserver {
  void updateCharacterState(String state,String equipment, int xAsis, int yAsis);
  Character getCharacterUpdated();

}
