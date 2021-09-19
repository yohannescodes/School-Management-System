/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EverythingEverything;

import UIUX.Login;
import UIUX.Main1;
import java.sql.SQLException;


/**
 *
 * @author user
 */
public class Teacher {
     private String id;
    private String password;
    
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    
     public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    public Teacher(String id, String password){
        setId(id);
        setPassword(password);
    }
    
    public static int register( Teacher t1) throws SQLException{
        int result = Database.signupTeacher(t1);
        return result;
    }
    
    
    
   
    
    
    
    
}
