package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class produto {

    private Long id;
    private String name;
    private String descricao;
    private BigDecimal preco;
    private LocalDateTime datadeCadastro;
    private Categoria categoria;

    public produto() {
    }

    public produto(Long id, String nome, String descricao, BigDecimal preco, LocalDateTime datadeCadastro, Categoria categoria) {
        this.setId(id);
        this.setName(getName());
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDatadeCadastro(datadeCadastro);
        this.setCategoria(categoria);
    }

    public produto(  String nome, String descricao, BigDecimal preco, LocalDateTime datadeCadastro, Categoria categoria){
        this.setName(getName());
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDatadeCadastro(datadeCadastro);
        this.setCategoria(categoria);
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDateTime getDatadeCadastro() {
        return datadeCadastro;
    }

    public void setDatadeCadastro(LocalDateTime datadeCadastro) {
        this.datadeCadastro = datadeCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        produto produto = (produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}
