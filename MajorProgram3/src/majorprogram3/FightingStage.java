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
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

/**
 *
 * @author sajidahmed
 */
public class FightingStage extends Pane
{
    private Image image;
    private BackgroundImage backgroundimage;
    private Background background;
    
    public FightingStage(GameInterface gi)
    {
        this.setPrefHeight(1000);
        this.setPrefWidth(1000);
        try
        {
            image = new Image(new FileInputStream("background.jpg"));
            backgroundimage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
            BackgroundSize.DEFAULT);
            background = new Background(backgroundimage);
            this.setBackground(background);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FightingStage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        gi.setCenter(this);
    }
    
}
