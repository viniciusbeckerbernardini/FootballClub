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
public class Outsourced {
    
    private int invoice;

    public Outsourced(int invoice) {
        this.invoice = invoice;
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
