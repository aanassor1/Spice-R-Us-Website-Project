// var swiper = new Swiper('.product-slider', {
//       spaceBetween: 30,
//       effect: 'fade',
//       loop: true,
//       mousewheel: {
//         invert: false,
//       },
//       // autoHeight: true,
//       pagination: {
//         el: '.product-slider__pagination',
//         clickable: true,
//       }
//     });

// $('#modal-button').click(function() {
//     $(".modal").css('display', 'block');
// })

$('.close-modal').click(function() {
  $(".modal").css('display', 'none');
})

$(window).click(function(e) {
  if ( $(e.target).hasClass('modal')) {
    $(".modal").css('display', 'none');
  }
})

function setupModals(membershipLevel) {
  // alert(membershipLevel);
  if (membershipLevel == "unregistered" || membershipLevel == "ROLE_USER" || membershipLevel == "ROLE_ADMIN") {
    $('.modal-button').attr('onclick', '');
    $(document).on('click', '.modal-button', function(event) {
      event.stopPropagation();
      event.stopImmediatePropagation();
      $(".modal").css('display', 'block');
  })
  } else {
    $('.modal-button').unbind('click');
    $('.modal-button').attr('onclick', `window.location.href='https://localhost:8443/shop/product?id=3';`)
  }
}