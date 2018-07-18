package com.jaky.sftp.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class MetricasAjuste implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    @Column(name = "region")
    String region;
    @Column(name = "fecha_corte")
    String fecha_corte;
    @Column(name = "nombre_cat")
    String nombre_cat;
    @Column(name = "name")
    String nombre_reporte;
    @Column(name = "name")
    String categoria;
    @Column(name = "name")
    Double total_registor;
    @Column(name = "name")
    Double total_importe;
    @Column(name = "name")
    String tipo;

}
