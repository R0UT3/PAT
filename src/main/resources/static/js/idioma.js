const langSelect = document.getElementById("language-select"); //Creamos una variable que coja el valor del elemento con el id language-select, esto lo hacemos para seleccionar el idioma
const oldLang = localStorage.getItem("lang"); //Creamos una variable para almacenar el idioma que tenia previamente la pagina, usamos local storage en vez de cookies
if (oldLang) {
  //Condicional al que solo entra si hay un idioma previo guardado, y dice que la primera variable sea el idioma previo
  replaceTexts(oldLang);
  const opcionSeleccionada = langSelect.querySelector(
    `option[value="${oldLang}"]`
  );
  if (opcionSeleccionada) {
    opcionSeleccionada.selected = true;
  }
}else{
  localStorage.setItem("lang", langSelect.value); //Almacena el valor de idioma actual para usarlo al reiniciar la pagina
  replaceTexts(langSelect.value);
}
langSelect.addEventListener("change", function () {
  const newLang = langSelect.value; //Coge el valor que esta en el select y lo usa en la funcion que creamos mas abajo
  localStorage.setItem("lang", newLang); //Almacena el valor de idioma actual para usarlo al reiniciar la pagina
  replaceTexts(newLang);
});

function replaceTexts(lang) {
  document.documentElement.setAttribute("lang", lang);
  document.documentElement.setAttribute("data-lang", lang);
  fetch("../json/textos.json") //Coge los archivos del json
    .then((response) => response.json())
    .then((json) => {
      document.getElementById("ini").textContent = json[lang].ini;
      document.getElementById("pil").textContent = json[lang].pil;
      document.getElementById("rec").textContent = json[lang].rec;
      document.getElementById("form").textContent = json[lang].form;
      document.getElementById("per").textContent = json[lang].per;
      document.getElementById("ent").textContent = json[lang].ent;
      document.getElementById("car").textContent = json[lang].car;
      document.getElementById("con").textContent = json[lang].con;
      document.getElementById("hum").textContent = json[lang].hum;
      if (window.location.pathname === "/index.html") {
        //Con este condicional separamos las distintas paginas, si no las hubieramos separado hubiera dado error, porque hubiera no hubiera encontrado algunos id
        document.getElementById("content").innerHTML = json[lang].content;
        document.getElementById("titIndex").textContent = json[lang].titIndex;
      } else if (
        window.location.pathname === "/Pilotos.html"
      ) {
        document.getElementById("titPil").textContent = json[lang].titPil;
      } else if (
        window.location.pathname === "/Circuitos.html"
      ) {
        document.getElementById("titRec").textContent = json[lang].titRec;
        document.getElementById("tHead").innerHTML = json[lang].tHead;
      } else if (
        window.location.pathname === "/Formulario.html"
      ) {
        document.getElementById("forms2").innerHTML = json[lang].forms2;
        document.getElementById("regis").value = json[lang].regis;
      } else if (
        window.location.pathname === "/Gracias.html"
      ) {
        document.getElementById("thx").textContent = json[lang].thx;
      }
      else{
        document.getElementById("content").innerHTML = json[lang].content;
        document.getElementById("titIndex").textContent = json[lang].titIndex;
      }
    })
    .catch((error) => {
      //Lo ponemos para comprobar que hay un error
      console.log("Error");
    });
}
