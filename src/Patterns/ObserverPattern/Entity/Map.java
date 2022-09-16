package Patterns.ObserverPattern.Entity;

import Patterns.ObserverPattern.Interfaces.DisplayElement;
import Patterns.ObserverPattern.Interfaces.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map extends BaseObserver implements Observer {

  List<DisplayElement> displayElements = new ArrayList<>();

  private int height;
  private int width;
  private Object map[][];

  public List<DisplayElement> getDisplayElements() {
    return displayElements;
  }

  public void setDisplayElements(
      List<DisplayElement> displayElements) {
    this.displayElements = displayElements;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public Object[][] getMap() {
    return map;
  }

  public void setMap(Object[][] map) {
    this.map = map;
  }

  public String[][] map() {
    String[][] map = null;
    return map;
  }

  public Map(MapBuilder mapBuilder) {
    this.height = mapBuilder.height;
    this.width = mapBuilder.width;
    this.map = mapBuilder.map;
  }

  @Override
  public void update() {

  }

  public static class MapBuilder {

    private int height;
    private int width;
    private Object map[][];

    public MapBuilder setHeight(int height) {
      this.height = height;
      return this;
    }

    public MapBuilder setWidth(int width) {
      this.width = width;
      return this;
    }

    public MapBuilder initMap() {
      if (width == 0 || height == 0) {
        throw new RuntimeException("Width Or Height Doesn't set Yet");
      }
      Object mapBuild[][];
      mapBuild = new Object[this.height][this.width];
      for (int y = 0; y < this.height; y++) {
        for (int x = 0; x < this.width; ++x) {
          mapBuild[y][x] = "*";
        }
      }
      this.map = mapBuild;
      return this;
    }

    public Map build() {
      return new Map(this);
    }
  }

  @Override
  public String toString() {
    String map = "";
    for (int i =0 ;i<this.map.length;i++){
      for (int j =0;j<this.map[i].length;j++){
        map += this.map[i][j]+"  ";
      }
      map+="\n";
    }
    return map;
  }
}
