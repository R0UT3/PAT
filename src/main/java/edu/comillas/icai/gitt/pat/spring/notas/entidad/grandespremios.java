package edu.comillas.icai.gitt.pat.spring.notas.entidad;

import jakarta.persistence.*;

@Entity
public class grandespremios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column() public String nombre;
    @Column() public Long ganador;


}
