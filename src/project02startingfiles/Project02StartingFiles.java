////
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// //
package project02startingfiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Project02StartingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");
        System.out.println("Choose a character...");
        System.out.print("{k}Knight || {h}Healer || {w}Wizard || {t}Thief\n>>");

        char choice = input.next().charAt(0);
        Player player;

        switch (choice) {
            case 'w':
                player = new Wizard();
                break;
            case 'h':
                player = new Healer();
                break;
            case 'k':
                player = new Knight();
                break;
            case 't':
                player = new Thief();
                break;

            default:
                System.out.println("Invalid choice. Going to exit.");
                return;

        }
        System.out.printf("Welcome, %s!%n", player.getClass().getSimpleName());
        while (player.getHealth() > 0) {
            System.out.println("What would you like to do?");
            System.out.print("{?} Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit\n>>");

            char choiceDirection = input.next().charAt(0);
            switch (choiceDirection) {
                case '?':
                    System.out.println(player.toString());
                    break;
                case 'n':
                case 's':
                case 'e':
                case 'w':
                    move(player);
                    break;
                case 'q':
                    end(player);
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }

    private static void move(Player player) {
        if (RandomGen.Event(0.2)) {

            String[] attacks = {"zombie", "bandit", "lobbyist"};
            String attack = RandomGen.RandomFoe(attacks);
            System.out.printf("Oh no! You are being attacked by a %s!%n", attack);
            System.out.println("How would you like to handle this?");
            System.out.println("{s} Special Move || {r}Run!");

            char action = new Scanner(System.in).next().charAt(0);

            switch (action) {
                case 's':
                    player.useSpecialMove();
                    Battle(player);
                    break;
                case 'r':
                    if (RandomGen.Event(0.5)) {
                        System.out.println("You successfully run away!");
                        player.setScore(player.getScore() + 1);
                    } else {
                        System.out.println("You failed to run away!");
                        Battle(player);
                    }
                    break;
                default:
                    System.out.println("Invalid Choice. Try again.");
                    break;
            }
        } else {
            String[] scenes = {"Nothing here...", "Nice trees around here...",
                "Intresting cottage there...", "Potty break..."};
            String scene = RandomGen.Scene(scenes);
            System.out.println(scene);
            player.setScore(player.getScore() + 1);
        }
    }

    private static void Battle(Player player) {
        System.out.println("Type any letter than ENTER to continue...");
        new Scanner(System.in).next();

        if (RandomGen.Event(0.6)) {
            System.out.println("***************************************");
            System.out.println("***************************************");
            System.out.println("Player wins! Increases score by 2 points!");
            player.setScore(player.getScore() + 2);
        } else {
            System.out.println("***************************************");
            System.out.println("***************************************");
            System.out.println("Player loses! Deducting 1 health point.");
            player.sethealth(player.getHealth() - 1);
        }
        System.out.println(player.toString());
    }

    private static void end(Player player) {
        System.out.println("***************************************");
        System.out.println("***************************************");
        System.out.println("The game has come to an end. Your final stats:");
        System.out.println(player.toString());
        System.out.println("Thanks for playing!");
    }
}
