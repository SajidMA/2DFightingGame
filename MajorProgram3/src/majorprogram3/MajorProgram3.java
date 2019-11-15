/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author sajidahmed
 */
public class MajorProgram3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        GameInterface root = new GameInterface();  
        Scene scene = new Scene(root, 1000, 1000);
        ControlPanel ctrlpanel = new ControlPanel();
        HBox hbox = new HBox();
        hbox.getChildren().add(ctrlpanel.getStart());
        hbox.getChildren().add(ctrlpanel.getRestart());
        hbox.getChildren().add(ctrlpanel.getExit());
        root.setBottom(hbox);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
