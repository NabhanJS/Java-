<%@page import="webtest4.dao.ResultDao" %>
<jsp:useBean id="r" class="webtest4.model.Result"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<% 
int i=ResultDao.update(r);
if(i>0){
    response.sendRedirect("success.jsp");


}else{

    response.sendRedirect("error.jsp");
}



%>