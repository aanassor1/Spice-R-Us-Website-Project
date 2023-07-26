var basePrice = 0.0;
var discountPrice = 0.0;
var productId = 0;
var disabledButtons = 0;
var discounted = false;
var chilliLevel = 0;

function initConstants(price, discountprice, id, dButtons, disc, cLevel) {
  basePrice = parseFloat(price);
  discountPrice = parseFloat(discountprice);
  productId = id;
  disabledButtons = dButtons;
  discounted = disc;
  chilliLevel = cLevel;
}

$( document ).ready(function() {

jQuery.fn.reverse = [].reverse;

function initPrices(discounted) {
  // alert(typeof(discounted));
  var originalPrice = $("#original-price").text();
  var discountPrice = $("#discount-price").text();
  $("#original-price").text(parseFloat(originalPrice).toFixed(2));
  $("#discount-price").text(parseFloat(discountPrice).toFixed(2));

  if (discounted == "false") {
    removeOriginalPrice(originalPrice);
  }
}

function initDisabledWeights(disabledButtons) {
  $(".clear-button")
    .reverse()
    .each(function (i, obj) {
      if (i >= disabledButtons) return;
      $(obj).closest("li").attr("id", "weight-disabled");
      $(obj).attr("disabled", true);
      $(obj).css("cursor", "not-allowed");
    });
}

function initChilliLevel(level) {
  // alert(level);
  var pepper = $("svg[data-icon='fa-solid:pepper-hot']")[0];
  var antiPepper = $(pepper).clone();
  $(antiPepper)
    .children("path")
    .each(function () {
      $(this).attr("fill", "");
    });

  $(".pepper-container").empty();
  var reverseLevel = 4 - parseInt(level);

  for (var i = 0; i < 4; i++) {
    $(pepper).clone().appendTo(".pepper-container");
  }

  if (parseInt(reverseLevel) > 0) {
    var $div = $(".pepper-container > *").slice(0, parseInt(reverseLevel));
    $div.remove();
    for (var i = 0; i < parseInt(reverseLevel); i++) {
      $(antiPepper).clone().appendTo(".pepper-container");
    }
  }
}

function removeOriginalPrice(price) {
  $(".original-price").text("");
  $("#discount-price").text(parseFloat(price).toFixed(2));
}

$(".clear-button").click(function () {
  var button = this;
  var parentListItem = $(this).closest("li");

  $(".clear-button").each(function (i, obj) {
    $(obj).closest("li").attr("id", "");
    if (button == obj) {
      parentListItem.attr("id", "weight-selected");
      updatePrices(button);
      updateBasketLink(button.innerHTML.replace("g", ""));
    }
  });

  initDisabledWeights(disabledButtons);
});

function updatePrices(button) {
  var multiplier = parseInt(button.innerHTML.replace("g", "")) / 25;
  $("#price-weight").text(button.innerHTML);

  var originalPrice = $("#original-price").text();

  if (originalPrice != "") {
    $("#original-price").text((basePrice * multiplier).toFixed(2));
    $("#discount-price").text((discountPrice * multiplier).toFixed(2));
    return;
  }
  $("#discount-price").text((basePrice * multiplier).toFixed(2));
}

function updateBasketLink(weight) {
  if (weight == "25") {
    $(".product-basket-button").attr(
      "href",
      "/addToBasket?id=" + productId + "&level=none"
    );
  } else if (weight == "50") {
    $(".product-basket-button").attr(
      "href",
      "/addToBasket?id=" + productId + "&level=low"
    );
  } else if (weight == "100") {
    $(".product-basket-button").attr(
      "href",
      "/addToBasket?id=" + productId + "&level=mid"
    );
  } else if (weight == "200") {
    $(".product-basket-button").attr(
      "href",
      "/addToBasket?id=" + productId + "&level=high"
    );
  }
}

$(".heart-button").click(function () {
  var curColour = $(this).css("color");

  if (curColour == "rgb(64, 64, 64)") {
    $(this).css("color", "red");
  } else {
    $(this).css("color", "rgb(64, 64, 64");
  }
});

$("#tooltip").mouseover(function() {
  $(".tooltiptext").css("visibility", "visible");
  $(".tooltiptext").css("opacity", "1");

  var top = $(this).position().top - 53;
  var left = $(this).position().left - 130;
  console.log(top.toString() + " " + left.toString())

  $(".tooltiptext").css("top", top);
  $(".tooltiptext").css("left", left);

  console.log()
  // alert("hi")
})

$("#tooltip").mouseout(function() {
  $(".tooltiptext").css("visibility", "hidden");
  $(".tooltiptext").css("opacity", "0");
  // alert("hi")
})

initPrices(discounted);
initDisabledWeights(disabledButtons);
initChilliLevel(chilliLevel);

})