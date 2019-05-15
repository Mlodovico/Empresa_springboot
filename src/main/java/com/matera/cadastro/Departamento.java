package com.matera.cadastro;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Departamento implements Serializable{


    @Id
    private int id;
    private String departamento;

    public Departamento(int id, String departamento) {
        this.id = id;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departamento that = (Departamento) o;

        if (id != that.id) return false;
        return departamento != null ? departamento.equals(that.departamento) : that.departamento == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        return result;
    }
}
