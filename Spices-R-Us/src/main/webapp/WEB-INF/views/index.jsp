<!--Homepage JSP-->
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

        <title>Spices-R-Us | Homepage</title>
    </head>

    <body>
      <!-- <div class="content"> -->
      <div class="fill-content grid-homepage scroll">
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

        <div class="grid-container flex hero">
          <div>
            <h1 class="text-white fs-700">
              From the humble homecook to the aspiring chef...
            </h1>

            <h2 class="text-l-yellow fs-600">...spice up your life</h2>
            <svg width="63" height="41" viewBox="0 0 63 41" fill="none">
              <path
                d="M5.37961 5.375H56.9366L31.1581 34.8354L5.37961 5.375ZM1.33224 8.91713L27.1107 38.3721C27.6152 38.9494 28.2374 39.4122 28.9355 39.7292C29.6336 40.0462 30.3914 40.2103 31.1581 40.2103C31.9248 40.2103 32.6826 40.0462 33.3807 39.7292C34.0788 39.4122 34.701 38.9494 35.2055 38.3721L60.984 8.91713C64.0262 5.4395 61.5537 1.97642e-06 56.9366 1.97642e-06H5.37961C4.3463 -0.000883969 3.33463 0.296097 2.46576 0.855383C1.59689 1.41467 0.907647 2.21255 0.480572 3.15348C0.0534964 4.0944 -0.0933078 5.13849 0.0577395 6.1607C0.208787 7.18292 0.651282 8.13993 1.33224 8.91713V8.91713Z"
                fill="white" />
            </svg>
          </div>
        </div>
      </div>

      <div class="featured container fill-content scroll" style="--container-gap: 100rem">
        <div class="motive bg-l-grey">
          <h3 class="text-viridian">Our Motive...</h3>
          <p>
            "Lorem ipsum dolor sit amet consectetur adipisicing elit. A ipsam
            magnam consectetur ducimus, id, accusamus voluptates doloremque
            distinctio delectus beatae et quam error molestias sequi labore
            dicta veritatis. Atque sint quos libero unde beatae, vero facilis?
            Sapiente quo deleniti corrupti. Commodi est eius quasi ipsam ex unde
            quod a nemo.""
          </p>
        </div>

        <div class="featured-products">
          <h2 class="fs-500 card-heading letter-spacing-2">
            Featured Products
          </h2>
          <div class="featured-card bg-white">
            <div class="featured-card-image"></div>
            <div class="featured-card-body flex container">
              <h2 class="fs-600 letter-spacing-1">Turmeric</h2>
              <h3 class="fs-400"><span class="uppercase">Only for </span><span class="fs-500">£0.99 / 50g</span></h3>
              <ul class="links inverse-on-hover flex" style="
                  --bg-clr: var(--clr-l-green);
                  --text-clr: var(--clr-white);
                  --gap: 6rem;
                ">
                <li><button class="uppercase text-black letter-spacing-2 clear-button modal-button"
                    id="modal-button">Homecooks</button></li>

                <li><button class="uppercase text-black letter-spacing-2 clear-button modal-button"
                  id="modal-button">Enthusiasts</button></li>
                <li><button class="uppercase text-black letter-spacing-2 clear-button modal-button"
                  id="modal-button">Restaurants</button></li>
              </ul>
              <p class="letter-spacing-3">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Rem
                blanditiis, atque itaque porro quibusdam dolorum nam officiis
                voluptatum accusantium libero ipsum facere fugit aut repudiandae
                harum mollitia omnis distinctio commodi! Esse optio consectetur
                corrupti sed repellat maxime. Amet ad fugit maxime delectus illo
                porro ab ex inventore, soluta aliquid consectetur quis! Rem
                ullam doloremque in suscipit eaque? Perferendis, asperiores
                eaque!
              </p>
            </div>
          </div>
        </div>

      </div>

      <div class="links-section container fill-content grid-homepage scroll" style="--container-gap: 100rem">

        <div class="nav-links flex" style="--gap: 5rem;">
          <div class="recipe-page-link link-card container" style="--container-gap: 70rem;">
            <h2 class="fs-600 text-white">Try our latest mouth-watering spice recipes</h2>
            <ul class="inverse-on-hover" style="
                  --bg-clr: var(--clr-white);
                  --text-clr: var(--clr-d-purple);">

              <li class="bg-d-purple"><a class="uppercase fs-400 text-white" href="#">Get Chatting</a></li>


            </ul>
          </div>

          <div class="forum-page-link link-card container">
            <h2 class="fs-600 text-white">Engage with the community in our discussion board</h2>
            <ul class="inverse-on-hover" style="
                  --bg-clr: var(--clr-white);
                  --text-clr: var(--clr-d-purple);">

              <li class="bg-d-purple"><a class="uppercase fs-400 text-white" href="#">Take a Look</a></li>


            </ul>

          </div>
        </div>
      </div>

      <div class="newsletter-page fill-content scroll">
        <div class="container" style="--container-gap: 100rem">
          <h2>Subscribe to our newsletter</h2>
        </div>

        <footer class="bg-d-purple">
          <div class="footer container" style="--container-gap: 100rem;">
            <div class="footer-content flex">
              <div class="logo">
                <a href="/" class="uppercase text-white letter-spacing-2 fs-400">
                  <span class="fs-500" style="font-weight: 600;">Spices</span> R Us
                </a>
              </div>
              <p class="fs-400 text-white letter-spacing-2">
                Lorem ipsum dolor sit amet consectetur adipisicing elit.
                Inventore possimus accusamus incidunt deserunt eos eius non sunt facilis corrupti mollitia.</p>
              <p class="fs-500 text-white">Phone: <span class="fs-400">0000 000 0000</span> </p>
              <p class="fs-500 text-white">Email: <span class="fs-400">spicesrus@shop.com</span> </p>
            </div>

            <ul class="footer-content footer-links flex" style="--gap: 0;">
              <li class="text-white">> <a class="fs-400 text-white" href="#">About Us</a></li>
              <li class="text-white">> <a class="fs-400 text-white" href="#">Contact</a></li>
              <li class="text-white">> <a class="fs-400 text-white" href="#">Testimonials</a></li>
              <li class="text-white">> <a class="fs-400 text-white" href="#">Support</a></li>
              <br>
              <li class="text-white">> <a class="fs-400 text-white" href="#">Shop</a></li>
              <li class="text-white">> <a class="fs-400 text-white" href="#">Recipes</a></li>
              <li class="text-white">> <a class="fs-400 text-white" href="#">Forum</a></li>
              <li class="text-white">> <a class="fs-400 text-white" href="#">Account</a></li>
            </ul>

          </div>
        </footer>
      </div>
      </div> <!-- .content -->
      <div class="modal">
        <div class="modal-content bg-white container" style="--modal-width: 40%;">
          <div class="modal-header">

            <span class="close-modal fs-500">&times;</span>
            <h2 class="text-viridian fs-500" id="model-title">Want to purchase a membership?</h2>
          </div>
          <div class="modal-body">
            <p class="fs-400" id="modal-paragraph-1">Members come with amazing benefits, including discounts on
              purchases, priority on premium goods, free delivery, and more!</p>
            <p class="fs-400" id="modal-paragraph-2">Click below to have a look at out our available options</p>
            <a href="account/membership">Check it out</a>
          </div>
        </div>
      </div>
    </body>
    <script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script language="JavaScript" type="text/javascript" src="<c:url value='/js/index.js' />"></script>
    <script defer>
      $(document).ready(function () {
        var membershipLevel = `${membershipLevel}`;
        setupModals(membershipLevel);
      });
    </script>

    </html>