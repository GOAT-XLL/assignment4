/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataitems;

import business.AirplaneDirectory;
import business.FlightDirectory;
import java.util.ArrayList;

/**
 *
 * @author riverlin
 */
public class Airliner {
    private String companyname;
    
    private FlightDirectory flightlist;
    
    private AirplaneDirectory airplaneDirectory;
    
    public Airliner(String companyName){
        this.companyname = companyName;
        this.flightlist = new FlightDirectory();
        this.airplaneDirectory = new AirplaneDirectory();
    }

    public FlightDirectory getFlightDirectory() {
        return flightlist;
    }

    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }
    
    

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
    
    @Override
    public String toString(){
        return this.companyname;
    }

    
    
    
}
