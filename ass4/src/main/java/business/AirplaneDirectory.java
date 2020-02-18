/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dataitems.Airplane;
import java.util.ArrayList;

/**
 *
 * @author riverlin
 */
public class AirplaneDirectory {
    ArrayList<Airplane>airplanelist = new ArrayList<Airplane>();

    public ArrayList<Airplane> getAirplanelist() {
        return airplanelist;
    }

    public void setAirplanelist(ArrayList<Airplane> airplanelist) {
        this.airplanelist = airplanelist;
    }
    
    public Airplane addAirplane(String airplaneName) {
        Airplane ap = new Airplane();
        this.airplanelist.add(ap);
        ap.setAirplaneName(airplaneName);
        return ap;
    }
    
    public void deleteAirplane(Airplane f){
        airplanelist.remove(f);
        
    }
}
    

