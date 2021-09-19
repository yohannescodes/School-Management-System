/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EverythingEverything;
import UIUX.Login;
import UIUX.Main2;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Database {
    
    static Connection conn;
    static String host = "jdbc:mysql://localhost:3306/SMDB";
    static String username = "root";
    static String password = "ePi1623Crown!";
    static PreparedStatement stmt;
    static PreparedStatement stmt1;
    static PreparedStatement stmt2;
    static ResultSet rs;
    static Statement stm;
   
    /**
     *
     * @param r1
     * @param l1
     */
   
    public Database() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(host, username, password);
    }
    
    public static int signupRegistrar(Registrar r1) throws SQLException{
        String query = "INSERT INTO Registrar(RegistrarID, psswrd) VALUES(?, ?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, r1.getId());
        stmt.setString(2, r1.getPassword());
        int result = stmt.executeUpdate();
        return result;
    }
    
    public static int signupTeacher(Teacher t1) throws SQLException{
        String query = "INSERT INTO Teacher(TID, psswrd) VALUES(?, ?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, t1.getId());
        stmt.setString(2, t1.getPassword());
        int result = stmt.executeUpdate();
        return result;
    }
    
    
  
    
   
    public static int registerStudent(Student s1) throws SQLException{
     String query = "INSERT INTO Student VALUES(?,?,?,?,?,?,?,?)";
        stmt = conn.prepareStatement(query); 
        stmt.setString(1, s1.id);
        stmt.setString(2, s1.firstName);
        stmt.setString(3, s1.middleName);
        stmt.setString(4, s1.lastName);
        stmt.setString(5, s1.sex);
        stmt.setString(6, s1.grade);
        stmt.setString(7, s1.section);
        stmt.setString(8, s1.streamID);
       
    int result = stmt.executeUpdate();
    return result;
    }
    
    
     
    
    public static String showName(String keyword) throws SQLException{
    String name = "";  
    String query = "SELECT FirstName, MiddleName, LastName FROM Student WHERE StudentID LIKE \"%" + keyword + "%\"";
    stmt = conn.prepareStatement(query);
    rs = stmt.executeQuery();
    while(rs.next()){
    name = rs.getString(1) +" " + rs.getString(2) +" " + rs.getString(3);
     
    }
        return name;
   }
   
    
    @SuppressWarnings("empty-statement")
    public static int grader(EverythingEverything.Roster r1) throws SQLException{
         
        String query = "INSERT INTO Roster VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, r1.id);
        stmt.setString(2, r1.subID);
        stmt.setInt(3, r1.ay);
        stmt.setInt(4, r1.contAssesment1);
        stmt.setInt(5, r1.contAssesment2);
        stmt.setInt(6, r1.mid);
        stmt.setInt(7, r1.finalX);
        stmt.setInt(8, r1.contAssesment1+r1.contAssesment2+r1.mid+r1.finalX);
        int result = stmt.executeUpdate();
        return result;
        }
    
  
    
}
