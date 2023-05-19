package edu.comillas.icai.gitt.pat.spring.notas.entidad;

import jakarta.persistence.*;

@Entity
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column() public String nombre;
    @Column() public String email;
    @Column() public String password;

}
