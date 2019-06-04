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
public class ServiceProviders extends Outsourced {

    private String function;
    private int workLoad;
    private double unhealthy;
    private double payment;

    public ServiceProviders(int id, String name, String subname, Date birthDate, int RG, int CPF, Adress adress, String companyName, int cnpj, Adress companyAdress, String branch, Date dateStart, int contractNumber, int invoice, String function, int workLoad, float unhealthy) {
        super(id, name, subname, birthDate, RG, CPF, adress, companyName, cnpj, companyAdress, branch, dateStart, contractNumber, invoice);
        this.setFunction(function);
        this.setWorkLoad(workLoad);
        this.setUnhealthy(unhealthy);
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    public double getUnhealthy() {
        return unhealthy;
    }

    public void setUnhealthy(float unhealthy) {
        this.unhealthy = unhealthy;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public double calculateUnhealthy() {
        if (this.getUnhealthy() == 1) {
            return this.getPayment() * 0.1;
        } else if (this.getUnhealthy() == 2) {
            return this.getPayment() * 0.15;
        } else if (this.getUnhealthy() == 3) {
            return this.getPayment() * 0.2;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nFunção: " + this.getFunction()
                + "\nCarga horária: " + this.getWorkLoad()
                + "\n Pagamento: " + this.getPayment()
                + "\nInsalubridade: " + this.getUnhealthy();
    }

}
