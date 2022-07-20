@AddAndDeleteProductToCart
Feature: AddAndDeleteProductToShoppingCart

    @Cart
    Scenario: Add To Cart
      Given go to url
      Then check "homepage" title
      When write "roman" in search box
      When click enter button
      Then check product page
      When click random product
      Then check product detail page
      When click add to shopping cart button
      Then check value in cart icon
      When click my shopping cart button
      When click go to cart button
      Then check my shopping cart title
      When delete number of products
      When write "2" in value field
      When click refresh button
      Then check the message is displayed
      When click message cross button
      When click check box button
      When click cross button
      Then check the cart is empty







