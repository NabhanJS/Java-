<%@page import="studentManagement.dao.ResultDao" %>
<jsp:useBean id="r" class="studentManagement.model.Result"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<% 
int i=ResultDao.save(r);

if(i>0){
    response.sendRedirect("success1.jsp");


}else{
    response.sendRedirect("error.jsp");


}




%>