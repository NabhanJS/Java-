
package studentmanagement1.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentmanagement1.model.StudentManagement1;
import studentmanagement1.util.DBConnection;

public class StudentManagementDao1 {

    public StudentManagementDao1() {
    }
    
    static DBConnection db;
    
    public static int save(StudentManagement1 value){
        int status=0;
       String sql="insert into studentmanagement1 (courseName,branchName,rollNumber,name,fatherName,gender) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getCourseName());
            ps.setString(2, value.getBranchName());
            ps.setString(3, value.getRollNumber());
            ps.setString(4, value.getName());
            ps.setString(5, value.getFatherName());
            ps.setString(6, value.getGender());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManagement1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManagement1.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    return status;
    }
    
    
}
