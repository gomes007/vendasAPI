package com.projeto.vendasAPI.rest.produtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.vendasAPI.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoFormRequest {

    private Long id;
    private String descricao;
    private String nome;
    private BigDecimal preco;
    private String sku;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;


    public Produto toModel(){
        return new Produto(id, nome, descricao, preco, sku, dataCadastro);
    }

    public static ProdutoFormRequest fromModel(Produto produto){
        return new ProdutoFormRequest(produto.getId(), produto.getDescricao(), produto.getNome(), produto.getPreco(), produto.getSku(), produto.getDataCadastro());
    }

}
