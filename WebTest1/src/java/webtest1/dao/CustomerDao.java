
package webtest1.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import webtest1.model.Customer;
import webtest1.util.DBConnection;

public class CustomerDao {

    public CustomerDao() {
    }
    
    static DBConnection db;
    
    public static int save(Customer value) {
        int status=0;
        String sql="insert into customer (name,email,password,country) values(?,?,?,?)";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getEmail());
            pst.setString(3, value.getPassword());
            pst.setString(4, value.getCountry());
            status= pst.executeUpdate();
            pst.close();
            db.getCon().close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        return status;
    }
    
    
    public static int update(Customer value) throws ClassNotFoundException{
        int status=0;
        String sql="update customer name=?,email=?,password=?,country=? where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getEmail());
            pst.setString(3, value.getPassword());
            pst.setString(4, value.getCountry());
            pst.setInt(5, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return status;
    }
    
   public static int delete(Customer value) throws ClassNotFoundException{
        int status=0;
        String sql="delete from customer where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setInt(5, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    return status;
    }
   
   public static Customer find(int id){
       Customer c=null;
       String sql=" select * from customer where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rst=pst.executeQuery();
            while(rst.next()){
                c=new Customer(
                        
                        rst.getInt("id"),
                        rst.getString("name"),
                        rst.getString("email"),
                        rst.getString("password"),
                        rst.getString("country")
                );
             
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
    return c;
   }
   
   
   public static List<Customer> viewAll(){
       List<Customer> list=new ArrayList<Customer>();
       String sql="select * from Customer";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            ResultSet rst=pst.executeQuery();
            while(rst.next()){
                Customer c=new Customer(
                        rst.getInt("id"),
                        rst.getString("name"),
                        rst.getString("email"),
                        rst.getString("password"),
                        rst.getString("country")
                );
                list.add(c);

            
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   return list;
   }
   
   
   
   
   
   }
   
  
