package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.dto.Articulo;

public interface IArticuloDAO extends  JpaRepository<Articulo, Integer> {

}
