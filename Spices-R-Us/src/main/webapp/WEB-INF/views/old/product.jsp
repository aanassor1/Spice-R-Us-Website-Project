<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="UTF-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <!-- <link rel="stylesheet" href="<c:url value='/css/index.css' />" /> -->

      <!-- Google Fonts -->
      <link rel="preconnect" href="https://fonts.googleapis.com" />
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
      <link
        href="https://fonts.googleapis.com/css2?family=Barlow+Condensed:wght@400;700&family=Bellefair&family=Barlow:wght@400;700&display=swap"
        rel="stylesheet" />

      <%@ page contentType="text/html; charset=UTF-8" %>

        <title>Spices-R-Us | Product</title>
    </head>

    <body>
      <c:choose>
        <c:when test="${discounted == false}">
          <h2>£
            <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${product.getPrice()}" />
            <h2>
        </c:when>
        <c:otherwise>
          <h2>£
            <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${product.getPrice()}" />
            £
            <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2"
              value="${product.getDiscountPrice()}" />
            <h2>
        </c:otherwise>
      </c:choose>
      <h2>${product.getWeight()}g</h2>
      <div id="quantity-container">
        <a href="/addToBasket?id=${product.getId()}&level=none">${product.getWeight()}g</a>
        <a href="/addToBasket?id=${product.getId()}&level=low">${product.getWeight()*2}g</a>
        <a href="/addToBasket?id=${product.getId()}&level=mid">${product.getWeight()*4}g</a>
        <a href="/addToBasket?id=${product.getId()}&level=high">${product.getWeight()*8}g</a>
      </div>
      <p>${product.getDescription()}</p>
      <img src="${product.getImage()}" alt="${product.getName()}" />
    </body>

    </html>