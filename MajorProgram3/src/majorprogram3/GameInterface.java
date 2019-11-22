/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author sajidahmed
 */
public class GameInterface extends BorderPane
{
    private FightingStage fs;
    private Fighter fighter1;
    private Fighter fighter2;
    private Animation animation;
    private gameInterfaceHandler gih;
    private AT at;
    private AT2 at2;
    private FightingMechanics fm;
    
    public GameInterface()
    {
        Rectangle2D viewRectangle2D = new Rectangle2D(100.0, 40.0, 50.0, 95.0);
        fs = new FightingStage(this);
        fighter1 = new Fighter(fs);
        fighter2 = new Fighter(fs);
        try {
            Image i = new Image(new FileInputStream("Fighter2.png"));
            fighter2.setImage(i);
            fighter2.setViewport(viewRectangle2D);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        fighter1.setX(400);
        fighter1.setY(600);
        fighter2.setX(600);
        fighter2.setY(600);
        fighter1.setSpeed(10);
        fighter2.setSpeed(10);
        gih = new gameInterfaceHandler();
        fighter1.setOnKeyPressed(gih);
        at = new AT();
        at.start();
        at2 = new AT2();
        at2.start();
        fm = new FightingMechanics();
        this.setTop(fm);
    }
    
    public Fighter getFighter()
    {
        return fighter1;
    }
    private class gameInterfaceHandler implements EventHandler<KeyEvent>
    {
        @Override
        public void handle(KeyEvent event)
        {
            switch(event.getCode())
            {
                case LEFT:
                    fighter1.setDirection(180);
                    fighter1.move();
                    break;
                case RIGHT:
                    fighter1.setDirection(0);
                    fighter1.move();
                    break;
                case SPACE:
                    fighter1.Fight();
                    break;
            }
        }
    }
    
    private class AT extends AnimationTimer
    {
        Rectangle2D rd = new Rectangle2D(0, 0, 50.0, 90.0);
        long at = 0;
        @Override
        public void handle(long now) 
        {
           if (at == 0)
           {
               at = now;
           }
           else if ((int)(now - at)/1e9 > 1)
           {
               fighter1.setViewport(rd);
           }
        }
    }
    
    private class AT2 extends AnimationTimer
    {
        long at2 = 0;
        
        @Override
        public void handle(long now) 
        {
            if (at2 == 0)
            {
                at2 = now;
            }
            else if ((int)(now - at2)/1e9 > 1)
           {
               int var = (int) Math.round(Math.random());
               if (var <= 0)
               {
                   fighter2.setDirection(180);
                   fighter2.move();
               }
               else
               {
                   fighter2.setDirection(0);
                   fighter2.move();
               }
               at2 = now;
           }
           
        }
    }
}