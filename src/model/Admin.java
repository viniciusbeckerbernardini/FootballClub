/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vini
 */
public class Admin {

    private ArrayList<Athletes> athletesList;
    private ArrayList<TechnicalCommittee> technicalCommitteeList;
    private ArrayList<BoardDirectors> boardDirectorsList;
    private ArrayList<ServiceProviders> serviceProvidersList;

    //Athletes
    public ArrayList<Athletes> getAthletesList() {
        return athletesList;
    }
    public void setAthletesList(ArrayList<Athletes> list) {
        this.athletesList = list;
    }
    public void registerAthlete(Athletes a){
        this.athletesList.add(a);
    }
    
    
    //Technical Commitee
    public void setTechnicalCommitteeList(ArrayList<TechnicalCommittee> list) {
        this.technicalCommitteeList = list;
    }
    public ArrayList<TechnicalCommittee> getTechnicalCommitteeList() {
        return technicalCommitteeList;
    }
    public void registerTechnicalComittee(TechnicalCommittee t){
        this.technicalCommitteeList.add(t);
    }
    
    // Board of Directors
    public ArrayList<BoardDirectors> getBoardDirectorsList() {
        return boardDirectorsList;
    }
    public void setBoardDirectorsList(ArrayList<BoardDirectors> list) {
        this.boardDirectorsList = list;
    }
    public void registerBoardDirector(BoardDirectors b){
        this.boardDirectorsList.add(b);
    }
    
    //Service Providers
    public ArrayList<ServiceProviders> getServiceProvidersList() {
        return serviceProvidersList;
    }
    public void setServiceProvidersList(ArrayList<ServiceProviders> list) {
        this.serviceProvidersList = list;
    }
    public void registerServiceProvider(ServiceProviders s){
        this.serviceProvidersList.add(s);
    }
}
