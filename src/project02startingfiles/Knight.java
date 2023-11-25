/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s552603
 */
public class Knight extends Player {

    @Override
    public String getSpecialMove() {
        return "Slash with Sword";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The knight slashes with their sword!");
    }

    @Override
    public String toString() {
        return "Knight status:\nHealth: " + getHealth() + "\nScore:" + getScore()
                + "\nThe knight's speical move is 'Slash with sword'";
    }

}
