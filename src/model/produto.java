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

        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDatadeCadastro(datadeCadastro);
        this.setCategoria(categoria);
    }

    public produto(  String nome, String descricao, BigDecimal preco, LocalDateTime datadeCadastro, Categoria categoria){

        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDatadeCadastro(datadeCadastro);
        this.setCategoria(categoria);
    }


    public Long getId() {
        return id;
    }

    public produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return name;
    }

    public produto setNome(String nome) {
        this.name = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public LocalDateTime getDatadeCadastro() {
        return datadeCadastro;
    }

    public produto setDatadeCadastro(LocalDateTime datadeCadastro) {
        this.datadeCadastro = datadeCadastro;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public produto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
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
