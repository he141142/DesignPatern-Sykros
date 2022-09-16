package Patterns.ObserverPattern.Entity;

import Patterns.ObserverPattern.Entity.dto.CharacterDto;
import Patterns.ObserverPattern.Interfaces.Observer;
import Patterns.ObserverPattern.Interfaces.Subject;
import java.util.ArrayList;
import java.util.List;

public class GameData extends BaseObserver implements Subject {

  Observer mapObServer;
  List<Observer> observers = new ArrayList<>();
  List<CharacterDto> characterDtos = new ArrayList<>();
  private String SubjectName;
  private Object[][] map;
  private String label;

  public GameData(Builder builder) {
      this.SubjectName = builder.SubjectName;
      this.characterDtos = builder.characterDtos;
      this.map = builder.map;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<CharacterDto> getCharacterDtos() {
    return characterDtos;
  }

  public String getSubjectName() {
    return SubjectName;
  }

  public Observer getMapObServer() {
    return mapObServer;
  }

  public void setMapObServer(Observer mapObServer) {
    this.mapObServer = mapObServer;
  }

  public List<Observer> getObservers() {
    return observers;
  }

  public void setObservers(List<Observer> observers) {
    this.observers = observers;
  }

  public Object[][] getMap() {
    return map;
  }


  public void setMap(Object[][] map) {
    this.map = map;
  }

  public void setCharacterByLabel(String label,int x,int y){
      for (int i =0;i<this.characterDtos.size();i++){
        if (this.characterDtos.get(i).getPresentLabel()==label){
            this.characterDtos.get(i).setxAsis(x);
            this.characterDtos.get(i).setyAsis(y);
          break;
        }
      }

  }

  @Override
  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    this.observers.remove(o);
  }

  @Override
  public void notifyObservers(List<Observer> observers) {
    for (int i = 0; i < this.observers.size(); i++) {
      this.observers.get(i).update();
    }
  }

  @Override
  public void registerMapObserver(Observer o) {
    this.mapObServer = o;
  }

  public void stateChanged() {
    notifyObservers(this.observers);
  }

  public void setNewState(String state, String equipment, int xAsis, int yAsis) {
    stateChanged();
  }

  public void setCharacterState(String state, String equipment, int xAsis, int yAsis) {
    stateChanged();
  }

  public void updateMap() {

  }

  public void ResetState() {

  }

  public void moveCharacter(String label,int x,int y){
        this.setCharacterByLabel(label,x,y);
        notifyObservers(this.observers);
  }


  public static class Builder {


    private Object map[][];
    List<CharacterDto> characterDtos = new ArrayList<>();
    private String SubjectName;

    public Builder setSubjectName(String name) {
      this.SubjectName = name;
      return this;
    }

    public Builder setMap(Object map[][]) {
      this.map = map;
      return this;
    }

    public GameData build() {
      return new GameData(this);
    }

    public Builder addCharacter(CharacterDto characterDto) {
      this.characterDtos.add(characterDto);
      return this;
    }

  }


}
