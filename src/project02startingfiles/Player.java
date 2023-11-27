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

    private int health;
    private int score;

    public Player() {
        this.health = 10;
        this.score = 0;
    }

    public abstract String getSpecialMove();

    public abstract void useSpecialMove();

    public int getHealth() {
        return health;
    }

    public void sethealth(int health) {
        this.health = health;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public abstract String toString();
}
