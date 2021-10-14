
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%@page import="webtest1.dao.CustomerDao" %>
       <%@page import="webtest1.model.Customer" %>
       <%@page import="java.util.*" %>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
       <%
         List<Customer> list=CustomerDao.viewAll();
         request.setAttribute("list", list);
       %>
       
       <table border="1" width="50%">
           <tr>
               <th>ID</th>
               <th>NAME</th>
               <th>EMAIL</th>
               <th>PASSWORD</th>
               
               <th>Action</th>
           </tr>
           
           <m:forEach items="${list}" var="s">
               <tr>
                   <td>${s.getId()}</td>
                   <td>${s.getName()}</td>
                   <td>${s.getEmail()}</td>
                   <td>${s.getPassword()}</td>
                   <td>Edit Delete</td>
                   
               </tr>
               
               
               
               
           </m:forEach>
               
      
               
       </table>
       
       
      
        
        
        
        
        
        
        
    </body>
</html>
