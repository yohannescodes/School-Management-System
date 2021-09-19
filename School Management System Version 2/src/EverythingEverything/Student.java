/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EverythingEverything;

import java.sql.SQLException;


/**
 *
 * @author user
 */
public class Student {
    public String firstName;
    public String middleName;
    public String lastName;
    public String streamID;
    public String id;
    public String grade;
    public String section;
    public String sex;
    public String stream;
    /**
     *
     * @param firstName
     * @param middleName
     * @param lastName
     * @param streamID
     * @param id
     * @param grade
     * @param section
     * @param sex
     * @param dob
     */
   
    public static int registerStudent(Student s1) throws SQLException{
        int result = Database.registerStudent(s1);
        return result;
    }

    public Student(String id, String fName, String mName, String lName, String sex, String grade,   String section, String stream ) {
        
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;
        this.streamID = stream;
        this.id = id;
        this.grade = grade;
        this.section = section;
        this.sex = sex;
        this.stream = stream;
       
    }

    

   

   
   
    
}
