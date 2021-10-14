
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
         <%@page import="webtest8.dao.TeacherDao" %>
        <%@page import="webtest8.model.Teacher" %>
        <%@page import="java.util.*" %>
        
        
        
        <% 
        String id= request.getParameter("id");
        Teacher t=TeacherDao.find(Integer.parseInt(id));  
        %>
          
        <form action="editForm.jsp" method="post"> 
            
          <table width="30%" bgcolor="lightbrown" border="1">
              
               <input type="hidden" name="id" value="<%=t.getId()%>"/>
               
                <tr>
                    <td>Name</td>
                    <td>:</td>
                    <td>  <input type="text" name="name"  value="<%=t.getName()%>"></td>
                </tr>
                
                 <tr>
                    <td>Email</td>
                    <td>:</td>
                    <td><input type="email" name="email"  value="<%=t.getEmail()%>"></td>
                </tr>
                
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="text" name="password"  value="<%=t.getPassword()%>"></td>
                </tr>
                
                <tr>
                    <td>Gender</td>
                    <td>:</td>
                    <td>
                       Male<input type="radio" name="gender"  value="gender">
                       Female<input type="radio" name="gender"  value="gender">
                       Others<input type="radio" name="gender"  value="gender">
                    </td>
                </tr>
                
                 <tr>
                    <td>Subject</td>
                    <td>:</td>
                    <td>
                        <select name="subject" value="<%=t.getSubject()%>">
                            <option name="subject">Subject</option>
                            <option name="bangla">Bangla</option>
                            <option name="english">English</option>
                            <option name="swedish">Swedish</option>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td> <input type="submit" value="Update"></td>
                </tr>
             
            
            </table>
            
          </form>
           
       
    </body>
</html>


