/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Users;

/**
 *
 * @author riverlin
 */
public class Admin extends User{
    
    
    public  Admin(String name,String password){
        super(name,password);
        this.setRole("Admin");
        
    }
}
