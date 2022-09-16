import Patterns.ObserverPattern.StartObserver;
import Patterns.StrategyPattern.process;
import java.util.Observer;
import programAndInterface.Dog;

public class mainClass {

  public static void main(String[] args) {
//     class X{
//        int x=0;
//    }
//    class Y{
//       X xy;
//       public Y(X xi){
//            this.xy =xi;
//       }
//       public void setX(){
//         this.xy.x = 1;
//       }
//    }
//
//    X x = new X();
//    Y y = new Y(x);
//    System.out.println(y.xy.x);
//
//    x.x = 10;
//    System.out.println(y.xy.x);
//    y.setX();

//    System.out.println(x.x);


//    process p = new process();
//    p.startDeveloping();
//    StartObserver startObserver = new StartObserver();
//    startObserver.StartDevelopment();
    new StartObserver().StartDevelopment();
  }
}
