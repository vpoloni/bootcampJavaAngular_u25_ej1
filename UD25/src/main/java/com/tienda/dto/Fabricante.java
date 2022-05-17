package com.tienda.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tienda.dto.Articulo;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricantes")//en caso que la tabla sea diferente
public class Fabricante {
	

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;

	
    @OneToMany
    @JoinColumn(name="id")
    private List<Articulo> articulo;
	
	//Constructores
	
	public Fabricante() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Fabricante(int id, String nombre) {
		//super();
		this.id = id;
		this.nombre = nombre;

	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}

	/**
	 * @param video the video to set
	 */
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}

	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + ", articulo=" + articulo + "]";
	}
	
	

}
