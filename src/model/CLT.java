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
public class CLT extends Contract {

    private double salary;
    private double fgts;

    public CLT(int id, String name, String subname, Date birthDate, int RG, int CPF, Adress adress, String companyName, int cnpj, Adress companyAdress, String branch, Date dateStart, int contractNumber, double salary) {
        super(id, name, subname, birthDate, RG, CPF, adress, companyName, cnpj, companyAdress, branch, dateStart, contractNumber);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateLiquidSalary() {
        return this.getSalary() - this.calculateINSS();
    }

    public double calculateFGTS() {
        return this.getSalary() * 0.08;
    }

    public double calculateINSS() {
        if (this.getSalary() <= 1693.72) {
            return this.getSalary() * 0.08;
        } else if (this.getSalary() > 1693.72 && this.getSalary() <= 2822.90) {
            return this.getSalary() * 0.09;
        } else {
            return this.getSalary() * 0.11;
        }
    }


    @Override
    public String toString() {
        return super.toString()
                + "\n Saláro bruto: " + this.getSalary()
                + "\n Salário liquido" + this.calculateLiquidSalary()
                + "\n FGTS: " + this.calculateFGTS()
                + "\n INSS: " + this.calculateINSS();
    }
}
