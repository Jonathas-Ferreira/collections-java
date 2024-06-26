package main.java.list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;

    private String autor;

    private int anoPublicacao;

    //Constructor
    public Livro(String titulo, String autor, int   anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //Getters e Setters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao(){
        return  anoPublicacao;
    }

    // Sobrescrever para não aparecer o endereço de memória
    @Override
    public String toString(){
        return "Livro{" +
                "titulo='" + titulo + "\'" +
                "autor='" + autor + "\'"+
                "anopublicacao='" + anoPublicacao + "\'"
                + '}';
    }
}
