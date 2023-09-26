package com.MicroserviciosTFG.GestorPersonal.entity;


import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;


@Table(name="personalBD")
@SpringBootApplication
@Getter
@Setter
@NoArgsConstructor
public class PersonalEntity {

	@Id
	private Integer id;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String fechaAlta;
	private String fechaBaja;
	private String numeroSS;
	private String email;
	private String numTelefono;
	private String direccion;
	private String personaContacto;
	private String numTelfPersonaContacto;
}
