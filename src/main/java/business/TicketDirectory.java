/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


import dataitems.Ticket;
import java.util.ArrayList;

/**
 *
 * @author riverlin
 */
public class TicketDirectory {
    ArrayList<Ticket>ticketlist=new ArrayList<Ticket>();
    
    public Ticket addTicket(String flight,int x,int y){
        Ticket t = new Ticket(flight,x,y);
        this.ticketlist.add(t);
        return t;
        
    }

    public ArrayList<Ticket> getTicketlist() {
        return ticketlist;
    }
    
    public void deleteTicket(String flight,int x,int y){
        for(Ticket t : this.ticketlist){
            if(t.getFlight().equalsIgnoreCase(flight)&&t.getX()==x&&t.getY()==y){
                this.ticketlist.remove(t);
            }
        }
    }
}
