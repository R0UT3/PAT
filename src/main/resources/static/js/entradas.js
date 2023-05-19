window.onload = function() {
  const carreras = document.getElementById('gp-selector');
  fetch('/api/carreras/', {method:'GET'})
    .then(response => response.json())
    .then(json =>
    json.forEach(a => carreras.innerHTML += `<option value="${a.id}">${a.nombre}</option>`))
    .finally(_ => carreras.dispatchEvent(new Event('change')));
}

document.getElementById('buy-button').onclick = function() {
if(localStorage.getItem("email")!=null)
{
  const carrera = document.getElementById('gp-selector').value;
  const cantidad = document.getElementById('vip-cantidad').value;
  const cantidadGeneral = document.getElementById('general-cantidad').value;
    const email = localStorage.getItem("email");

    const data = [carrera, cantidad,cantidadGeneral,email];

  fetch('/api/comprar/', {
    method: 'POST',headers: {'Content-Type': 'application/json'},
    body: JSON.stringify(data)})
  .then(response => response.json())
  .then(json => {
  console.log(json);
    window.location.assign("/Carrito.html");
  })
        .catch(error => console.error(error));
}
else{
window.location.assign("/Perfil.html");
}
};
