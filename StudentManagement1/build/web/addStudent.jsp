<%@page import="studentmanagement1.model.StudentManagement1"%>
<%@page import="studentmanagement1.dao.StudentManagementDao1" %>
<jsp:useBean id="s" class="studentmanagement1.model.StudentManagement1"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
int i=StudentManagementDao1.save(s);

if(i>0){
     response.sendRedirect("success1.jsp");



}else{
     response.sendRedirect("error.jsp");


}





%>
 





