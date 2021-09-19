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
public class Roster {
    public String id;
    public String subID;
    public int ay;
    public int contAssesment1;
    public int contAssesment2; 
    public int mid;
    public int finalX;
    
    public Roster(String id, String subID, int ay, int contAssesment1, int contAssesment2, int mid, int finalX){
        this.id = id;
        this.subID = subID;
        this.ay = ay;
        this.contAssesment1 = contAssesment1;
        this.contAssesment2 = contAssesment2;
        this.mid = mid;
        this.finalX = finalX;
    }
    
    public static String nameShower(String key) throws SQLException{
        String result = Database.showName(key);
        return result;
    }
    public static int addGrade(Roster r1) throws SQLException{
        int result = Database.grader(r1);
        return result;
    }
    public static void showRoster(int grade, char section){
        
    }
}
