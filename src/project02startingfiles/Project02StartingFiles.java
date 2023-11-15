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

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");
        System.out.println();
        System.out.println("Choose a character...");
        System.out.print("{k}Knight || {h}Healer || {w}Wizard || {t}Thief\n>>");
        Knight knight1 = new Knight();
        Healer healer1 = new Healer();
        Thief thief1 = new Thief();
        Wizard wizard1 = new Wizard();

        String choice = input.next();
        switch (choice) {
            case "w":
                System.out.println("Welcome, Wizard!");
            case "h":
                System.out.println("Welcome, Healer!");
            case "k":
                System.out.println("Welcome, Knight!");
            case "t":
                System.out.println("Welcome, Thief!");

        }

        System.out.println();
        System.out.println("What would you like to do?");
        System.out.print("{?} Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit\n>>");
        String choiceDirection = input.next();

        String[] scenes = {"Nothing here...", "Nice trees around here...", "Interesting cottage here...", "Potty break..."};
        String[] attacks = {"zombie", "bandit", "lobbyist"};
        String attacked = ("Oh no! You are being attacked by a bandit!\nHow would you like to handle this\n{s}Special Move || {r}Run!");
        String choice2 = input.next();

        int randomEvent = rand.nextInt(scenes.length);
        System.out.println("**********************");
        System.out.println(scenes[randomEvent]);
        System.out.println("**********************");
        int randomAttack = rand.nextInt(attacks.length);
        System.out.println(attacked);
        System.out.println(attacks[randomAttack]);
    }

}
