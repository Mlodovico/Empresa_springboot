package com.matera.cadastro;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Cargo implements Serializable {


    @Id
   private int id;
   private String cargo;

    public Cargo(int id, String cargo) {
        this.id = id;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cargo cargo1 = (Cargo) o;

        if (id != cargo1.id) return false;
        return cargo != null ? cargo.equals(cargo1.cargo) : cargo1.cargo == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        return result;
    }
}
