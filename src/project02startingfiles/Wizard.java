/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s552603
 */
public class Wizard extends Player {

    public String specialMove = "Cast a Spell";

    public Wizard() {

    }

    @Override
    public String getSpecialMove() {
        return specialMove;
    }

    @Override
    public void useSpecialMove() {
        System.out.print("The Wizard casts a spell!");
    }

}
