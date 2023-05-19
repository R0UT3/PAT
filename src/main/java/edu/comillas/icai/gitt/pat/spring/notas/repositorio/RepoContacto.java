package edu.comillas.icai.gitt.pat.spring.notas.repositorio;

import edu.comillas.icai.gitt.pat.spring.notas.entidad.contacto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepoContacto extends CrudRepository<contacto, Long> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "INSERT INTO contacto (email,texto) VALUES (:email,:texto)")
    void anadeCon(String email,String texto);
}
