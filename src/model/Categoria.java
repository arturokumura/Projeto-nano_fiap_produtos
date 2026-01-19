package model;

import java.util.Objects;

public class Categoria {
    private Long id;
    private String name;

    public Categoria() {
    }

    public Categoria(Long id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public Categoria(String name) {
        this.setName(name);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(name, categoria.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name.toUpperCase()
    }
}

