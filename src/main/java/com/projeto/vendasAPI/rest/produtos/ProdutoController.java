package com.projeto.vendasAPI.rest.produtos;

import com.projeto.vendasAPI.model.Produto;
import com.projeto.vendasAPI.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {


    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ProdutoFormRequest salvar( @RequestBody ProdutoFormRequest produto ) {

        Produto entidadeProduto = new Produto(
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getSku()
        );

        repository.save(entidadeProduto);

        System.out.println(entidadeProduto);
        return produto;
    }

}
