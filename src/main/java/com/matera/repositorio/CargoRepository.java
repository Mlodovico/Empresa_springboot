package com.matera.repositorio;

import com.matera.cadastro.Cadastro;
import com.matera.cadastro.Cargo;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface CargoRepository extends CrudRepository<Cadastro, Long> {

    List<Cargo> findByCargo(String Cargo);

    ArrayList<String> cargoList = new ArrayList<>();

    cargoList.add("Estagiario");
    cargoList.add("Programador");
    cargoList.add("Diretor");
    cargoList.add("Gerente");


}
