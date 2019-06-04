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
public class CLT {
    private float salary;
    private float fgts;
    private float inss;
    private boolean vacations;
    private float irrf;

    public CLT(float salary, float fgts, float inss, boolean vacations, float irrf) {
        this.salary = salary;
        this.fgts = fgts;
        this.inss = inss;
        this.vacations = vacations;
        this.irrf = irrf;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getFgts() {
        return fgts;
    }

    public void setFgts(float fgts) {
        this.fgts = fgts;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public boolean isVacations() {
        return vacations;
    }

    public void setVacations(boolean vacations) {
        this.vacations = vacations;
    }

    public float getIrrf() {
        return irrf;
    }

    public void setIrrf(float irrf) {
        this.irrf = irrf;
    }
    
    public float calculateLiquidSalary(){
        return 0;
    }
    
    public float calculateFGTS(){
        return 0;
    }
    
    public float calculateINSS(){
        return 0;
    }
    public float calculateIRRF(){
        return 0;
    }
    public boolean verifyVacations(){
        return true;
    }

    @Override
    public String toString() {
        return "CLT{" + "salary=" + salary + ", fgts=" + fgts + ", inss=" + inss + ", vacations=" + vacations + ", irrf=" + irrf + '}';
    }
    
    
}
