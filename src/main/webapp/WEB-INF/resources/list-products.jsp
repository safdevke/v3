
<html>
<%@ page import="import model.Product;" %>
<form action = "/v1/listproducts" method = "post">
<% for (Product product:${productlist}) { %>
    <p><%=product.getProductName()%></p>
<% } %>
</form>
</html>