package com.projeto.vendasAPI.rest.produtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoFormRequest {

    private String descricao;
    private String nome;
    private BigDecimal preco;
    private String sku;

}
