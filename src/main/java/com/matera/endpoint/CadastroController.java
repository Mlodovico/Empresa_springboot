package com.matera.endpoint;

import com.matera.cadastro.Cadastro;
import com.matera.error.CustomErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sun.util.resources.sr.CalendarData_sr;

import java.time.LocalDateTime;

@RestController
@RequestMapping("cadastro")

public class CadastroController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listAll() {

        return new ResponseEntity<>(Cadastro.listaCadastro, HttpStatus.OK);

    }

    @RequestMapping(method = RequestMethod.GET, path = "(/nome)")
    public ResponseEntity<?> getStudentById(@PathVariable("nome") String nome) {

        Cadastro cadastro = new Cadastro();
        cadastro.setNome(nome);
        int index = Cadastro.listaCadastro.indexOf(cadastro);
        if (index == -1)

            return new ResponseEntity<>(new CustomErrorType("Cadastro ñ existe"), HttpStatus.NOT_FOUND);
            return new ResponseEntity<>(cadastro.listaCadastro.get(index), HttpStatus.OK);


    }
//    @GetMapping("/{nome}")
//    public ResponseEntity()

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Cadastro cadastro) {

        Cadastro.listaCadastro.add(cadastro);
        return new ResponseEntity<>(cadastro, HttpStatus.OK);


    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@RequestBody Cadastro cadastro) {

        Cadastro.listaCadastro.remove(cadastro);
        return new ResponseEntity<>(cadastro, HttpStatus.OK);


    }
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Cadastro cadastro) {

        Cadastro.listaCadastro.remove(cadastro);
        Cadastro.listaCadastro.add(cadastro);
        return new ResponseEntity<>(cadastro, HttpStatus.OK);
    }
}