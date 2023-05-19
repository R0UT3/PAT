package edu.comillas.icai.gitt.pat.spring.notas.repositorio;

import edu.comillas.icai.gitt.pat.spring.notas.entidad.usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepoUsuario extends CrudRepository<usuario, Long> {

    @Query(nativeQuery = true,value = "select id from usuario where email=:email")
    Long deElEmail(String email);
    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "INSERT INTO usuario (nombre, email, password) VALUES (:nombre,:email,:password)")
    void anade(String nombre,String email,String password);
    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "update usuario set password=:pass where email=:email and password=:passOld")
    void update(String email,String pass,String passOld);
}
