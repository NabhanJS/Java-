
package studentManagement.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static studentManagement.dao.StudentManagementDao.db;
import studentManagement.model.Result;
import studentManagement.model.StudentManagement;
import studentManagement.util.DBConnection;


public class ResultDao {

    public ResultDao() {
    }
    
    
    static DBConnection db;
    
    
    public static int save(Result value){
        int status=0;
        String sql="insert into result (rollNumber, enggPhysics1, enggChemistry, enggMathematics1, basicElectricalEngg, electronicEngg, enggChemistryLab, enggPhysicsLab) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, value.getId());
            ps.setString(2, value.getEnggPhysics1());
            ps.setString(3, value.getEnggChemistry());
            ps.setString(4, value.getEnggMathematics1());
            ps.setString(5, value.getBasicElectricalEngg());
            ps.setString(6, value.getElectronicEngg());
            ps.setString(7, value.getEnggChemistryLab());
            ps.setString(8, value.getEnggPhysicsLab());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    return status;
    }
    
    
     public static List<Result> viewAll(){
         List<Result> list=new ArrayList<Result>();
         String sql="select * from result";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Result t=new Result(
                    rs.getInt("id"),
                    rs.getString("rollNumber"),
                    rs.getString("enggPhysics1"),
                    rs.getString("enggChemistry"), 
                    rs.getString("enggMathematics1"),
                    rs.getString("basicElectricalEngg"),
                    rs.getString("electronicEngg"),
                    rs.getString("enggChemistryLab"),
                    rs.getString("enggPhysicsLab")
  
            );
                    
                    
            list.add(t);
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManagementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     return list;
     }
    
    
    
}
