package com.matera.Service;


import com.matera.cadastro.Cadastro;
import com.matera.error.CustomErrorType;
import com.matera.repositorio.CadastroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceCadastro {

    private CadastroRepository cadastroDAO;

    public ServiceCadastro(CadastroRepository cadastroRepository) {
        this.cadastroDAO = cadastroRepository;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {

        return new ResponseEntity<>(cadastroDAO.findAll(), HttpStatus.OK);

    }

    @RequestMapping(path = "(/id)")
    public ResponseEntity<?> findById(@PathVariable("id") long id) {

        Optional<Cadastro> cadastro = cadastroDAO.findById(id);

        if (cadastro == null)

            return new ResponseEntity<>(new CustomErrorType("Cadastro ñ existe"), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(cadastro, HttpStatus.OK);


    }

    @PostMapping//parte da aplicação para salvar os cadastros
    public ResponseEntity<?> save(@RequestBody Cadastro cadastro) {

        return new ResponseEntity<>(cadastroDAO.save(cadastro), HttpStatus.OK);

    }

    @DeleteMapping(path = "/{id}")//metodo para deletar cadastros
    public ResponseEntity<?> delete(@PathVariable Long id) {
        cadastroDAO.deleteById(id);

        return new ResponseEntity<>(HttpStatus.OK);


    }

    @PutMapping

    public ResponseEntity<?> update(@RequestBody Cadastro cadastro) {

        cadastroDAO.save(cadastro);

        return new ResponseEntity<>(HttpStatus.OK);
    }



}



