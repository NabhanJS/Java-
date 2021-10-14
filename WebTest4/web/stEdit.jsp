
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
         <%@page import="webtest4.dao.StudentDao" %>
        <%@page import="webtest4.model.Student" %>
        <%@page import="java.util.*" %>
        
        
        
        <% 
        String id= request.getParameter("id");
        Student s=StudentDao.find(Integer.parseInt(id));
        %>
      
        
        
         <form action="stEditform.jsp" method="post">
             <input type="hidden" name="id" value="<%=s.getId()%>"/>
            <label>Name</label>
            <input type="text" name="name"  value="<%=s.getName()%>"><br><br>
             <label>Email</label>
            <input type="email" name="email"  value="<%=s.getEmail()%>"><br><br>
             <label>Age</label>
             <input type="text" name="age"  value="<%=s.getAge()%>"><br><br>
             <label>Subject</label>
             <select name="subject" value="<%=s.getSubject()%> >
                 <option>--SELECT--</option>
                 <option name="bangla">Bangla</option>
                 <option name="math">Math</option>
                 <option name="english">English</option>
                 <option name="swedish">Swedish</option>
             </select><br><br>
             <label>Gender</label>
             <input type="radio" name="gender">Male
             <input type="radio" name="gender" >Female
             <input type="radio" name="gender">Others
            
             <input type="submit" value="Update">      
            
        </form>
        
        
        
        
    </body>
</html>
