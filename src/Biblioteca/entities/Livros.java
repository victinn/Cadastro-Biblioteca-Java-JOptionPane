package Biblioteca.entities;

public class Livros {
    private String titulo;
    private int paginas;
    private String nomeAutor;
    private String genero;
    private String editora;
    private int anoPublicacao;
    
        
    @Override
    public String toString(){
        return getTitulo();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Livros(String titulo, int paginas, String nomeAutor, String genero, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public Livros() {
    }

}
