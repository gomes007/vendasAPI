package com.projeto.vendasAPI.model.repository;

import com.projeto.vendasAPI.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
