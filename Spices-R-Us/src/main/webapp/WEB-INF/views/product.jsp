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

                <title>Spices-R-Us | ${product.getName()}</title>
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
                                <a class="uppercase text-white letter-spacing-2" href="../shop">Shop</a>
                            </li>
                            <li class="bg-d-orange">
                                <a class="uppercase text-white letter-spacing-2" href="/recipe">Recipes</a>
                            </li>
                            <li class="bg-d-orange">
                                <a class="uppercase text-white letter-spacing-2" href="#">Forum</a>
                            </li>
                            <li class="bg-d-orange">
                                <a class="uppercase text-white letter-spacing-2" href="/account">Account</a>
                            </li>
                        </ul>
                    </nav>
                    <div class="basket">
                        <a href="/basket">
                            <svg width="51" height="51" viewBox="0 0 51 51" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
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

            <div class="product-page-container flex">

                <div class="product-overview bg-white">
                    <!-- <div class="container" style="--container-gap: 100rem;"> -->

                    <div class="product-overview-grid grid container" style="--container-gap: 100rem; --gap: 6rem;">
                        <div class="product-overview-image">
                            <img src="${product.getImage()}" alt="${product.getName()}">
                        </div>

                        <div class="product-overview-content flex" style="--gap: 1rem;">
                            <h1 class="fs-700">${product.getName()}</h1>
                            <div class="pepper-container">
                                <span id="anti-pepper" class="iconify fs-500" data-icon="fa-solid:pepper-hot"></span>
                                <!-- <svg id="anti-pepper" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"
                                    aria-hidden="true" role="img" class="iconify iconify--fa-solid fs-500" width="1em"
                                    height="1em" preserveAspectRatio="xMidYMid meet" viewBox="0 0 512 512"
                                     data-icon="fa-solid:pepper-hot">
                                    <path
                                        d="M330.67 263.12V173.4l-52.75-24.22C219.44 218.76 197.58 400 56 400a56 56 0 0 0 0 112c212.64 0 370.65-122.87 419.18-210.34l-37.05-38.54zm131.09-128.37C493.92 74.91 477.18 26.48 458.62 3a8 8 0 0 0-11.93-.59l-22.9 23a8.06 8.06 0 0 0-.89 10.23c6.86 10.36 17.05 35.1-1.4 72.32A142.85 142.85 0 0 0 364.34 96c-28 0-54 8.54-76.34 22.59l74.67 34.29v78.24h89.09L506.44 288c3.26-12.62 5.56-25.63 5.56-39.31a154 154 0 0 0-50.24-113.94z">
                                    </path>
                                </svg>
                                <span class="iconify fs-500" data-icon="fa-solid:pepper-hot"></span> -->

                            </div>
                            <div class="product-overview-content-grid grid">
                                <h2 class="fs-500 text-d-grey"><span class="original-price"
                                        style="text-decoration: line-through;">£<span
                                            id="original-price">${product.getPrice()}</span></span>&#160;£<span
                                        id="discount-price">${product.getDiscountPrice()}</span> / <span
                                        id="price-weight">25g</span></h2>
                                <p></p>
                                <p class="fs-400 text-d-grey"><button class="heart-button text-d-grey"
                                        id="fav-btn"><span class="iconify" data-icon="akar-icons:heart"></span></button>
                                    Add
                                    to Favourites</p>
                            </div>

                            <div class="flex" style="margin-top: 2rem; --gap: 0.3rem;">
                                <p class="fs-400 product-overview-weight">Select Weight</p>
                                <div id="tooltip">
                                <span class="iconify"
                                        data-icon="carbon:help">
                                    </span>
                                </div>
                            </div>
                            <div class="product-quantities flex">
                                <ul class="weight-links links inverse-on-hover flex" style="
                  --bg-clr: var(--clr-l-green);
                  --text-clr: var(--clr-white);
                  --gap: 3rem;
                  padding: 0;
                ">
                                    <li id="weight-selected"><button
                                            class="text-black letter-spacing-2 clear-button">25g</button>
                                    </li>
                                    <li><button class="text-black letter-spacing-2 clear-button">50g</button></li>
                                    <li><button class="text-black letter-spacing-2 clear-button">100g</button></li>
                                    <li><button class="text-black letter-spacing-2 clear-button">200g</button>
                                    </li>
                                </ul>
                            </div>
                            <a class="product-basket-button text-white bg-d-purple uppercase flex"
                                href="/addToBasket?id=${product.getId()}&level=none">
                                <p class="fs-400 bold">Add to Basket</p>
                                <span class="iconify fs-500" data-icon="dashicons:arrow-right"></span>
                            </a>


                            <div class="product-overview-content-grid grid">
                                <p class="fs-400 bold">Description</p>
                                <p class="fs-400">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Laudantium,
                                    sit. Lorem,
                                    ipsum
                                    dolor sit amet consectetur adipisicing elit. Iusto ducimus fugiat atque officiis
                                    fuga?</p>
                            </div>


                        </div>
                    </div>
                </div>
                <div class="product-info bg-d-grey container" style="--container-gap: 100rem;">
                    <div class="product-info-nav flex" style="--gap: 3rem;">
                        <a href="#">Description</a>
                        <a href="#">Shipping Info</a>
                        <a href="#">Reviews (2456)</a>
                        <a href="#">Promotions<a>
                    </div>
                    <div class="product-info-content flex">
                        <p>${product.getDescription()}</p>
                        <p>${product.getFlavourDescription()}</p>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. In eum veritatis dolorum suscipit,
                            velit minima
                            ducimus fugiat accusamus modi reprehenderit eos debitis officiis aperiam quos impedit et at.
                            Possimus
                            omnis
                            eaque, minima sint similique illo nam suscipit ad voluptas sed consectetur delectus porro
                            incidunt dicta
                            vitae
                            sit. Nulla eligendi, corrupti atque vitae tenetur molestiae optio doloribus quas expedita ut
                            officia
                            minima a
                            eum exercitationem, deserunt obcaecati consequatur, odit quam at excepturi delectus enim
                            aspernatur
                            totam
                            dolores. Non sapiente neque deserunt?</p>
                    </div>

                </div>
            </div>

            <p class="tooltiptext bg-d-purple text-white fs-400">A higher level of membership is required to purchase higher
                                    quantities. Sign up for an account to see further info!</p>

        </body>
        <script type="text/javascript" src="/webjars/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://code.iconify.design/2/2.1.2/iconify.min.js"></script>
        <script language="JavaScript" type="text/javascript" src="<c:url value='/js/product.js' />"></script>
        <script defer>
            initConstants(`${product.getPrice()}`, `${product.getDiscountPrice()}`, `${product.getId()}`, `${disabledButtons}`, `${discounted}`, `${product.getSpicyLevel()}`)
            $( document ).ready(function() {
            // initPrices();
            // initDisabledWeights();
            // initChilliLevel();
            });
        </script>

        </html>