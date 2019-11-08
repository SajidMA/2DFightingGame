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

/**
 *
 * @author sajidahmed
 */
public class Fighter extends Asset
{
    private Image fighter;
    private Rectangle2D viewRectangle2D;
    
    public Fighter(FightingStage fightingstage)
            {
                viewRectangle2D = new Rectangle2D(0, 0, 50.0, 90.0);
        try 
        {
            fighter = new Image(new FileInputStream("Fighter1.png"));
            this.setImage(fighter);
            this.setViewport(viewRectangle2D);
            fightingstage.getChildren().add(this);
        } catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Fighter.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            }
    
    public void Fight()
    {
        
    }
    
    public void Move()
    {
        
    }
}
