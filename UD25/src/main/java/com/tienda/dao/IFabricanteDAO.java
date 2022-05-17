package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer> {

}
