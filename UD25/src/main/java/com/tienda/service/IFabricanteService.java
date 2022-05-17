package com.tienda.service;

import java.util.List;

import com.tienda.dto.Fabricante;

public interface IFabricanteService {
	
	//Metodos del CRUD
	public List<Fabricante> listarFabricantes(); //Listar All 
	
	public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
	
	public Fabricante fabricanteXID(int id); //Leer datos de un fabricante READ
	
	public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
	
	public void eliminarFabricante(int id);// Elimina el fabricante DELETE

}
