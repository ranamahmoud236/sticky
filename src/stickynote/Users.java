/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickynote;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rana
 */
public class Users {
    private static ArrayList<User> users;

    public Users() throws IOException {
        users = new ArrayList<>();
        
        File file = new File("users.txt");
        if(!file.exists())
            file.createNewFile();
        
        try(FileReader f = new FileReader(file)) {
            StringBuffer sb = new StringBuffer();
            while (f.ready()) {
                char c = (char) f.read();
                if (c == '\n') {
                    User user = new User(sb.toString());
                    users.add(user);
                    sb = new StringBuffer();
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                User user = new User(sb.toString());
                users.add(user);
            }
        }
    }
    
    public static void addNewUser(User newUser) throws IOException {
        File file = new File("users.txt");
        try (FileWriter fr = new FileWriter(file, true)) {
            fr.write(newUser.getFullName() + "\n");
        }
    }
    
    public static boolean isUserExists(User user) {
        boolean found = false;
        for (User u : users) {
            if(u.getFirstName().equals(user.getFirstName()) && u.getLastName().equals(user.getLastName())) {
                found = true;
                break;
            }
        }
        return found;
    }
}
