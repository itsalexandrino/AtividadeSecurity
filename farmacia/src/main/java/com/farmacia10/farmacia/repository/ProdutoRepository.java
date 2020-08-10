package com.farmacia10.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia10.farmacia.model.Produto;



public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

}
