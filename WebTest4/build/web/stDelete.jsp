
<%@page import="webtest4.dao.StudentDao" %>
<jsp:useBean id="s" class="webtest4.model.Student"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
int i=StudentDao.delete(s);

if(i>0){
    response.sendRedirect("stSuccess.jsp");


}else{

    response.sendRedirect("stError.jsp");
}



%>