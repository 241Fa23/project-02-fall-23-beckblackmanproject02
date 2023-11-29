/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s552603
 */
public class RandomGen {

    private static final java.util.Random rand = new java.util.Random();

    public static boolean Event(double prob) {
        return rand.nextDouble() <= prob;

    }

    public static String RandomFoe(String[] foes) {
        return foes[rand.nextInt(foes.length)];
    }

    public static String Scene(String[] scenes) {
        return scenes[rand.nextInt(scenes.length)];
    }
}
