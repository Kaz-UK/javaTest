package rps;

import java.util.Random;

public class Game {
    private Random randomChoice = new Random();

    public String playGame(Options user) {
        int num = this.randomChoice.nextInt(3);
        Options computer = null;
        if (num == 1) {
            computer = Options.ROCK;
        } else if (num == 2) {
            computer = Options.PAPER;
        } else {
            computer = Options.SCISSORS;
        }
        String result = "";

        System.out.println("You chose: " + user);
        System.out.println("Computer chose: " + computer);

        if (user.equals(Options.PAPER)) {
            if (computer.equals(Options.SCISSORS)) {
                result = "You lose, scissors cuts paper";
            } else if (computer.equals(Options.ROCK)) {
                result = "You win, paper covers rock";
            } else {
                result = "It's a draw";
            }

        } else if (user.equals(Options.ROCK)) {
            if (computer.equals(Options.SCISSORS)) {
                result = "You win, rock crushes scissors";
            } else if (computer.equals(Options.PAPER)) {
                result = "You lose, paper covers rock";
            } else {
                result = "It's a draw";
            }

        } else if (user.equals(Options.SCISSORS)) {
            if (computer.equals(Options.ROCK)) {
                result = "You lose, rock crushes scissors";
            } else if (computer.equals(Options.PAPER)) {
                result = "You win, scissors cuts rock";
            } else {
                result = "It's a draw";
            }

        }

        return result;
    }


}