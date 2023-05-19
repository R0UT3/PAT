package edu.comillas.icai.gitt.pat.spring.notas.servicio;


import edu.comillas.icai.gitt.pat.spring.notas.entidad.carrito;
import edu.comillas.icai.gitt.pat.spring.notas.entidad.contacto;
import edu.comillas.icai.gitt.pat.spring.notas.entidad.grandespremios;
import edu.comillas.icai.gitt.pat.spring.notas.entidad.usuario;
import edu.comillas.icai.gitt.pat.spring.notas.repositorio.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class PackServicios {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    RepoContacto repoContacto;
    @Autowired
    RepoPilotos repoPilotos;
    @Autowired
    RepoCarrito repoCarrito;
    @Autowired
    RepoUsuario repoUsuario;
    @Autowired
    RepoGrandesPremios repoGrandesPremios;
    public void saveMessage(List<String> data){
        repoContacto.anadeCon(data.get(0),data.get(1));
    }
    public void vips(List<String> data){
        repoCarrito.anadeCar(repoUsuario.deElEmail(data.get(3)),Long.valueOf(data.get(1)), Long.valueOf(data.get(2)), Long.valueOf(data.get(0)));
    }
    public usuario registrar(List<String> data){
        logger.info(data.toString());
        usuario usuario1 =new usuario();
        usuario1.email=data.get(1);
        usuario1.nombre=data.get(0);
        usuario1.password= data.get(2);
        repoUsuario.anade(data.get(0),data.get(1),data.get(2));
        return usuario1;
    }
    public carrito getTickets(String email)
    {
        logger.info(email+"getTickets");
        return repoCarrito.getByUsuario(repoUsuario.deElEmail(email));

    }
    public void chPassword(List<String> pass){
        repoUsuario.update(pass.get(0),pass.get(1),pass.get(2));
    }
    public List<grandespremios> carreras(){return repoGrandesPremios.dameTodas();}

}