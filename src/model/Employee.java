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
public abstract class Employee implements Company {

    private int id;
    private String company;
    private String name;
    private String subname;
    private Date birthDate;
    private int RG;
    private int CPF;
    private Adress adress;

    public Employee(int id, String name, String subname, Date birthDate, int RG, int CPF, Adress adress, String companyName, int cnpj, Adress companyAdress, String branch) {
        this.setId(id);
        this.setName(name);
        this.setSubname(subname);
        this.setBirthDate(birthDate);
        this.setRG(RG);
        this.setCPF(CPF);
        this.setAdress(adress);
        this.setCompany(companyName, cnpj, companyAdress, branch);
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
    public String getCompany() {
        return this.company;
    }

    @Override
    public void setCompany(String name, int cnpj, Adress adress, String branch) {
        this.company = "\nNome da empresa: " + name
                + "\nCNPJ: " + cnpj
                + "\nEndereço:" + adress
                + "\nRamo: " + branch;
    }

    @Override
    public String toString() {
        return "\nFuncionário: " + this.getName() + " " + this.getSubname()
                + "ID do funcionário" +this.getId()
                + "\nData de nascimento: " + this.getBirthDate()
                + "\nRG: " + this.getRG()
                + "\nCPF: " + this.getCPF()
                + "\nEndereço: " + this.getAdress()
                + "\nCompanhia: "+this.getCompany();
    }

}
