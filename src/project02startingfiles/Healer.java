/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s552603
 */
public class Healer extends Player {

    public String specialMove = "Use Sleeping Powder";

    public Healer() {

    }

    @Override
    public String getSpecialMove() {
        return specialMove;
    }

    @Override
    public void useSpecialMove() {
        System.out.print("The Healer uses Sleeping Powder!");
    }

}
