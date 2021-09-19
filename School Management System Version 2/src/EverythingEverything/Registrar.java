/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EverythingEverything;

import UIUX.Login;
import UIUX.Main2;
import java.sql.*;

/**
 *
 * @author user
 */
public class Registrar {
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
    
    public Registrar(String id, String password){
        setId(id);
        setPassword(password);
    }
    public int register(Registrar r1) throws SQLException{
      int result = Database.signupRegistrar(r1);
    return result;}
   
    
}
