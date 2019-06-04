/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vini
 */
public class Athletes {
    private String position;
    private boolean positionOwner;
    private boolean injury;

    public Athletes(String position, boolean positionOwner, boolean injury) {
        this.position = position;
        this.positionOwner = positionOwner;
        this.injury = injury;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isPositionOwner() {
        return positionOwner;
    }

    public void setPositionOwner(boolean positionOwner) {
        this.positionOwner = positionOwner;
    }

    public boolean isLesion() {
        return injury;
    }

    public void setLesion(boolean lesion) {
        this.injury = lesion;
    }
    
    public boolean isInjured(){
        return false;
    }
    
    private boolean goToReservation(){
        return false;
    }

    @Override
    public String toString() {
        return "Athletes{" + "position=" + position + ", positionOwner=" + positionOwner + ", injury=" + injury + '}';
    }
    
    
}
