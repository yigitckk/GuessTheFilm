/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessthefilm;

import java.io.FileNotFoundException;

/**
 *
 * @author YiğitÇELİK
 */
public class GuessTheFilm {

    public static void main(String[] args) throws FileNotFoundException {
        Game game = new Game();
        game.writeFilms();
    }
}
