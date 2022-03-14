package Biblioteca.entities;


public class Usuarios {
    private String nome;
    private String email;
    private String senha;
    private int idade;
    private String curso;

    public String getNome() {
        return nome;
    }

    public Usuarios(String nome, String email, String senha, int idade, String curso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuarios() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
    
    
}
