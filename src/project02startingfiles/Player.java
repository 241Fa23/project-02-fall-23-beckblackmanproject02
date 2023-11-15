/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s552603
 */
public abstract class Player {

    private int Health = 10;
    private int score = 10;

    public abstract String getSpecialMove();

    public abstract void useSpecialMove();

}
