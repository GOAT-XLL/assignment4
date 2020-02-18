/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataitems;

/**
 *
 * @author riverlin
 */
public class Airplane {
    String airplaneName;

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }
    
    @Override
    public String toString(){
        return this.airplaneName;
    }
    
}
