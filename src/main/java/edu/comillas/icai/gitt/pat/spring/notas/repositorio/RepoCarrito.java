package edu.comillas.icai.gitt.pat.spring.notas.repositorio;

import edu.comillas.icai.gitt.pat.spring.notas.entidad.carrito;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface RepoCarrito extends CrudRepository<carrito, Long> {

    @Query(nativeQuery = true,value = "select * from carrito where usuario_id=:usuario")
    carrito getByUsuario(Long usuario);

    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "INSERT INTO carrito (usuario_id, nentradasvip, nentradasnormal,granpremio) VALUES (:usu,:nvip,:ngen,:gp)")
    void anadeCar(Long usu,Long nvip, Long ngen, Long gp);
}
