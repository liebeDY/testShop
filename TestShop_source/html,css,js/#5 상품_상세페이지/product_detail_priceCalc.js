function plusMinus(type, ths) {
    var quantity = document.getElementById("quantity");
    var cnt = Number(quantity.value)
    var prod_price = document.getElementById("main_product_price_p").innerText.split('원')[0];

    var total_price = document.getElementById("total_price_input")
        // console.log(quantity)
        // console.log(cnt)
    console.log(prod_price)

    if (type == "m") {
        cnt += 1

        quantity.value = cnt
        total_price.value = "Total: " + cnt * Number(prod_price) + " 원"


    } else if (type == "p" && cnt > 0) {
        cnt -= 1

        quantity.value = cnt
        total_price.value = "Total: " + cnt * Number(prod_price) + " 원"
    }
}