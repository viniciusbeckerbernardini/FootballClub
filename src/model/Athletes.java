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
public class Athletes extends CLT {

    private String position;
    private boolean positionOwner;
    private boolean injury;

    public Athletes(int id, String name, String subname, Date birthDate, int RG, int CPF, Adress adress, String companyName, int cnpj, Adress companyAdress, String branch, Date dateStart, int contractNumber, double salary, String position, boolean positionOwner, boolean injury) {
        super(id, name, subname, birthDate, RG, CPF, adress, companyName, cnpj, companyAdress, branch, dateStart, contractNumber, salary);
        this.setPosition(position);
        this.setPositionOwner(positionOwner);
        this.setInjury(injury);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String isPositionOwner() {
        if (this.positionOwner == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void setPositionOwner(boolean positionOwner) {
        this.positionOwner = positionOwner;
    }

    public String isInjured() {
        if (this.injury == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void setInjury(boolean lesion) {
        this.injury = lesion;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPosição: " + this.getPosition()
                + "\nÉ titular: " + this.isPositionOwner()
                + "\nEstá lesionado? " + this.isInjured();
    }

}
