<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

                <title>Spices-R-Us | Account Details</title>
        </head>

        <body>
            <nav class="account-nav bg-d-purple">
                <ul class="container inverse-on-hover flex" style="
                  --bg-clr: var(--clr-white);
                  --text-clr: var(--clr-d-purple);
                  --gap: 1rem;
                ">
                    <li><a class="fs-400 uppercase text-white" href="/">Home</a></li>
                    <li><a class="fs-400 uppercase text-white" href="/account/dashboard">Account Details</a></li>
                    <li class="account-nav-active"><a class="fs-400 uppercase text-white"
                            href="/account/membership">Membership</a></li>
                    <li><a class="fs-400 uppercase text-white" href="/logout">Log Out</a></li>
                </ul>
            </nav>

            <div class="second-column container" style="--container-gap: 90rem;">

                <div class="account-details-container bg-white">

                    <div class="account-details-title">
                        <h1 class="fs-600 text-viridian">Account Details</h1>
                    </div>

                    <div class="account-details-content container">
                        <div class="profile flex">
                            <div>
                                <!-- <img src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png" alt="profile picture"> -->
                                <span class="profile-picture"></span>
                            </div>
                            <div class="profile-content">
                                <h2 class="fs-400 text-viridian">${spiceUser.firstName} ${spiceUser.lastName}</h2>
                                <p class="fs-400 text-black">${membershipLevel}</p>
                            </div>

                            
                            <div class="verify-account links inverse-on-hover" style="
                  --bg-clr: var(--clr-l-green);
                  --text-clr: var(--clr-white);
                  --gap: 1rem;
                ">
                                <li><a class="uppercase text-black" href="#">Verify Account</a></li>
                            </div>

                        </div>

                        <div class="account-information">
                            <h2 class="fs-400 text-viridian">Account Information</h2>
                            <h3 class="fs-400 text-black">First Name</h3>
                            <input type="text" name="first-name" id="first-name" placeholder="${spiceUser.firstName}"
                                readonly>
                            <h3 class="fs-400 text-black">Last Name</h3>
                            <input type="text" name="last-name" id="last-name" placeholder="${spiceUser.lastName}"
                                readonly>
                            <h3 class="fs-400 text-black">Username</h3>
                            <input type="text" name="username" id="username" placeholder="${spiceUser.username}"
                                readonly>
                            <h3 class="fs-400 text-black">Email</h3>
                            <input type="text" name="email" id="email" placeholder="${spiceUser.email}" readonly>
                            <h3 class="fs-400 text-black">Phone Number</h3>
                            <input type="text" name="last-name" id="last-name" placeholder="0000 000 0000" readonly>
                        </div>

                        <div class="address-information">
                            <h2 class="fs-400 text-viridian">Address Information</h2>
                            <h3 class="fs-400 text-black">Country</h3>
                            <input type="text" name="country" id="country" placeholder="United Kingdom" readonly>
                            <h3 class="fs-400 text-black">City</h3>
                            <input type="text" name="city" id="city" placeholder="Leicester" readonly>
                            <h3 class="fs-400 text-black">Address</h3>
                            <input type="text" name="address" id="address" placeholder="64 Zoo Lane" readonly>
                            <h3 class="fs-400 text-black">Postal Code</h3>
                            <input type="text" name="post-code" id="postal-code" placeholder="LE1 7RH" readonly>
                        </div>

                        <div class="billing-information">
                            <h2 class="fs-400 text-viridian">Billing Information</h2>
                            <h3 class="fs-400 text-black">Card Number</h3>
                            <input type="text" name="card-number" id="card-number" placeholder="4111 **** **** ****"
                                readonly>
                            <h3 class="fs-400 text-black">Expiration Date</h3>
                            <input type="text" name="expiration-date" id="expiration-date" placeholder="02/25" readonly>
                            <h3 class="fs-400 text-black">CVV</h3>
                            <input type="text" name="cvv" id="cvv" placeholder="***" readonly>
                            <h3 class="fs-400 text-black">First Name</h3>
                            <input type="text" name="first-name" id="first-name" placeholder="${spiceUser.firstName}"
                                readonly>
                            <h3 class="fs-400 text-black">Last Name</h3>
                            <input type="text" name="last-name" id="last-name" placeholder="${spiceUser.lastName}"
                                readonly>

                        </div>
                    </div>
                </div>

            </div>

        </body>

        </html>