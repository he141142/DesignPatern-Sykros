package programAndInterface;

import programAndInterface.constants.Constants;

public class Dog  implements Animal{
  private String name;
  private int age;

  private String Location;
  private int weight;

  public Dog(DogBuilder dogBuilder){
     this.age = dogBuilder.Age;
     this.name = dogBuilder.Name;
     this.Location = dogBuilder.location;
     this.weight = dogBuilder.weight;
  }


  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getAge() {
    return this.age;
  }

  public void Bark(){
    System.out.println("Dog Can Bark");
  }

  @Override
  public String toString() {
    return String.format("Information Of Dog:\n"
        + "%20s%20s","Name","");
  }


  public static class DogBuilder {
    private String Name;
    private int Age;

    private String location;
    private int weight;

    public DogBuilder(String name,int age){
          this.Age = age;
          this.Name = name;
    }


    public DogBuilder setWeight(int weight){
      this.weight = weight;
      return this;
    }
    public DogBuilder setLocation(String location){
      this.location = location;
      return this;
    }
    public Dog build(){
      return new Dog(this);
    }
  }


}


