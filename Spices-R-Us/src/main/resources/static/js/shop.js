// portfolio
$(".gallery ul li a").click(function () {
  var itemID = $(this).attr("href");
  $(".gallery ul").addClass("item_open");
  $(itemID).addClass("item_open");
  return false;
});
$(".close").click(function () {
  $(".port, .gallery ul").removeClass("item_open");
  return false;
});

$(".gallery ul li a").click(function () {
  $("html, body").animate(
    {
      scrollTop: parseInt($("#top").offset().top),
    },
    400
  );
});

$(".gallery ul li a").hover(function () {
    // alert($(this).attr("href"));
    var before = $(this).children('img').attr("alt");
    before = before.replace(/(?:\r\n|\r|\n)/g, '-');
    $(this).attr('data-before', before);
});

function populateProducts(data) {
  var productsContainer = document.getElementById("content");
  productsContainer.innerHTML = '';
  for (var i = 0; i < data.length; i++) {
    var strPrice = data[i]['price'];

    var product = `<div class="product-card">
      <img src="`+data[i]['image']+`" alt="`+data[i]['name']+`" />
      <div class="product-card-content container bg-white">
        <h2 class="product-card-title fs-500 text-black">`+
          data[i]['name']
          +`<span class="fs-400"> £`+parseFloat(strPrice).toFixed(2)+` / 25g</span>
        </h2>
        <p class="product-card-body fs-300 letter-spacing-3 text-black">
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Ipsum
          pariatur doloremque tenetur tempora molestiae asperiores.
        </p>
        <div
          class="product-card-button links inverse-on-hover flex"
          style="
            --bg-clr: var(--clr-l-green);
            --text-clr: var(--clr-white);
            --gap: 0;
          "
        >
          <li>
            <a href="/shop/product?id=`+data[i]['id']+`" class="uppercase fs-400 text-black"
              >View Product</a
            >
          </li>
        </div>
      </div>
    </div>`;
    productsContainer.innerHTML += product;
  }
  
}
