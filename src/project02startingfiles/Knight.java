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

    public String Knight;

    public String specialMove = "Slash with Sword";

    public Knight() {

    }

    public String setKnight() {
        return Knight;
    }

    @Override
    public String getSpecialMove() {
        return specialMove;
    }

    @Override
    public void useSpecialMove() {
        System.out.print("The Knight slashes his sword!");
    }

}
