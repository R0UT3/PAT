window.onload = function() {
const cartItemsContainer = document.getElementById("cart-items");
        const email =  localStorage.getItem("email");
        console.log(email);
      fetch('/api/carro/'+email, {
        method: 'GET',
        headers: {'Content-Type': 'application/json'}
      })
       .then(response => response.json())
      .then(json =>{
      cartItemsContainer.innerHTML="";
      console.log(json);
      const cartItemsData = [
            {
              id: 1,
              nombre: "Entrada General",
              carrera:json.granpremio,
              precio: 100*json.nentradasnormal,
              cantidad: json.nentradasnormal
            },
            {
              id: 2,
              nombre: "Entrada VIP",
              carrera:json.granpremio,
              precio: 200*json.nentradasvip,
              cantidad: json.nentradasvip
            }
          ];
          cartItemsData.forEach(item => {
                const cartItem = document.createElement("div");
                cartItem.className = "cart-item";

                const itemName = document.createElement("h2");
                itemName.textContent = item.nombre;
                cartItem.appendChild(itemName);

                const itemCarrera = document.createElement("p");
                      itemCarrera.textContent = "Carrera:" + item.carrera;
                      cartItem.appendChild(itemCarrera);

                const itemPrice = document.createElement("p");
                itemPrice.textContent = "Precio: $" + item.precio;
                cartItem.appendChild(itemPrice);

                const itemQuantity = document.createElement("p");
                itemQuantity.textContent = "Cantidad: " + item.cantidad;
                cartItem.appendChild(itemQuantity);

                cartItemsContainer.appendChild(cartItem);
              });
      }).finally(_ => cartItemsContainer.dispatchEvent(new Event('change')));

}

    const checkoutButton = document.getElementById("checkout-button");
    checkoutButton.addEventListener("click", () => {
        window.location.assign("/Gracias.html");
      });
