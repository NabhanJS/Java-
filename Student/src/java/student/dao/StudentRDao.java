/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import student.model.StudentR;
import student.util.DBConnection;

/**
 *
 * @author nabha
 */
public class StudentRDao {

    public StudentRDao() {
    }
    
    static DBConnection db;
    
    public static int save(StudentR value){
        int status=0;
        
        String sql="insert into str (rollnumber, enggphysics1, enggchemistry, enggmathematics1, basicelectricalengg, electronicengg, enggchemistrylab, enggphysicslab) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, value.getRollnumber());
            ps.setInt(2, value.getEnggphysics1());
            ps.setInt(3, value.getEnggchemistry());
            ps.setInt(4, value.getEnggmathematics1());
            ps.setInt(5, value.getBasicelectricalengg());
            ps.setInt(6, value.getElectronicengg());
            ps.setInt(7, value.getEnggchemistrylab());
            ps.setInt(8, value.getEnggphysicslab());
            
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentRDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentRDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    return status;
    }
    
     public static List<StudentR> viewAll(){
        List<StudentR> list=new ArrayList<>();
        String sql="select * from str";
        try {
            PreparedStatement ps1=db.getCon().prepareStatement(sql);
            ResultSet rs=ps1.executeQuery();
            while(rs.next()){
                StudentR s=new StudentR(
                        rs.getInt("rollnumber"),
                        rs.getInt("enggphysics1"),
                        rs.getInt("enggchemistry"),
                        rs.getInt("enggmathematics1"),
                        rs.getInt("basicelectricalengg"),
                        rs.getInt("electronicengg"),
                        rs.getInt("enggchemistrylab"),
                        rs.getInt("enggphysicslab")
                );
                      
                list.add(s);
         
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentR.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    return list;
    }
    
    
}
