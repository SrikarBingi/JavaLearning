package Interfaces;
class Dog implements Pet{

    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }

    @Override
    public void sleep() {
       System.out.println("Dog sleeps"); 
    }

    @Override
    public void play() {
        System.out.println("Dog plays");
    }
    
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();;
        dog.sleep();
        dog.play();

    }
}
