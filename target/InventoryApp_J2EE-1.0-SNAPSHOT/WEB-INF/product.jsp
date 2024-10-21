<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="custom" uri="http://hitesh/custom-tags" %>

<!DOCTYPE html>
<html>
<head>
    <title>Inventory Page</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.0/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Current Date and Time: 
        <fmt:formatDate value="<%= new java.util.Date() %>" pattern="MMMM dd, yyyy, hh:mm a" />
    </h2>
    <h2>Inventory</h2>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="product" items="${productList}">
                <tr>
                    <td>${product.productId}</td>
                    <td>${product.productName}</td>
                    <td>${product.quantity}</td>
                    <td>${product.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

   <footer>
        <custom:copyright year="2024" name="Hitesh" />
    </footer>
</div>
</body>
</html>
