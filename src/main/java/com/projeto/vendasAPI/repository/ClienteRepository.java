package com.projeto.vendasAPI.repository;

import com.projeto.vendasAPI.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
