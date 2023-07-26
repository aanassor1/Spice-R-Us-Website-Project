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

        <title>Spices-R-Us | Membership</title>
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
          <li class="account-nav-active"><a class="fs-400 uppercase text-white" href="/account/membership">Membership</a></li>
          <li><a class="fs-400 uppercase text-white" href="/logout">Log Out</a></li>
        </ul>
      </nav>

        <div class="second-column">

          <div class="membership-title flex" style="--gap: 1rem;">
            <h1 class="fs-600">Choose a membership level</h1>
            <h3>Current Membership - <span>${membershipLevel}</span></h3>
          </div>

          <div class="membership-container flex" style="--gap: 3rem;">

            <div class="membership-card bg-white">
              <div class="membership-card-title flex" style="--gap: 0;">
                <h2 class="fs-500">For Homecooks</h2>
                <h3 class="fs-400">The perfect option for families</h3>
              </div>

              <div class="membership-card-pricing flex" style="--gap: 1rem;">
                <h3 class="fs-400"><span class="pricing-discount strike-through">£9.99</span><span
                    class="pricing-discount bg-d-orange text-white">Save 90%</span></h3>
                <h2 class="fs-700">£0.99 <span class="fs-300 pricing-sub">/mo</span></h2>
              </div>

              <div class="membership-card-btn inverse-on-hover container" style="
                --bg-clr: var(--clr-white);
                --text-clr: var(--clr-d-orange);
                --gap: 0;
                --container-gap: 100%;
              ">
                <li class="bg-d-orange"><a class="uppercase text-white fs-400 letter-spacing-2"
                    href="/account/homecook">Purchase</a></li>
              </div>

              <div class="membership-card-body flex" style="--gap: 1rem;">
                <p><span class="text-viridian fs-500">&#10003</span> Lorem ipsum dolor sit amet, consectetur adipisicing
                  elit.
                </p>
                <p><span class="text-red fs-500">&#10007</span> Lorem ipsum dolor sit amet consectetur adipisicing elit.
                  Excepturi, ea!</p>
                <p><span class="text-red fs-500">&#10007</span> Lorem ipsum dolor sit amet, consectetur adipisicing.</p>
                <p><span class="text-red fs-500">&#10007</span> Lorem ipsum dolor sit amet consectetur.</p>
              </div>
            </div>

            <div class="membership-card bg-white">
              <div class="membership-card-title flex" style="--gap: 0;">
                <h2 class="fs-500">For Enthusiasts</h2>
                <h3 class="fs-400">Great for aspiring chefs</h3>
              </div>

              <div class="membership-card-pricing flex" style="--gap: 1rem;">
                <h3 class="fs-400"><span class="pricing-discount strike-through">£10.19</span><span
                    class="pricing-discount bg-d-orange text-white">Save 80%</span></h3>
                <h2 class="fs-700">£1.99 <span class="fs-300 pricing-sub">/mo</span></h2>
              </div>

              <div class="membership-card-btn inverse-on-hover container" style="
                --bg-clr: var(--clr-white);
                --text-clr: var(--clr-d-orange);
                --gap: 0;
                --container-gap: 100%;
              ">
                <li class="bg-d-orange"><a class="uppercase text-white fs-400 letter-spacing-2"
                    href="/account/enthusiast">Purchase</a></li>
              </div>

              <div class="membership-card-body flex" style="--gap: 1rem;">
                <p><span class="text-viridian fs-500">&#10003</span> Lorem ipsum dolor sit amet consectetur adipisicing
                  elit.
                  Ad, impedit!</p>
                  <p><span class="text-viridian fs-500">&#10003</span> Lorem ipsum dolor sit amet, consectetur adipisicing
                    elit.
                  </p>
                <p><span class="text-red fs-500">&#10007</span> Lorem ipsum dolor sit amet.</p>
                <p><span class="text-red fs-500">&#10007</span> Lorem ipsum dolor sit amet consectetur adipisicing elit.
                  Reprehenderit!</p>
              </div>
            </div>

            <div class="membership-card bg-white">
              <div class="membership-card-title flex" style="--gap: 0;">
                <h2 class="fs-500">For Local Businessess</h2>
                <h3 class="fs-400">Made for small businesses</h3>
              </div>

              <div class="membership-card-pricing flex" style="--gap: 1rem;">
                <h3 class="fs-400"><span class="pricing-discount strike-through">£13.99</span><span
                    class="pricing-discount bg-d-orange text-white">Save 70%</span></h3>
                <h2 class="fs-700">£3.99 <span class="fs-300 pricing-sub">/mo</span></h2>
              </div>

              <div class="membership-card-btn inverse-on-hover container" style="
                --bg-clr: var(--clr-white);
                --text-clr: var(--clr-d-orange);
                --gap: 0;
                --container-gap: 100%;
              ">
                <li class="bg-d-orange"><a class="uppercase text-white fs-400 letter-spacing-2"
                    href="/account/business">Purchase</a></li>
              </div>

              <div class="membership-card-body flex" style="--gap: 1rem;">
                <p><span class="text-viridian fs-500">&#10003</span> Lorem ipsum, dolor sit amet consectetur adipisicing
                  elit.</p>
                <p><span class="text-red fs-500">&#10007</span> Lorem ipsum, dolor sit amet consectetur adipisicing
                  elit.
                </p>
                <p><span class="text-viridian fs-500">&#10003</span> Lorem ipsum dolor sit amet consectetur.</p>
                <p><span class="text-viridian fs-500">&#10003</span> Lorem ipsum dolor sit amet consectetur adipisicing elit.
                  Nihil, rem.</p>
              </div>
            </div>

          </div>

        </div>

      </div>
    </body>

    </html>