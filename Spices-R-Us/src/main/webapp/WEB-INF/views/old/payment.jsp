<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<c:url value='/css/index.css' />" />

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Barlow+Condensed:wght@400;700&family=Bellefair&family=Barlow:wght@400;700&display=swap"
      rel="stylesheet"
    />

    <%@ page contentType="text/html; charset=UTF-8" %>

    <title>Spices-R-Us | Payment</title>
    
    <!--Temporary styling-->
    <style>
      .orderInfo {
        position: absolute;
        top: 10%;
        bottom: 10%;
        left: 5%;
        width: 50%;
        padding: 30px;
        overflow-y: scroll;
        border: 1px solid black;
      }
      .payment {
        position:absolute;
        left: 66%;
        top:25%;
        width:fit-content;
        padding: 30px;
        text-align: center;
        border: 1px solid black;
      }
      .each-product {
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0px 4px 4px 0px rgba(0, 0, 0, 0.25);
      }
      .orderHeader {
        position: absolute;
        text-decoration: underline;
        padding: 10px;
        bottom: 90%;
        left: 5%;
      }
      img {
        height: 150px;
        width: 150px;
      }
    </style>
  </head>
  <body>
    <div class="payment">
      <form:form action="/paymentForm" modelAttribute="payment" method="POST">
      <h1>Card Details</h1>

      <form:label path="cardNumber">Card Number</form:label>
      <form:input path="cardNumber" /><br>
      <form:errors path="cardNumber" /><br>

      <form:label path="expDate"> Card Expiry Date</form:label>
      <form:input path="expDate" /><br>
      <form:errors path="expDate" /><br>

      <form:label path="CVV">Card CVV</form:label>
      <form:input path="CVV" /><br>
      <form:errors path="CVV" /><br>
      
      <form:label path="firstName">Cardholder's First Name</form:label>
      <form:input path="firstName" /><br>

      <form:label path="lastName">Cardholder's Last Name</form:label>
      <form:input path="lastName" /><br>

      <h1>Address Details</h1>

      <form:label path="addressL1">Address Line 1</form:label>
      <form:input path="addressL1" /><br>
      <form:errors path="addressL1" /><br>

      <form:label path="addressL2">Address Line 2</form:label>
      <form:input path="addressL2" /><br>

      <form:label path="city">City</form:label>
      <form:input path="city" /><br>
      <form:errors path="city" /><br>

      <form:label path="county">County</form:label>
      <form:input path="county" /><br>
      <form:errors path="county" /><br>

      <form:label path="postcode">Postcode</form:label>
      <form:input path="postcode" /><br>
      <form:errors path="postcode" /><br>

      <input type="submit"/>

      </form:form>
    </div>
    <div class="orderHeader">
      <h1>Order information:</h1>
    </div>
    <div class="orderInfo">
      <c:forEach items="${basketProducts}" var="product">
        <div class="each-product">
          <h2>${product.getProduct().getName()}</h2>
          <img src="${product.getProduct().getImage()}">
          <p>${product.getInitialBasketWeight()} g</p>
          <p>Quantity: ${product.getQuantity()}</p>
          <p>£ ${product.getProduct().getDiscountPrice()*product.getQuantity()}</p>
        </div>
      </c:forEach>
    </div>
  </body>