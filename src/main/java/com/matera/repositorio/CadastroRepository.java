package com.matera.repositorio;

import com.matera.cadastro.Cadastro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CadastroRepository extends CrudRepository<Cadastro, Long> {

    List<Cadastro> findById(int id);



}
