document.getElementById('botonRegis').onclick = function() {
const name = document.getElementById("name").value;
      const email = document.getElementById("email").value;
      const password = document.getElementById("password").value;
      const data = [name, email, password];
      fetch('/api/registrar/', {
          method: 'POST',headers: {'Content-Type': 'application/json'},
          body: JSON.stringify(data)})
        .then(response => response.json())
        .then(json => {
        localStorage.setItem("email", email);
        console.error(json);
          window.location.assign("/index.html");
        })
              .catch(error => console.error(error));
}
if(localStorage.getItem("email")!=null)
{
window.onload = function() {
    document.getElementById("main").innerHTML=`<form class="form123" ><label for="passOld"><h2>Contraseña antigua</h2></label><br /> <input type="password" id="passOld" name="password2" required/><label for="pass"><h2>Cambiar Contraseña</h2></label><br /> <input type="password" id="pass" name="password" required/><button class="change-password-button">Cambiar Contraseña</button></form>`
    const changePasswordButton = document.querySelector(".change-password-button");
        changePasswordButton.addEventListener("click", function() {
          const pass = document.getElementById("pass").value;
          const passOld = document.getElementById("passOld").value

          const email2=localStorage.getItem("email");
                const data = [ email2, pass,passOld ];
                fetch('/api/chPass/', {
                    method: 'POST',headers: {'Content-Type': 'application/json'},
                    body: JSON.stringify(data)})
                  .then(response => response.json())
                  .then(json => {
                  console.error(json);
                    window.location.assign("/index.html");
                  })
                        .catch(error => console.error(error));
          });


}}

