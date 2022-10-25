package com.projeto.vendasAPI.rest.produtos;

import com.projeto.vendasAPI.model.Produto;
import com.projeto.vendasAPI.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {


    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto register(@RequestBody final Produto produto) {
        return this.service.save(produto);
    }

    @GetMapping
    public ResponseEntity<?> getLista(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto getById(@PathVariable("id") long id) {
        return this.service.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto atualizar(@PathVariable("id") long id, @RequestBody final Produto produto) {
        this.service.produtoExists(id);

        produto.setId(id);

        return this.service.save(produto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto delete(@PathVariable("id") long id) {
        return this.service.deleteById(id);
    }


}
