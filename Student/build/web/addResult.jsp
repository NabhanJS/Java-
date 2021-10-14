<%@page import="student.dao.StudentRDao" %>
<jsp:useBean id="r" class="student.model.StudentR"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<% 
int i =StudentRDao.save(r);

if(i>0){
    response.sendRedirect("success.jsp");

}else{
    response.sendRedirect("error.jsp");


}



%>