/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram3;

import javafx.scene.image.ImageView;

/**
 *
 * @author sajidahmed
 */
public abstract class Asset extends ImageView implements Animation
{
    private double speed;
    private double direction;
    private double power;
    private double parentWidth;
    private double parentHeight;
    
    public Asset()
    {
        speed = 0.0;
        direction = 0.0;
        power = 0.0;
        parentWidth = 0.0;
        parentHeight = 0.0;
    }
    
    public Asset(double s, double d, double p, double pw, double ph)
    {
        speed = s;
        direction = d;
        power = p;
        parentWidth = pw;
        parentHeight = ph;
    }
    
    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public double getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(double direction) {
        this.direction = direction;
    }

    /**
     * @return the power
     */
    public double getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(double power) {
        this.power = power;
    }

    /**
     * @return the parentWidth
     */
    public double getParentWidth() {
        return parentWidth;
    }

    /**
     * @param parentWidth the parentWidth to set
     */
    public void setParentWidth(double parentWidth) {
        this.parentWidth = parentWidth;
    }

    /**
     * @return the parentHeight
     */
    public double getParentHeight() {
        return parentHeight;
    }

    /**
     * @param parentHeight the parentHeight to set
     */
    public void setParentHeight(double parentHeight) {
        this.parentHeight = parentHeight;
    }
    
    @Override
    public void move()
    {
        double newX = this.getX() + getSpeed() * Math.cos(Math.toRadians(getDirection()) );
     
        this.setX( newX );
    }
    
}
