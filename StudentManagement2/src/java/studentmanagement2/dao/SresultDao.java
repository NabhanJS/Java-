
package studentmanagement2.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentmanagement2.model.Sresult;
import studentmanagement2.util.DBConnection;


public class SresultDao {

    public SresultDao() {
    }
    
    static DBConnection db;
    
    public static int save(Sresult value){
        int status=0;
        String sql="insert into sresult (rollnumber, enggphysics1, enggchemistry, enggmathematics1, basicelectricalengg, electronicengg, enggchemistrylab, enggphysicslab) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getRollnumber());
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
            Logger.getLogger(SresultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SresultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    return status;
    }
    
    public static List<Sresult> viewAll(){
        List<Sresult> list= new ArrayList<Sresult>();
        String sql="select * from sresult";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Sresult s= new Sresult(
                        rs.getString("rollnumber"),
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
            Logger.getLogger(SresultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SresultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return list;
    }
    
    
    
    
    
    
}
