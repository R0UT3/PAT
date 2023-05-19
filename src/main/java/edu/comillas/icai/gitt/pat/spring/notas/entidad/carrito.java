package edu.comillas.icai.gitt.pat.spring.notas.entidad;

import jakarta.persistence.*;

@Entity
public class carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) public Long id;
    @Column() public Long usuarioId;

    @Column() public Long nentradasvip;
    @Column() public Long nentradasnormal;

    @Column() public Long granpremio;


}
