<form action="/v1/home" method="post">
<div>
        <h2>Shop With Ease</h2>

        <button id='cart-button' input class="trigger cart-button-style">Show Cart</button>

        <div id="shop">
            <% for (int i = 0; i < 8; i++) { %>
            <div class="products ios apple" id="iphone-x">
                <img class="product-image" src="https://cdn.pixabay.com/photo/2020/02/18/04/54/iphone-4858453_960_720.png">
                <p class="product-name">iPhone X</p>
                <p class="product-description">A 5.5" beast of processing power from Apple.</p>
                <p class="product-price" value='999'>999</p>
                <button class="add-to-cart" id='test' input type = "submit" name = "button">ADD TO CART</button>
            </div>
            <% } %>
        </div>

    </div>
        <div id='cart-wrapper' class="slider close">
            <div id='cart'>
                <div id="cart-products-wrapper">
                    <table id="cart-table">
                    <thead id="cart-table-header">
                         <th class="name-col">Product Name</th>
                         <th class="quantity-col">Quantity</th>
                         <th class="price-col">Price</th>
                         <th class="updated-price-col">Updated Price</th>
                         <th class="update-col">Update</th>
                         <th class="remove-col">Remove</th>
                    </thead>
                    <tbody id="cart-table-body"></tbody>
                    </table>
                </div>
            </div>

            <div id='amount-controls'>
                <div id="cart-amount-wrapper">
                    <table>
                        <tbody>
                            <tr id='subtotal-wrappper'>
                                <td id="subtotal-label">Subtotal:</td>
                                <td id="subtotal">0.00</td>
                            </tr>

                            <tr id='total-wrapper'>
                                <td id="total-label">Total:</td>
                                <td id="total">0.00</td>
                            </tr>

                            <tr id="promo-checkout">
                                <td id="promo-wrapper">
                                    <input id="promo" placeholder="Input Promo Code">
                                    <button id="apply-promo">Apply Promo</button>
                                </td>

                                <td>
                                    <button id="checkout">Checkout</button>
                                </td>

                                <td>
                                    <button id="ks" class="keep-shopping">Keep Shopping</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
</form>
<style>
    @import url('https://fonts.googleapis.com/css?family=Montserrat');

* {
    font-family: 'Montserrat', sans-serif;
    outline: 0;
    transition: .3s;
}

body {
    display: flex;
    flex-direction: row-reverse;
}

h2 {
    font-weight: bolder;
    text-align: center;
}

.cart-button-style {
    border-style: none;
    position: fixed;
    top: 0;
    right: 0;
    width: 10em;
    padding: 1em 1em;
    margin: 0.5em;
    background: #7762ff;
    color: white;
    transition: background .5s;
    border-radius: 4px;
}

.cart-button-style-two {
    border-style: none;
    position: fixed;
    top: 0;
    right: 0;
    width: 10em;
    padding: 1em 1em;
    margin: 0.5em;
    background: white;
    color: #7762ff;
    transition: background .5s;
    border-radius: 4px;
}

.cart-button-style:hover, #checkout:hover, #apply-promo:hover, .keep-shopping:hover {
    background: #62ff8e;
    color: white;
}

.cart-button-style:active, #checkout:active, #apply-promo:active, .keep-shopping:active {
    background: #ff6884;
    color: white;
}

.products {
    float: left;
    width: 23%;
    margin: 3% 1%;
    text-align: center;
    padding: 0 0 1% 0;
}

.products img {
    width: 100%;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
}

@media screen and (max-width: 980px) {
    .products {
        width: 30%;
        text-align: center;
        margin: 1.66%;
    }
}

@media screen and (max-width: 790px) {
    .products {
        width: 47%;
        margin: 1% 1%;
    }

    #shop {
        margin: 5% 1%;
    }
}

@media screen and (max-width: 600px) {
    .products {
        width: 100%;
    }

    #shop {
        margin: 2% 0;
    }
}

#shop::after {
    content: '';
    display: block;
    clear: both;
}

.add-to-cart {
    display: block;
    margin: 1% auto;
    border-style: none;
    width: 10em;
    height: 3em;
    background: #62ff8e;
    color: white;
    font-weight: bold;
    border-radius: 20px;
}

.add-to-cart:hover {
    background: #7762ff;
}

.add-to-cart:active {
    background: #62ff8e;
}

.slider {
    position: fixed;
    width: 100vw;
    height: 100vh;
    top: 0;
    overflow: hidden;
    background: white;
    transition: all 1s;
}

.slider.close {
    top: 100vh;
    height: 0;
}

#amount-controls {
    background: white;
    top: 90;
    right: 0;
}

#cart-amount-wrapper {
    background: white;
    padding: 1.5% 0 .5% 35%;
    border-radius: 10px;
}

#cart {
    text-align: left;
    margin: 3.5em 0.5em;
    padding: 0.5% 1.5%;
    overflow-y: scroll;
}

#total::before, #subtotal::before, .product-price::before, .cart-product-price::before, .cart-updated-product-price::before, #discountAmt::before {
    content: '$';
}

#cart #quantity-value {
    width: 45%;
}

.name-col {
  width: 40%;
}
.quantity-col {
  width: 5%;
}
.price-col {
  width: 15%;
}

.updated-price-col {
    width: 25%;
}

.update-col {
    width: 10%
}

.remove-col {
  width: 5%;
}

#update {
    border-style: none;
    text-transform: uppercase;
    padding: 2% 12px;
    width: 100%;
    height: 30px;
    background: #56ff6a;
    color: white;
    border-radius: 10px;
}

#update:hover {
    background: #f0ffe6;
    color: #56ff6a;
}

#update:active {
    background: #56f46a;
    color: white;
}

.remove {
    border-style: none;
    font-weight: bolder;
    padding: 2% 2.5%;
    width: 100%;
    height: 30px;
    background: #ff7b67;
    color: #fff1e7;
    border-radius: 10px;
}

.remove:hover {
    background: #fff1e7;
    color: #ff7b67;
}

.remove:active {
    background: #ff7b67;
    color: #f5f1e7;
}

#cart-products-wrapper {
    overflow-y: auto;
}

#cart-amount-wrapper {
    overflow-x: auto;
}

#promo {
    width: 10em;
    padding: 1em 1em;
    transition: background .5s;
    border-radius: 4px;
}

#apply-promo, #checkout, .keep-shopping {
    border-style: none;
    width: 10em;
    padding: 1em 1em;
    background: #7762ff;
    color: white;
    transition: background .5s;
    border-radius: 4px;
}
</style>