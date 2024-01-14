// Interfaces
// An interface is a completely abstract class that contains only abstract methods.
// Some specifications for interfaces:
// - Defined using the interface keyword.
// - May contain only static final variables.
// - Cannot contain a constructor because interfaces cannot be instantiated.
// - Interfaces can extend other interfaces.
// - A class can implement any number of interfaces.

// Interfaces have the following properties:
// - An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
// - Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
// - Methods in an interface are implicitly public.


// You love all animals, and have a dog and a cat as pets.
// The program you are given defines an abstract class Animal, and has Dog & Cat classes inherited from it.
// Implement the Swimmer and Player interface and override their methods swim() and play(), so that the given method calls output the following messages:
// swim():
// Dog => "Dog is swimming"
// Cat => "Cat is swimming"
// play():
// Dog => "Dog is playing"
// Cat => "Cat is playing"

// You can implement multiple interfaces - by writing their names alternately separated by commas.
// Implement the Swimmer and Player interfaces only for Animal class, then override the swim() and play() methods in inherited classes.

package soloLearn.java.practice;

public class ex6_interfaces {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.swim();
        dog.play();
        cat.swim();
        cat.play();
    }
}

interface Swimmer {
    void swim();
}

interface Player {
    void play();
}

abstract class Animal implements Swimmer, Player {
    @Override
    public void swim() {
        System.out.println("Animal is swimming");
    }

    @Override
    public void play() {
        System.out.println("Animal is playing");
    }
}

class Dog extends Animal {
    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal {
    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
