package br.edu.ifsuldeminas.tarefas2.domain;

public class Category {
    private Integer id;
    private  String nome;

    public Category(int id,String nome){
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
