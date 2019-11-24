/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author sajidahmed
 */
public class ControlPanel extends HBox
{

    /**
     * @return the start
     */
    public Button getStart() {
        return start;
    }

    /**
     * @return the restart
     */
    public Button getRestart() {
        return restart;
    }

    /**
     * @return the exit
     */
    public Button getExit() {
        return exit;
    }
    
    private Button start;
    private Button restart;
    private Button exit;
    
    public ControlPanel()
    {
         
        this.start = new Button("Start Game");
        this.restart = new Button("Restart Game");
        this.exit = new Button("Exit Game");
        exit.setFocusTraversable(false);
        start.setFocusTraversable(false);
        restart.setFocusTraversable(false);
        
        exit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
    }
}