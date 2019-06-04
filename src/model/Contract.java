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
public class Contract extends Employee {

    private Date dateStart;
    private int contractNumber;

    public Contract(int id, String name, String subname, Date birthDate, int RG, int CPF, Adress adress, String companyName, int cnpj, Adress companyAdress, String branch, Date dateStart, int contractNumber) {
        super(id, name, subname, birthDate, RG, CPF, adress, companyName, cnpj, companyAdress, branch);
        this.setDateStart(dateStart);
        this.setContractNumber(contractNumber);
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nData de início: " + this.getDateStart()
                + "\nNúmero de contrato: " + this.getContractNumber();
    }

}
