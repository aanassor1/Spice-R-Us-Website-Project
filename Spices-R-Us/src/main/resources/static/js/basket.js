var basePrices;

function initBasePrices(basePricesImport) {
	basePrices = basePricesImport;
	basePrices = basePrices.replace('[', '');
	basePrices = basePrices.replace(']', '');
	basePrices = basePrices.split(', ')
	console.log(basePrices);
}

$(document).ready(function () {
	
	$(".heart-button").click(function () {
	
		var curColour = $(this).css('color');
	
		if (curColour == "rgb(64, 64, 64)") {
			$(this).css('color', 'red');
		} else {
			$(this).css('color', 'rgb(64, 64, 64');
		}
	});

	function updatePrices() {

		var basketProducts = $(".basket-card").map(function () {
			return this.innerHTML;
		}).get();

		var allQuantities = $('.product-qty');
		var allPrices = $('.product-price');

		for (var i = 0; i < basketProducts.length; i++) {

			console.log(allQuantities[i].value);
			var quantity = parseInt(allQuantities[i].value);
			// console.log(typeof(basePrices[i]));
			// console.log(basePrices[i]);
			// console.log(parseFloat(basePrices[i]));
			var newPrice = parseFloat(basePrices[i]) * quantity;
			allPrices[i].innerHTML = '£ ' + newPrice.toFixed(2);

		}
	}

	function updateSummary() {

		var allPrices = $('.product-price');
		var totalPrice = 0.0;
		var discountPrice = 0.0;
		var totalDiscount = 0.0;

		for (var i = 0; i < allPrices.length; i++) {

			console.log(allPrices[i].innerHTML.substring(2));
			discountPrice += parseFloat(allPrices[i].innerHTML.substring(2));

		}

		if (membershipLevel == "ROLE_HOMECOOK") {
			totalPrice = discountPrice * (1 / 0.95);
		}
		if (membershipLevel == "ROLE_ENTHUSIAST") {
			totalPrice = discountPrice * (1 / 0.9);
		}
		if (membershipLevel == "ROLE_BUSINESS") {
			totalPrice = discountPrice * (1 / 0.85);
		}
		if (membershipLevel == "unregistered" || membershipLevel == "ROLE_USER" || membershipLevel == "ROLE_ADMIN") {
			totalPrice = discountPrice;
		}

		totalDiscount = totalPrice - discountPrice;

		$('.total-discount-price').html('£ ' + totalDiscount.toFixed(2));
		$('.total-products-cost').html('£ ' + totalPrice.toFixed(2));
		$('.total-cost').html('£ ' + discountPrice.toFixed(2));

		var link = "/payment?price=" + totalPrice + "&discount=" + totalDiscount + "&total=" + discountPrice;
		$("#checkout-button").attr("href", link)
		console.log(link);
	}

	var QtyInput = (function () {
		var $qtyInputs = $(".quantity-component");
	
		if (!$qtyInputs.length) {
			return;
		}
	
		var $inputs = $qtyInputs.find(".product-qty");
		var $countBtn = $qtyInputs.find(".quantity-button");
		var qtyMin = parseInt($inputs.attr("min"));
		var qtyMax = parseInt($inputs.attr("max"));
	
		$inputs.change(function () {
			var $this = $(this);
			var $minusBtn = $this.siblings(".btn-minus");
			var $addBtn = $this.siblings(".btn-plus");
			var qty = parseInt($this.val());
	
			if (isNaN(qty) || qty <= qtyMin) {
				$this.val(qtyMin);
				$minusBtn.attr("disabled", true);
			} else {
				$minusBtn.attr("disabled", false);
	
				if (qty >= qtyMax) {
					$this.val(qtyMax);
					$addBtn.attr("disabled", true);
				} else {
					$this.val(qty);
					$addBtn.attr("disabled", false);
				}
			}
	
			updatePrices();
			updateSummary();
		});
	
		$countBtn.click(function () {
			var operator = this.dataset.action;
			var $this = $(this);
			var $input = $this.siblings(".product-qty");
			var qty = parseInt($input.val());
	
			if (operator == "add") {
				qty += 1;
				if (qty >= qtyMin + 1) {
					$this.siblings(".btn-minus").attr("disabled", false);
				}
	
				if (qty >= qtyMax) {
					$this.attr("disabled", true);
				}
			} else {
				qty = qty <= qtyMin ? qtyMin : (qty -= 1);
	
				if (qty == qtyMin) {
					$this.attr("disabled", true);
				}
	
				if (qty < qtyMax) {
					$this.siblings(".btn-plus").attr("disabled", false);
				}
			}
	
			$input.val(qty);
	
			updatePrices();
			updateSummary();
		});
	
	})();

	updatePrices();
	updateSummary();
});
