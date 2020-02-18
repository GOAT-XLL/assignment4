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
public class Ticket {

    String flight;
    int x;
    int y;

    public Ticket(String flight, int x, int y) {
        this.flight = flight;
        this.x = x;
        this.y = y;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
