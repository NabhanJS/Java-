
package student.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import student.model.StudentM;
import student.util.DBConnection;

/**
 *
 * @author nabha
 */
public class StudentMDao {

    public StudentMDao() {
    }
    
    static DBConnection db;
    
    public static int save(StudentM value){
        int status=0;
        String sql="insert into stm (coursename, branchname, rollnumber, name, fathername, gender) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getCoursename());
            ps.setString(2, value.getBranchname());
            ps.setInt(3, value.getRollnumber());
            ps.setString(4, value.getName());
            ps.setString(5, value.getFathername());
            ps.setString(6, value.getGender());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentMDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentMDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    return status;
    }
    
    public static List<StudentM> viewAll(){
        List<StudentM> list=new ArrayList<>();
        String sql="select * from stm";
        try {
            PreparedStatement ps1=db.getCon().prepareStatement(sql);
            ResultSet rs=ps1.executeQuery();
            while(rs.next()){
                StudentM s=new StudentM(
                        rs.getString("coursename"),
                        rs.getString("branchname"),
                        rs.getInt("rollnumber"),
                        rs.getString("name"),
                        rs.getString("fathername"),
                        rs.getString("gender")
                );
                list.add(s);
         
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentMDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentMDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    return list;
    }
    
}
