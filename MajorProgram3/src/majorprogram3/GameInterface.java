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
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
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
    
    public GameInterface()
    {
        Rectangle2D viewRectangle2D = new Rectangle2D(100.0, 40.0, 50.0, 90.0);
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
    }
}
