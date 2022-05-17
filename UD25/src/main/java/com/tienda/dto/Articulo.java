package com.tienda.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tienda.dto.Fabricante;

@Entity
@Table(name="articulos")//en caso que la tabla sea diferente
public class Articulo {
	
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="fabricante_id")
    private Fabricante fabricante_id;

	//Constructores
	/**
	 * 
	 */
	public Articulo() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param fabricante_id
	 */
	public Articulo(int id, String nombre, int precio, Fabricante fabricante_id) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante_id = fabricante_id;
	}
	
	//Getters & Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	public Fabricante getFabricante() {
		return fabricante_id;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante_id = fabricante;
	}
	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante_id + "]";
	}






	
	
	



	
	

	
	
	

}
