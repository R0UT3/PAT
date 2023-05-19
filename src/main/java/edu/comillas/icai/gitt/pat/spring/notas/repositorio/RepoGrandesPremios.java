package edu.comillas.icai.gitt.pat.spring.notas.repositorio;

import edu.comillas.icai.gitt.pat.spring.notas.entidad.grandespremios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoGrandesPremios extends CrudRepository<grandespremios, Long> {

    @Query(nativeQuery = true,value = "select * from grandespremios")
    List<grandespremios> dameTodas();
}
