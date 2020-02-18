/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Users.Admin;
import business.Users.Customer;
import business.Users.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author riverlin
 */
public class UserDirectory {

    private List<User> userlist;

    public User addAdminUser(String name, String password) {
        User a = new Admin(name, password);
        this.userlist.add(a);
        return a;
    }

    public User addCustomer(String name, String password) {
        User c = new Customer(name, password);
        this.userlist.add(c);
        return c;
    }

    public ArrayList<Customer> getCustomerlist() {
        ArrayList<Customer> CustomerDirectory = new ArrayList<>();
        for (User u : this.userlist) {
            if (u.getRole().equals("Customer")) {
                CustomerDirectory.add((Customer) u);

            }
        }
        return CustomerDirectory;

    }

    public UserDirectory() {
        userlist = new ArrayList<>();

    }

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }
}
