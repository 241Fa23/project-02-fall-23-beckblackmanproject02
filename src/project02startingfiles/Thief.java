/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s552603
 */
public class Thief extends Player {

    @Override
    public String getSpecialMove() {
        return "Sneak by";
    }

    @Override
    public void useSpecialMove() {
        System.out.print("The Thief sneaks by!");
    }
}
