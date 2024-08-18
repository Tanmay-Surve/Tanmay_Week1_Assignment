abstract class Animal {
 abstract void sound();
}
// Interface
interface Playable {
 void play();
}
class Dog extends Animal implements Playable {
 @Override
 void sound() {
 System.out.println("Dog barks: Woof!");
 }
 @Override
 public void play() {
 System.out.println("Dog plays fetch.");
 }
}
class Cat extends Animal implements Playable {
 @Override
 void sound() {
 System.out.println("Cat meows: Meow!");
 }
 @Override
 public void play() {
 System.out.println("Cat chases a laser pointer.");
 }
}
public class Main {
 public static void main(String[] args) {
 Animal dog = new Dog();
 Animal cat = new Cat();
 dog.sound();
 cat.sound();
 Playable playableDog = (Playable) dog;
 Playable playableCat = (Playable) cat;
 playableDog.play();
 playableCat.play();
 }
}
