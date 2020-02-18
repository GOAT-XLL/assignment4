/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import dataitems.Flight;
import java.util.ArrayList;

/**
 *
 * @author riverlin
 */
public class FlightDirectory {
    ArrayList<Flight>flightlist = new ArrayList<Flight>();

    public ArrayList<Flight> getFlightlist() {
        return flightlist;
    }

    public void setFlightlist(ArrayList<Flight> flightlist) {
        this.flightlist = flightlist;
    }
    
    public Flight addFlight() {
        Flight a = new Flight();
        this.flightlist.add(a);
        return a;
    }
    
    public void deleteFlight(Flight f){
        flightlist.remove(f);
        
    }
}
