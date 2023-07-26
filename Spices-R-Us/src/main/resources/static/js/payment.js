$(document).ready(function () {
  $(".collapsible").click(function () {
    // $(".collapsible").removeClass("collapsible-active");
    // $(this).addClass("collapsible-active");
    $(this).toggleClass("collapsible-active");
    var $content = $(this).next();
    var maxheight = $content.css("max-height");
    maxheight = parseFloat(maxheight.substring(0, maxheight.length - 1));
    if (maxheight > 0) {
      $content.css("max-height", "0px");
    } else {
      var height = $content.prop("scrollHeight");
      $content.css("max-height", height + "px");
    }
  });

  $(".order-price").each(function () {
    var price = $(this).text();
    price = parseFloat(price.substring(2, price.length));
    // console.log("Deez" + price)
    $(this).text("£ " + price.toFixed(2));
  });

  var price = $(".total-products-cost").text();
  var discount = $(".total-discount-price").text();
  var total = $(".total-cost").text();

  price = parseFloat(price.substring(2, price.length));
  discount = parseFloat(discount.substring(2, discount.length));
  total = parseFloat(total.substring(2, total.length));

  $(".total-products-cost").text("£ " + price.toFixed(2));
  $(".total-discount-price").text("£ " + discount.toFixed(2));
  $(".total-cost").text("£ " + total.toFixed(2));

});
