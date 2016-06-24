package com.ipartek.formacion.AppJava;

/**
 * Clase de tipo POJO para instaciar objetos que representan un candidato
 * Los atributos de un Candidato:
 * <ol>
 * 	 <li>nombre</li>
 * 	 <li>apellido1</li>
 * 	 <li>apellido2</li>
 * 	 <li>dni</li>
 * </ol>
 * 
 */

public class Candidato {
		
	
	//atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;


//     *********ENCAPSULAMOS LOS ATRIBUTOS*******
	
	//***************Encapsulamos el Nombre  (get y set)
/**
 * recuperamos el nombre del objeto
 * @return
 */
	public String getNombre() {
		return nombre;
	}

/**
 * Cambiamos el nombre pasandole un parametro
 * @param nombre <String> cadena de texto con el nombre del Candidato
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//***************Encapsulamos el Apellido1  (get y set)
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	//***************Encapsulamos el Apellido2  (get y set)
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	//***************Encapsulamos el Dni  (get y set)
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//**************constructor para crear objeto
	public Candidato(){
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.dni = "";
	}
}
