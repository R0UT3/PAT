document.getElementById('actualizar').onclick = function() {
  const email = document.getElementById('email_id').value;
  const texto = document.getElementById('text_id').value;
    const data = [ email, texto ];

  fetch(`/api/contacto/`, {
    method: 'POST',headers: {
                           'Content-Type': 'application/json'
                         },
    body: JSON.stringify(data)

  })
  .then(response => response.json())
  .then(json => {
  console.error(json);
    window.location.assign("/index.html");
  })
        .catch(error => console.error(error));

}
