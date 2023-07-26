<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.4/jspdf.min.js"></script>

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

    <link rel="stylesheet" href="<c:url value='/css/index.css' />" />


    <%@ page contentType="text/html; charset=UTF-8" %>

      <title>Spices-R-Us | ${recipe.getName()}</title>
  </head>

  <div class = "instructions">
  <div id="htmlContent">
  <body  style = "background-color:  #ffffe6;">
    <h1><b>${recipe.getName()}</b></h1>
    <div id="do-not-include-in-pdf">
    <p>${recipe.getDescription()}</p><br>
    </div>
    <div id="do-not-include-in-pdf">
    <h2>Spice Level: ${recipe.getSpicyLevel()}/5</h2><br>
      <div class = "recipe-image">
        <img src="${recipe.getImage()}" align="right" alt="${recipe.getName()}" width="600" height="600"/>
      </div>
    </div>
    <div id="do-not-include-in-pdf">
    <h2>The spices used in this recipe include:</h2>
    <p>${recipe.getSpiceDescription()}</p><br><br>
    </div>
    <h3>Ingredients:</h3>
    <c:forEach items="${recipe.getIngredients()}" var="i">
      <p>${i}</p>
    </c:forEach>
    <br>
    <h3>Instructions:</h3>
    <c:forEach items="${recipe.getInstructions()}" var="i">
      <p>${i}</p>
    </c:forEach>
    <br><br><br>
  </div>
      <div class = back-button>
      <a class = "back" href="/recipe">Back</a>
      <!-- </div> -->
    <button id="generatePDF">generate PDF</button>
      </div>
    <script type="text/javascript">
      $('#generatePDF').click(function () {
          var pdf = new jsPDF('p', 'pt', 'letter');
          source = $('#htmlContent')[0];

          specialElementHandlers = {
              '#do-not-include-in-pdf': function (element, renderer) {
                  return true
              }
          };
          margins = {
              top: 80,
              bottom: 60,
              left: 40,
              width: 522
          };
          pdf.fromHTML(
              source, // HTML string or DOM elem ref.
              margins.left, // x coord
              margins.top, { // y coord
                  'width': margins.width, // max width of content on PDF
                  'elementHandlers': specialElementHandlers
              },

              function (dispose) {
                  // dispose: object with X, Y of the last line add to the PDF 
                  //          this allow the insertion of new lines after html
                  pdf.save('${recipe.getName()}.pdf');
              }, margins
          );

      });
      </script>
      
    </body>
  </div>
</html>