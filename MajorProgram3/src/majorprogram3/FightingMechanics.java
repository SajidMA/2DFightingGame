/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import javafx.geometry.Insets;
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
    private int cpuHealth2;
    private int playerHealth2;
    
    public FightingMechanics()
    {
        this.gameInterface = null;
        this.fightingStage = null;
        this.playerHealth = new Rectangle(400, 50);
        this.cpuHealth = new Rectangle(400, 50);
        cpuHealth2 = 400;
        playerHealth2 = 400;
        this.timer = new Label("30");
        this.timerValue = 30;
        this.playerName = new Label("Sajid");
        this.cpuName = new Label("Enemy");
        this.setPadding(new Insets(5, 10, 5, 10));
        this.setHgap(10);
        this.setVgap(5);
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
    
    /**
     * @return the cpuHealth2
     */
    public int getCpuHealth2() {
        return cpuHealth2;
    }

    /**
     * @param cpuHealth2 the cpuHealth2 to set
     */
    public void setCpuHealth2(int cpuHealth2) {
        this.cpuHealth2 = cpuHealth2;
        cpuHealth.setWidth(cpuHealth2);
    }

    /**
     * @return the playerHealth2
     */
    public int getPlayerHealth2() {
        return playerHealth2;
    }

    /**
     * @param playerHealth2 the playerHealth2 to set
     */
    public void setPlayerHealth2(int playerHealth2) {
        this.playerHealth2 = playerHealth2;
        playerHealth.setWidth(playerHealth2);
    }
    
    public void decreaseTime()
    {
        timerValue--;
        timer.setText("" + timerValue);
    }
    
    public boolean gameOver()
    {
        if(timerValue <= 0 || playerHealth.getWidth() <= 0 || cpuHealth.getWidth() <= 0)
        {
            timer.setText("GAME OVER");
            playerHealth.setFocusTraversable(true);
            cpuHealth.setFocusTraversable(true);
            timer.setFocusTraversable(true);
            playerName.setFocusTraversable(true);
            cpuName.setFocusTraversable(true);
            return true;
        }
        return false;
    }
}