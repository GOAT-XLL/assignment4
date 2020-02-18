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
public class User {

    private String name;
    private String password;
    private String role;

    public User(String name, String password) {
        this.setName(name);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean verify(String username,String password){
        if(password.equals(this.getPassword())&&username.equals(this.getName()))
            return true;
        return false;
    }

}
