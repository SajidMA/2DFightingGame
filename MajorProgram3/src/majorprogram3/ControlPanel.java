/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

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
        
        start = new Button("Start Game");
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
        
        restart.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                GameInterface root = new GameInterface(primaryStage);
                Scene scene = new Scene(root, 1000, 1000);
                ControlPanel ctrlpanel = new ControlPanel();
                HBox hbox = new HBox();
                hbox.getChildren().add(ctrlpanel.getStart());
                hbox.getChildren().add(ctrlpanel.getRestart());
                hbox.getChildren().add(ctrlpanel.getExit());
                root.setBottom(hbox);
                
                File file = new File("Song.mp3");
                Media media = new Media(file.toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
        
                primaryStage.setTitle("Fighting Game");
                primaryStage.setScene(scene);
                primaryStage.show();
            
                root.getFighter().requestFocus();
            }
        });
        
        start.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                GameInterface root = new GameInterface(primaryStage);
                Scene scene = new Scene(root, 1000, 1000);
                ControlPanel ctrlpanel = new ControlPanel();
                HBox hbox = new HBox();
                hbox.getChildren().add(ctrlpanel.getStart());
                hbox.getChildren().add(ctrlpanel.getRestart());
                hbox.getChildren().add(ctrlpanel.getExit());
                root.setBottom(hbox);
                
                File file = new File("Song.mp3");
                Media media = new Media(file.toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
        
                primaryStage.setTitle("Fighting Game");
                primaryStage.setScene(scene);
                primaryStage.show();
            
                root.getFighter().requestFocus();
            }
        });
    }
}