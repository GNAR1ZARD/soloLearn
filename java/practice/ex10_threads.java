// Threads
// We are writing a registration program for our app. At first it should welcome the users, then ask the users to enter their names.
// But program you are given executes this sequence in reverse order.
// Complete the program by extending the Thread class for Welcome and Name classes, then setting priorities for their run methods so that the program outputs the messages in the correct order.

// Use setPriority(number) method on the objects - obj.setPriority(number). The higher the number, the higher the priority.

package soloLearn.java.practice;

public class ex10_threads {
    class Main {
        public static void main(String[] args) {
            Name name = new Name();
            Welcome welcome = new Welcome();
    
            synchronized (welcome) {
                welcome.start();
                try {
                    welcome.wait(); // Wait for 'Name' to complete before proceeding
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    
            name.start();
        }
    }
    
    class Welcome extends Thread {
        public void run() {
            System.out.println("Welcome!");
            synchronized (this) {
                this.notify(); // Notify 'Main' that 'Welcome' has completed
            }
        }
    }
    
    class Name extends Thread {
        public void run() {
            System.out.println("Please enter your name");
        }
    }
}    