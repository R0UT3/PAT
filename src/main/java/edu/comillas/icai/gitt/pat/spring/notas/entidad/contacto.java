package edu.comillas.icai.gitt.pat.spring.notas.entidad;

import jakarta.persistence.*;

@Entity
public class contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column() public String email;
    @Column() public String texto;


}
