// Creating & Writing Files
// You want to plan your day and create your to do list.
// Complete the program to take the names of 3 tasks as input and write them down in the file "tasks.txt", each on a new line.
// Then use the readFile() method to output the tasks.

// Sample Code
// Workout
// Report
// Pool

// Sample Output
// Workout
// Report
// Pool

// Add \n to the end of each line to create a new line.

package soloLearn.java.practice;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ex17_readingWritingFiles {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            try {
                FileWriter writer = new FileWriter("tasks.txt"); // create a FileWriter 
                int count = 0;
                while (count < 3) {
                    System.out.print("Enter a task: ");
                    String task = input.nextLine();
                    writer.write(task + "\n"); // write the task to the file with a newline character
                    count++;
                }
                writer.close(); // close the FileWriter
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine()); // use nextLine() to read each line
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
