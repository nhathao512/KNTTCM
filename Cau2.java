public class Cau2{
  public static void main(String[] args){
    Duck duck = new Duck(1, "male", "yellow");
    Fish fish = new Fish(1, "male", 2, true);
    Zebra zebra = new Zebra(5, "male", true);
    
    System.out.println(duck.toString());
    duck.swim();
    duck.quack();
    duck.mate();
    System.out.println(fish.toString());
    fish.swim();
    fish.mate();
    System.out.println(zebra.toString());
    zebra.run();
    zebra.mate();
    
    
    Animal[] animals = {duck, fish, zebra};
    for(Animal animal : animals){
      System.out.println(animal.getClass().getSimpleName() +  "is Mammal: " + animal.isMammal());
    }
  }
}