/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentm.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static studentm.dao.StudentMDao.db;
import studentm.model.StudentM;
import studentm.model.StudentR;
import studentm.util.DBConnection;

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
        
        String sql="insert into studentr (rollnumber, enggphysics1, enggchemistry, enggmathematics1, basicelectricalengg, electronicengg, enggchemistrylab, enggphysicslab) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, value.getRollnumber());
            ps.setString(2, value.getEnggphysics1());
            ps.setString(3, value.getEnggchemistry());
            ps.setString(4, value.getEnggmathematics1());
            ps.setString(5, value.getBasicelectricalengg());
            ps.setString(6, value.getElectronicengg());
            ps.setString(7, value.getEnggchemistrylab());
            ps.setString(8, value.getEnggphysicslab());
            
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
        String sql="select * from studentr";
        try {
            PreparedStatement ps1=db.getCon().prepareStatement(sql);
            ResultSet rs=ps1.executeQuery();
            while(rs.next()){
                StudentR s=new StudentR(
                        rs.getInt("rollnumber"),
                        rs.getString("enggphysics1"),
                        rs.getString("enggchemistry"),
                        rs.getString("enggmathematics1"),
                        rs.getString("basicelectricalengg"),
                        rs.getString("electronicengg"),
                        rs.getString("enggchemistrylab"),
                        rs.getString("enggphysicslab")
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
