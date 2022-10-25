package com.projeto.vendasAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String descricao;

    private String nome;

    @Column(name = "preco", precision = 16, scale = 2)
    private BigDecimal preco;

    private String sku;

    @Column(name = "data_cadastro")
    private LocalDate cadastro;


    @PrePersist
    public void prePersist() {
        setCadastro(LocalDate.now());
    }
}
