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
public interface Company {  
    public void setCompany(String name, int cnpj, Adress adress, String branch);
    public String getCompany();
}