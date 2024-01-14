// Abstraction
// Data abstraction provides the outside world with only essential information, in a process of representing essential features without including implementation details.
// A good real-world example is a book. When you hear the term book, you don't know the exact specifics, such as the page count, the color, or the size, but you understand the idea, or abstraction, of a book.
// The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.

// In Java, abstraction is achieved using abstract classes and interfaces.
// An abstract class is defined using the abstract keyword.
// - If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).
// - To use an abstract class, you have to inherit it from another class.
// - Any class that contains an abstract method should be defined as abstract.

// Abstract Classes
// A board game company creates new board games every year. While all the games have different rules, they also are all similar in that they each have a name and a play() method.
// We need to create 3 different games - Monopoly, Chess and Battleships. In the play() method Monopoly should print “Buy all property.”, Battleships - “Sink all ships.”, and Chess - “Kill the enemy king.”
// Complete the code by implementing the getName() and play() methods inherited from abstract Game class.

// To give a name to games just return the name string inside the getName() function.

package soloLearn.java.practice;

public class ex5_abstract {
    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();
        
        System.out.println(monopoly.getName());
        monopoly.play();
        
        System.out.println(chess.getName());
        chess.play();
        
        System.out.println(battleships.getName());
        battleships.play();
    }
 }
 
 abstract class Game {
    abstract String getName();
    abstract void play();
 }
 
 class Monopoly extends Game {
 
    // give "Monopoly" name to game
    String getName() {
        return "Monopoly";
    }
 
    // play method should print "Buy all property."
    void play() {
        System.out.println("Buy all property.");
    }
 }
 
 class Chess extends Game {
 
    // give "Chess" name to game
    String getName() {
        return "Chess";
    }
 
    // play method should print "Kill the enemy king."
    void play() {
        System.out.println("Kill the enemy king.");
    }
 }
 
 class Battleships extends Game {
 
    // give "Battleships" name to game
    String getName() {
        return "Battleships";
    }
 
    // play method should print "Sink all ships."
    void play() {
        System.out.println("Sink all ships.");
    }
 }
 