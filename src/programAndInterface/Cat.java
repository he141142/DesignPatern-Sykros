package programAndInterface;

public class Cat implements Animal{

  @Override
  public String getName() {
    return "Mi Mi";
  }

  @Override
  public int getAge() {
    return 12;
  }
}
