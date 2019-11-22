/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author sajidahmed
 */
public class FightingMechanics extends GridPane
{
    private GameInterface gameInterface;
    private FightingStage fightingStage;
    private Rectangle playerHealth;
    private Rectangle cpuHealth;
    private Label timer;
    private int timerValue;
    private Label playerName;
    private Label cpuName;
    
    public FightingMechanics()
    {
        this.gameInterface = null;
        this.fightingStage = null;
        this.playerHealth = new Rectangle(100, 50);
        this.cpuHealth = new Rectangle(100, 50);
        this.timer = new Label("30");
        this.timerValue = 30;
        this.playerName = new Label("Sajid");
        this.cpuName = new Label("Enemy");
        this.add(playerHealth, 1, 0);
        this.add(cpuHealth, 10, 0);
        this.add(timer, 5, 0);
        this.add(playerName, 1, 2);
        this.add(cpuName, 10, 2);
        playerHealth.setFill(Color.BLUE);
        cpuHealth.setFill(Color.RED);
        playerHealth.setFocusTraversable(false);
        cpuHealth.setFocusTraversable(false);
        timer.setFocusTraversable(false);
        playerName.setFocusTraversable(false);
        cpuName.setFocusTraversable(false);
    }
    
    
    
    /**
     * @return the gameInterface
     */
    public GameInterface getGameInterface() {
        return gameInterface;
    }

    /**
     * @param gameInterface the gameInterface to set
     */
    public void setGameInterface(GameInterface gameInterface) {
        this.gameInterface = gameInterface;
    }

    /**
     * @return the fightingStage
     */
    public FightingStage getFightingStage() {
        return fightingStage;
    }

    /**
     * @param fightingStage the fightingStage to set
     */
    public void setFightingStage(FightingStage fightingStage) {
        this.fightingStage = fightingStage;
    }

    /**
     * @return the playerHealth
     */
    public Rectangle getPlayerHealth() {
        return playerHealth;
    }

    /**
     * @param playerHealth the playerHealth to set
     */
    public void setPlayerHealth(Rectangle playerHealth) {
        this.playerHealth = playerHealth;
    }

    /**
     * @return the cpuHealth
     */
    public Rectangle getCpuHealth() {
        return cpuHealth;
    }

    /**
     * @param cpuHealth the cpuHealth to set
     */
    public void setCpuHealth(Rectangle cpuHealth) {
        this.cpuHealth = cpuHealth;
    }

    /**
     * @return the timer
     */
    public Label getTimer() {
        return timer;
    }

    /**
     * @param timer the timer to set
     */
    public void setTimer(Label timer) {
        this.timer = timer;
    }

    /**
     * @return the timerValue
     */
    public int getTimerValue() {
        return timerValue;
    }

    /**
     * @param timerValue the timerValue to set
     */
    public void setTimerValue(int timerValue) {
        this.timerValue = timerValue;
    }

    /**
     * @return the playerName
     */
    public Label getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(Label playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the cpuName
     */
    public Label getCpuName() {
        return cpuName;
    }

    /**
     * @param cpuName the cpuName to set
     */
    public void setCpuName(Label cpuName) {
        this.cpuName = cpuName;
    }
    
}
