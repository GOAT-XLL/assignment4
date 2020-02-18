/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Users;

import business.TicketDirectory;
import dataitems.Ticket;
import java.util.ArrayList;

/**
 *
 * @author riverlin
 */
public class Customer extends User {

    private TicketDirectory ticketdirectory = new TicketDirectory();

    public TicketDirectory getticketdirectory() {
        return ticketdirectory;
    }

    public Customer(String name, String password) {
        super(name, password);
        this.setRole("Customer");

    }

}
