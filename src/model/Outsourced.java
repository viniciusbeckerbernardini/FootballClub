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
public class Outsourced  extends Contract{
    
    private int invoice;

    public Outsourced(int id, String name, String subname, Date birthDate, int RG, int CPF, Adress adress, String companyName, int cnpj, Adress companyAdress, String branch, Date dateStart, int contractNumber, int invoice) {
        super(id, name, subname, birthDate, RG, CPF, adress, companyName, cnpj, companyAdress, branch, dateStart, contractNumber);
        this.setInvoice(invoice);
    }   


    
    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Outsourced{" + "invoice=" + invoice + '}';
    }
    
    
    
}
