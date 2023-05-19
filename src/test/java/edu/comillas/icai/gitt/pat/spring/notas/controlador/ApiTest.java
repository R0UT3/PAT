package edu.comillas.icai.gitt.pat.spring.notas.controlador;

import edu.comillas.icai.gitt.pat.spring.notas.entidad.carrito;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureTestDatabase
class ApiTest {

    TestRestTemplate restTemplate = new TestRestTemplate(new RestTemplateBuilder().rootUri("http://localhost:8081"));





    @Test
    public void testContacto() {
        // Given ...
        String endpoint = "/api/contacto/";
        List<String> requestData = Arrays.asList("pepe@gmail.com", "MiTextito");

        // When ...
        ResponseEntity<String> response = restTemplate.postForEntity(endpoint, requestData, String.class);

        // Then ...
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("{\"message\": \"ok\"}", response.getBody());
    }

    @Test
    public void testRegistro() {
        // Given ...
        String endpoint = "/api/registrar/";
        List<String> requestData = Arrays.asList("MyName","pepe@gmail.com", "pass");

        // When ...
        ResponseEntity<String> response = restTemplate.postForEntity(endpoint, requestData, String.class);

        // Then ...
        Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }


    @Test
    public void testChPass() {
        // Given ...
        String endpoint = "/api/chPass/";
        List<String> requestData = Arrays.asList("pepe@gmail.com","pepe1234", "NewPass");

        // When ...
        ResponseEntity<String> response = restTemplate.postForEntity(endpoint,requestData, String.class);

        // Then ...
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals("{\"message\": \"siuu\"}", response.getBody());
    }
    @Test
    public void testCarroFromUser() {
        // Given ...
        String email="pepe@gmail.com";
        String endpoint = "/api/carro/"+email;
        // When ...
        ResponseEntity<carrito> response = restTemplate.getForEntity(endpoint, carrito.class);

        // Then ...
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());

    }
}