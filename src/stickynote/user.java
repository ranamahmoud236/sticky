/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickynote;

import java.util.ArrayList;

/**
 *
 * @author Rana
 */
public class user {
    private String fname;
    private String lname;
     private ArrayList <Users> a;

    public user(String fname, String lname, ArrayList<Users> a) {
        this.fname = fname;
        this.lname = lname;
        this.a = a;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    

    public ArrayList<Users> getA() {
        return a;
    }

    
    public String fullname() {
        for (int i =0 ; i<a.size() ;i++ ) 
        { a.get(i).users() ;}
        
        return "user{" + "fname=" + fname + ", lname=" + lname + ", a=" + a + '}';
    }

     
     
     
    
}
