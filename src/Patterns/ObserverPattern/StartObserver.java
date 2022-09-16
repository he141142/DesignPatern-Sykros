package Patterns.ObserverPattern;

import Patterns.ObserverPattern.Entity.Character;
import Patterns.ObserverPattern.Entity.GameData;
import Patterns.ObserverPattern.Entity.Map;
import Patterns.ObserverPattern.Entity.dto.CharacterDto;

public class StartObserver {

  public void StartDevelopment() {
    Map m = new Map.MapBuilder().setWidth(10).setHeight(12).initMap().build();

    CharacterDto Zoro = new CharacterDto.Builder("x").setState("Stand").setX(10).setY(20)
        .setEquipment("Enma").build();
    CharacterDto Luffy = new CharacterDto.Builder("*").setState("gear4 activated").setX(2)
        .setY(10)
        .setEquipment("Sandal").build();
    CharacterDto Nami = new CharacterDto.Builder("$").setState("Move to the left").setX(13)
        .setY(2)
        .setEquipment("Tempo").build();

    GameData gameData = new GameData.Builder().setSubjectName("Data").setMap(m.getMap())
        .addCharacter(Zoro).addCharacter(Luffy).addCharacter(Nami).build();

    Character zoro = new Character(gameData, Zoro.getPresentLabel());
    Character nami = new Character(gameData, Nami.getPresentLabel());
    Character luffy = new Character(gameData, Luffy.getPresentLabel());

    gameData.moveCharacter(Zoro.getPresentLabel(),11,8);


  }

}
