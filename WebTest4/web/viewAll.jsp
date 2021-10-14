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
        
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
        
        <% 
        List<Result> list=ResultDao.viewAll();
        request.setAttribute("list", list);
 
        %>
        
        <table border="1" width="100%">
            
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>EMAIL</th>
                <th>ADDRESS</th>
                <th>PASSWORD</th>
                <th>DISTRICT</th>
                <th>ACTION</th>
            </tr>
            
            <m:forEach items="${list}" var="s">
                <tr>
                    
                    <td>${s.getId()}</td>
                    <td>${s.getName()}</td>
                    <td>${s.getEmail()}</td>
                    <td>${s.getAddress()}</td>
                    <td>${s.getPassword()}</td>
                    <td>${s.getDistrict()}</td>
                    <td>
                       
                        <a href="edit.jsp?id=${s.getId()}">Edit</a>
                        <a href="delete.jsp?id=${s.getId()}">Delete</a>
                     
                    </td>
                   
                </tr>
                
            </m:forEach>
            
            
            
        </table>
         
        
    </body>
</html>
