/*
public interface Drawable {
    void draw();
public class Circle implements Drawable {
    public void draw() {
        System.out.println("Draw Circle");
        }
}

public class MyClass implements Interface1, Interface2, Interface3
 */
public class TestEdible {
    public static void main(String[] args) {
      Object[] objects = {new Tiger(), new Chicken(), new Apple()};
      for (int i = 0; i < objects.length; i++) {
          if (objects[i] instanceof Edible)
              System.out.println((Edible)((Edible) objects[i]).howToEat());
      }
    }
    abstract class Animal {
      public abstract String sound();
    }
    class Chicken extends Animal implements Edible{
      public String sound() {
          return "Chicken: chok";
      }
      public String howToEat() {
          return "Chicken: Fry it";
      }
    }
    class Tiger extends Animal {
        public String sound() {
            return "Tiger: Rooar.";
        }
    }
    abstract class Fruit implements Edible {

    }
    class Apple extends Fruit {
        public String howToEat() {
            return "Apple: bite";
        }
    }
    class Orange extends Fruit {
        public String howToEat() {
            return "Orange: juice";
        }
    }
}

