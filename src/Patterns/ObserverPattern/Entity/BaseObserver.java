package Patterns.ObserverPattern.Entity;

import Patterns.ObserverPattern.Interfaces.Observer;

public class BaseObserver {
      private Observer genericObserver = null;
      public void setGenericObserver(Observer o){
          this.genericObserver = o;
      }
}
