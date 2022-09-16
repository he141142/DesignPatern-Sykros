package Patterns.ObserverPattern.Interfaces;

import java.util.List;

public interface Subject {
  void registerObserver(Observer o);
  void removeObserver(Observer o);
  void notifyObservers(List<Observer> observers);
  void registerMapObserver(Observer o);

}
