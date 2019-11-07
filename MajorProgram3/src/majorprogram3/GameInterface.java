/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import javafx.scene.layout.BorderPane;

/**
 *
 * @author sajidahmed
 */
public class GameInterface extends BorderPane
{
    private FightingStage fs;
    
    public GameInterface()
    {
        fs = new FightingStage(this);
    }
}
