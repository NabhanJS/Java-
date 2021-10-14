
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
         <%@page import="webtest4.dao.ResultDao" %>
        <%@page import="webtest4.model.Result" %>
        <%@page import="java.util.*" %>
        
        
        
        <% 
        String id= request.getParameter("id");
        Result r=ResultDao.find(Integer.parseInt(id));  
        %>
          
        
        
         <form action="editForm.jsp" method="post">
             <input type="hidden" name="id" value="<%=r.getId()%>"/>
            <label>Name</label>
            <input type="text" name="name"  value="<%=r.getName()%>"><br><br>
             <label>Email</label>
            <input type="email" name="email"  value="<%=r.getEmail()%>"><br><br>
             <label>Address</label>
             <input type="text" name="address"  value="<%=r.getPassword()%>"><br><br>
             <label>Password</label>
            <input type="password" name="password"  value="<%=r.getAddress()%>"><br><br>
             <label>District</label>
             <select name="district" value="<%=r.getDistrict()%> >
                 <option>--SELECT--</option>
                 <option name="BANGLADESH">BANGLADESH</option>
                 <option name="INDIA">INDIA</option>
                 <option name="PAKISTAN">PAKISTAN</option>
                 <option name="SWEDEN">SWEDEN</option>
             </select><br><br>
            
             <input type="submit" value="Update">      
            
        </form>
        
        
        
        
    </body>
</html>
