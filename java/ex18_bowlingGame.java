// Bowling Game
// You are creating a bowling game!
// The given code declares a Bowling class with its constructor and addPlayer() method.
// Each player of the game has a name and points, and are stored in the players HashMap.
// The code in main takes 3 players data as input and adds them to the game.
// You need to add a getWinner() method to the class, which calculates and outputs the name of the player with the maximum points.

// Sample Input:
// Dave 42
// Amy 103
// Rob 64

// Sample Output:
// Amy

// You need to iterate through the HashMap to find the element with the maximum points and output its corresponding key.

package soloLearn.java;

import java.util.*;

public class ex18_bowlingGame {
    public static void main(String[] args) {
        Bowling bowlingGame = createBowlingGame();

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");
                String name = values[0];
                int points = Integer.parseInt(values[1]);
                bowlingGame.addPlayer(name, points);
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String winner = bowlingGame.getWinner(); // calc the winner
        System.out.println(winner); // output the winner 
    }

    public static Bowling createBowlingGame() {
        Bowling game = new Bowling();
        return game;
    }
}

class Bowling {
    private HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public String getWinner() {
        String winnerName = "";
        int maxPoints = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            String name = entry.getKey();
            int points = entry.getValue();

            if (points > maxPoints) {
                maxPoints = points;
                winnerName = name;
            }
        }

        return winnerName; // return the name of the player with the maximum points
    }
}
