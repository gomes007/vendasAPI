package com.projeto.vendasAPI.service;

import com.projeto.vendasAPI.exceptions.NotFoundException;
import com.projeto.vendasAPI.model.Produto;
import com.projeto.vendasAPI.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }


    public Produto save(final Produto produto) {

        return this.repository.save(produto);
    }

    public List<Produto> findAll(){
        return repository.findAll();
    }


    public Produto findById(final Long id) {
        return this.repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("employee not found"));
    }

    public void produtoExists(final Long id) {
        this.findById(id);
    }

    public Produto deleteById(final Long id) {
        final Produto found = this.findById(id);

        this.repository.delete(found);

        return found;
    }


}
