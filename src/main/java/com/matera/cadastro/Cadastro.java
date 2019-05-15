package com.matera.cadastro;


import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Cadastro extends AbstractEntity {

    @NotNull
    @Size(min = 4, max = 18)
    private String nome;

    @NotNull
    @Size(min = 4, max = 18)
    private String sobrenome;

    @NotNull
    @Size(min = 10, max = 30)
    @Email(message = "Insira o e-mail")
    private String email;

    @NotNull
    @Size(min = 3, max = 5)
    private double salario;

    @NotNull
    @Size(min = 8, max = 20)
    private int numeroDeDependentes;

    @NotNull
    private Cargo cargo;

    @NotNull
    private Departamento departamento;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
