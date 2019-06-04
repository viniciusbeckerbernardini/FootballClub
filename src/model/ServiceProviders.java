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
public class ServiceProviders {
    private String function;
    private int workLoad;
    private float unhealthy;

    public ServiceProviders(String function, int workLoad, float unhealthy) {
        this.function = function;
        this.workLoad = workLoad;
        this.unhealthy = unhealthy;
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

    public float getUnhealthy() {
        return unhealthy;
    }

    public void setUnhealthy(float unhealthy) {
        this.unhealthy = unhealthy;
    }

    @Override
    public String toString() {
        return "ServiceProviders{" + "function=" + function + ", workLoad=" + workLoad + ", unhealthy=" + unhealthy + '}';
    }
    
    
}
