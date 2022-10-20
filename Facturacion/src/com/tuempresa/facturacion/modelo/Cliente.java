package com.tuempresa.facturacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View(name="Simple",members = "numero, nombre")
@Tab(properties = "nombre, numero, direccion.viaPublica, direccion.codigoPostal")
public class Cliente {

	@Id
	@Column(length = 6)
	int numero;
	
	@Column(length = 50)
	@Required
	String nombre;
	
	@Embedded
	Direccion direccion;
}
