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
public class Employee implements Company {

    private int id;
    private String name;
    private String subname;
    private Date birthDate;
    private int RG;
    private int CPF;
    private Adress adress;

    public Employee(int id, String name, String subname, Date birthDate, int RG, int CPF, Adress adress) {
        this.id = id;
        this.name = name;
        this.subname = subname;
        this.birthDate = birthDate;
        this.RG = RG;
        this.CPF = CPF;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String setCompany(String name, int cnpj, Adress adress, String branch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", subname=" + subname + ", birthDate=" + birthDate + ", RG=" + RG + ", CPF=" + CPF + ", adress=" + adress + '}';
    }

}
