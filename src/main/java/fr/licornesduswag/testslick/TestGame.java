/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.licornesduswag.testslick;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Romain Porte (MicroJoe) microjoe at mailoo.org
 */
public class TestGame extends BasicGame {

    public TestGame() {
        super("test game");
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {
        
    }

    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException {
        
    }

    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new TestGame());
            app.setDisplayMode(600, 400, false);
            app.start();
        } catch (SlickException ex) {
            Logger.getLogger(TestGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
