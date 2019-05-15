package com.matera.repositorio;

import com.matera.cadastro.Cadastro;
import com.matera.cadastro.Departamento;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface DepartamentoRepository extends CrudRepository<Cadastro, Long> {

    List<Departamento> findByDepartamento(String Departamento);

    ArrayList<String> departamentoList = new ArrayList<>();

    departamentoList.add("Estagiario");
    departamentoList.add("Programador");
    departamentoList.add("Diretor");
    departamentoList.add("Gerente");


}