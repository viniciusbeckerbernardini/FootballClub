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
public class BoardDirectors {
    private String departament;
    private String login;
    private String password;

    public BoardDirectors(String departament, String login, String password) {
        this.departament = departament;
        this.login = login;
        this.password = password;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void registerEmployee(){
        
    }
    
    public void fireEmployee(){
        
    }
    
    public void updateEmployee(){
        
    }
    
    public void login(){
        
    }
    
    public void logout(){
        
    }

    @Override
    public String toString() {
        return "BoardDirectors{" + "departament=" + departament + ", login=" + login + ", password=" + password + '}';
    }
    
}
