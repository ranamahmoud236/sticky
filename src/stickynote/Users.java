/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickynote;

/**
 *
 * @author Rana
 */
public class Users {
     private String fname;
    private String lname;

    public Users(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    
    public String users() {
        return "Users{" + "fname=" + fname + ", lname=" + lname + '}';
    }
    
    
    
}
