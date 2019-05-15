package com.matera.endpoint;


import com.matera.Service.ServiceCadastro;
import com.matera.cadastro.Cadastro;
import com.matera.repositorio.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("cadastro")

public class CadastroController {

    private final CadastroRepository cadastroDAO;

    @Autowired
    private ServiceCadastro serviceCadastro;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List findAll() {
        return (List) cadastroDAO.findAll();
    }

    public CadastroController(CadastroRepository cadastroRepository) {
        this.cadastroDAO = cadastroRepository;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Optional<Cadastro> findOne(@PathVariable Long id) {
        return cadastroDAO.findById(id);
    }


    @PostMapping
    private void save(@RequestBody Cadastro cadastro){

        serviceCadastro.save(cadastro);

    }
}



