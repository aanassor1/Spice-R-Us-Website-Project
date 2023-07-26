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
        rel="stylesheet" />

      <%@ page contentType="text/html; charset=UTF-8" %>

        <title>Spices-R-Us | Payment</title>
    </head>

    <body>
      <header class="primary-header bg-d-orange">
        <div class="flex nav-bar bg-d-orange container" style="--container-gap: 100rem">
          <div class="logo">
            <a href="/" class="uppercase text-l-yellow letter-spacing-2 fs-400">
              <span class="fs-500">S</span>pices
              <span class="fs-500">R</span> <span class="fs-500">U</span>s
            </a>
          </div>
          <!-- <button class="mobile-nav-toggle" aria-controls="primary-navigation">
              <span class="sr-only" aria-expanded="false">Menu</span>
          </button> -->
          <nav>
            <ul id="primary-navigation" class="primary-navigation inverse-on-hover flex bg-d-orange" style="
        --bg-clr: var(--clr-white);
        --text-clr: var(--clr-d-orange);
        --gap: 0;
      ">
              <li class="bg-d-orange">
                <a class="uppercase text-white letter-spacing-2" href="/">Home</a>
              </li>
              <li class="bg-d-orange">
                <a class="uppercase text-white letter-spacing-2" href="shop">Shop</a>
              </li>
              <li class="bg-d-orange">
                <a class="uppercase text-white letter-spacing-2" href="recipe">Recipes</a>
              </li>
              <li class="bg-d-orange">
                <a class="uppercase text-white letter-spacing-2" href="#">Forum</a>
              </li>
              <li class="bg-d-orange">
                <a class="uppercase text-white letter-spacing-2" href="account">Account</a>
              </li>
            </ul>
          </nav>
          <div class="basket">
            <a href="/basket">
              <svg width="51" height="51" viewBox="0 0 51 51" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path
                  d="M18.8838 45.3334C20.6442 45.3334 22.0713 43.9063 22.0713 42.1459C22.0713 40.3855 20.6442 38.9584 18.8838 38.9584C17.1234 38.9584 15.6963 40.3855 15.6963 42.1459C15.6963 43.9063 17.1234 45.3334 18.8838 45.3334Z"
                  fill="#F4F4F4" />
                <path
                  d="M38.25 45.3334C40.0104 45.3334 41.4375 43.9063 41.4375 42.1459C41.4375 40.3855 40.0104 38.9584 38.25 38.9584C36.4896 38.9584 35.0625 40.3855 35.0625 42.1459C35.0625 43.9063 36.4896 45.3334 38.25 45.3334Z"
                  fill="#F4F4F4" />
                <path
                  d="M46.8635 7.60752C46.7317 7.44501 46.5655 7.31372 46.3769 7.22309C46.1883 7.13246 45.9819 7.08474 45.7727 7.08336H16.2777L17.1985 9.91669H43.9169L40.1344 26.9167H18.8844L12.4102 6.41752C12.3402 6.20001 12.2186 6.00266 12.0557 5.84231C11.8929 5.68197 11.6937 5.56339 11.4752 5.49669L5.66685 3.71169C5.48826 3.65681 5.3006 3.63764 5.11459 3.65528C4.92859 3.67293 4.74788 3.72703 4.58278 3.81451C4.24936 3.99119 3.99978 4.29308 3.88894 4.65377C3.7781 5.01447 3.81509 5.40442 3.99176 5.73784C4.16843 6.07127 4.47033 6.32085 4.83102 6.43169L9.91685 7.99002L16.4194 28.5317L14.096 30.43L13.9119 30.6142C13.3372 31.2765 13.0114 32.1184 12.9907 32.995C12.97 33.8717 13.2557 34.728 13.7985 35.4167C14.1846 35.8863 14.6753 36.2589 15.2313 36.5049C15.7872 36.7509 16.393 36.8634 17.0002 36.8334H40.6444C41.0201 36.8334 41.3804 36.6841 41.6461 36.4184C41.9118 36.1527 42.061 35.7924 42.061 35.4167C42.061 35.041 41.9118 34.6806 41.6461 34.415C41.3804 34.1493 41.0201 34 40.6444 34H16.7735C16.6104 33.9944 16.4514 33.9469 16.3121 33.862C16.1727 33.777 16.0575 33.6576 15.9778 33.5152C15.898 33.3728 15.8563 33.2122 15.8568 33.0489C15.8572 32.8857 15.8997 32.7254 15.9802 32.5834L19.3944 29.75H41.2677C41.5952 29.758 41.9153 29.6523 42.1736 29.4508C42.4319 29.2494 42.6124 28.9646 42.6844 28.645L47.1752 8.81169C47.2183 8.60049 47.2126 8.38224 47.1586 8.17357C47.1046 7.9649 47.0037 7.7713 46.8635 7.60752Z"
                  fill="#F4F4F4" />
              </svg>

            </a>
          </div>
        </div>
      </header>

      <div class="container" style="--container-gap: 100rem;">

        <div class="basket-heading">
          <h1 class="fs-600 text-black">You're almost there...!</h1>
        </div>

        <div class="basket-checkout-container grid" style="--gap: 2rem; margin-top: 6rem;">
          <form:form id="paymentForm" action="/paymentForm" modelAttribute="payment" method="POST">
            <form:errors id="main-error" class="error" path="error"/>
            <div class="collapsible-container">


              <div class="collapsible bg-white collapsible-grid-container basket-grid-header">
                <h2 class="collapsible-number fs-500 column-2 center-vertically center-horizontally">1</h2>
                <h2 class="fs-500 text-black column-4 center-vertically">Delivery Address</h2>
                <div class="column-5 align-right">
                  <span class="fs-700 text-black iconify" data-icon="ep:arrow-down"></span>
                </div>
              </div>
              <div id="delivery-address" class="collapsible-content bg-white grid">

                <div class="flex column-2 collapsible-content-input">
                  <form:label path="addressL1" class="fs-400">Address Line 1</form:label>
                  <form:input path="addressL1" class="fs-500" />
                  <form:errors class="error" path="addressL1" />
                </div>

                <div class="flex column-2 collapsible-content-input">
                  <form:label path="addressL2">Address Line 2</form:label>
                  <form:input path="addressL2" class="fs-500" />
                </div>

                <div class="flex column-2" style="--gap: 6rem; flex: 1">
                  <div class="flex column-2 collapsible-content-input">
                    <form:label path="city">City</form:label>
                    <form:input path="city" class="fs-500" />
                    <form:errors class="error" path="city" />
                  </div>

                  <div class="flex column-2 collapsible-content-input">
                    <form:label path="county">County</form:label>
                    <form:input path="county" class="fs-500" />
                    <form:errors class="error" path="county" />
                  </div>
                </div>


                <div id="half-width" class="flex column-2 collapsible-content-input">
                  <form:label path="postcode">Postal Code</form:label>
                  <form:input path="postcode" class="fs-500" />
                  <form:errors class="error" path="postcode" />
                </div>
              </div>

              <div class="collapsible bg-white collapsible-grid-container basket-grid-header">
                <h2 class="collapsible-number fs-500 column-2 center-vertically center-horizontally">2</h2>
                <h2 class="fs-500 text-black column-4 center-vertically">Payment Details</h2>
                <div class="column-5 align-right">
                  <span class="fs-700 text-black iconify" data-icon="ep:arrow-down"></span>
                </div>
              </div>
              <div id="payment-details" class="collapsible-content bg-white grid">

                <div class="flex column-2 collapsible-content-input">
                  <form:label path="cardNumber">Card Number</form:label>
                  <form:input class="fs-500" path="cardNumber" />
                  <form:errors class="error" path="cardNumber" />
                </div>

                <div class="flex column-2" style="--gap: 6rem; flex: 1">
                  <div class="flex column-2 collapsible-content-input">
                    <form:label path="firstName">Cardholder's First Name</form:label>
                    <form:input class="fs-500" path="firstName" />
                  </div>

                  <div class="flex column-2 collapsible-content-input">
                    <form:label path="lastName">Cardholder's Last Name</form:label>
                    <form:input class="fs-500" path="lastName" />
                  </div>
                </div>

                <div class="flex column-2" style="--gap: 6rem; flex: 1">
                  <div class="flex column-2 collapsible-content-input">
                    <form:label path="expDate"> Card Expiry Date</form:label>
                    <form:input class="fs-500" path="expDate" />
                    <form:errors class="error" path="expDate" />
                  </div>

                  <div class="flex column-2 collapsible-content-input">
                    <form:label path="CVV">Card CVV</form:label>
                    <form:input class="fs-500" path="CVV" />
                    <form:errors class="error" path="CVV" />
                  </div>
                </div>

              </div>

              <div class="collapsible bg-white collapsible-grid-container basket-grid-header">
                <h2 class="collapsible-number fs-500 column-2 center-vertically center-horizontally">3</h2>
                <h2 class="fs-500 text-black column-4 center-vertically">Review Order</h2>
                <div class="column-5 align-right">
                  <span class="fs-700 text-black iconify" data-icon="ep:arrow-down"></span>
                </div>
              </div>
              <div id="review-order" class="collapsible-content bg-white grid">
                <div class="order-grid-container basket-grid-header column-2">
                  <h1 class="fs-500 text-d-grey column-1">Product</h1>
                  <h1 class="fs-500 text-d-grey column-2">Quantity</h1>
                  <h1 class="fs-500 text-d-grey column-3">Price</h1>
                </div>
                <div class="column-2">
                  <div class="order-card-container flex">
                    <c:forEach items="${basketProducts}" var="product">
                      <div class="order-grid-container">
                        <div class="basket-card-product flex" style="--gap: 3rem;">
                            <img src="${product.getProduct().getImage()}" alt="${product.getProduct().getName()}">
                            <div class="basket-card-product-content flex" style="--gap: 0;">
                                <h3 class="fs-500">${product.getProduct().getName()}</h3>
                                <h3 class="fs-400">${product.getInitialBasketWeight()} g</h3>
                            </div>
                        </div>
                        <p class="center-vertically fs-500">${product.getQuantity()}</p>
                        <p class="center-vertically fs-500 order-price">£ ${product.getProduct().getDiscountPrice()*product.getQuantity()*product.getInitialBasketWeight()/product.getProduct().getWeight()}</p>
                      </div>
                    </c:forEach>
                  </div>
                </div>
              </div>

              <!-- <input type="submit" /> -->


            </div>
          </form:form>

          <div class="checkout-container flex bg-white">
            <div class="container" style="--gap: 0;">
              <h2 class="checkout-title text-viridian fs-500">Summary</h2>

              <div class="checkout-details grid" style="--gap: 1rem;">
                <p>Total Products:</p>
                <p class="align-right total-products-cost">£ ${price}</p>
                <p>Shipping Costs:</p>
                <p class="align-right shipping-cost">£ 0.00</p>
                <p>Total discount:</p>
                <p class="align-right total-discount-price">£ ${discount}</p>
              </div>

              <div class="checkout-details grid" style="--gap: 0;">
                <p>Total:</p>
                <p class="align-right total-cost">£ ${total}</p>
              </div>

            </div>
            <div class="checkout-button inverse-on-hover" style="
      --bg-clr: var(--clr-white);
      --text-clr: var(--clr-d-purple);
      --gap: 0;
    ">
              <li class="bg-d-purple"><button class="uppercase text-white fs-500 letter-spacing-2 clear-button"
                  form="paymentForm">Buy
                  Now</button></li>
            </div>
          </div>
        </div>


      </div>

      </div>

      </div> <!-- .content -->
    </body>

    <script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
    <script language="JavaScript" type="text/javascript" src="<c:url value='/js/payment.js' />"></script>

    </html>