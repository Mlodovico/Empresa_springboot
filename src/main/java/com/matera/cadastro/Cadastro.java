package com.matera.cadastro;


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Cadastro {

    public static List<Cadastro>listaCadastro;

    private String nome;
    private String sobrenome;
    private double salario;
    private int numeroDeDependentes;
    private String cargo;
    private String departamento;

    public Cadastro(String nome, String sobrenome, double salario, int numeroDeDependentes, String cargo, String departamento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.numeroDeDependentes = numeroDeDependentes;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Cadastro(){

    }


    public static void repositorioCadastro(){

    listaCadastro = new ArrayList<>(asList(new Cadastro()));

    }


    public static List<Cadastro> getListaCadastro() {
        return listaCadastro;
    }

    public static void setListaCadastro(List<Cadastro> listaCadastro) {
        Cadastro.listaCadastro = listaCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
