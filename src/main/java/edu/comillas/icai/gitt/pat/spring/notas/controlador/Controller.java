package edu.comillas.icai.gitt.pat.spring.notas.controlador;

import edu.comillas.icai.gitt.pat.spring.notas.entidad.carrito;
import edu.comillas.icai.gitt.pat.spring.notas.entidad.grandespremios;
import edu.comillas.icai.gitt.pat.spring.notas.entidad.usuario;
import edu.comillas.icai.gitt.pat.spring.notas.servicio.PackServicios;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    PackServicios service;

    @GetMapping(
            path = "/api/carreras/",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<grandespremios> allCarreras() {
        return service.carreras();
    }
    @PostMapping(path = "/api/contacto/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> saveMessage(@RequestBody List<String> data) {
        service.saveMessage(data);
        return ResponseEntity.ok().body("{\"message\": \"ok\"}");
    }
    @PostMapping(path = "/api/comprar/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> anadir(@RequestBody List<String> data) {
        service.vips(data);
        return ResponseEntity.ok().body("{\"message\": \"klk\"}");
    }

    @PostMapping(path = "/api/registrar/")
    @ResponseStatus(HttpStatus.CREATED)
    public usuario regis(@RequestBody List<String> data) {
        return service.registrar(data);
    }

    @PostMapping(path = "/api/chPass/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> chPass(@RequestBody List<String> pass) {
        service.chPassword(pass);
        return ResponseEntity.ok().body("{\"message\": \"siuu\"}");
    }

    @GetMapping(
            path = "/api/carro/{email}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public carrito getTicks(@PathVariable String email) {
        logger.info(email);
        return service.getTickets(email);
    }

}

