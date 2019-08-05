/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickynote;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Yousef
 */
public class Users {
    
    private ArrayList<User> users;

    public Users() throws IOException {
        File f = new File("users.txt");
        if(!f.exists())
            f.createNewFile();
        FileReader users = new FileReader("users.txt");
        users.readA
    }

    public void addUser(User user) {
        
    }
    
}
