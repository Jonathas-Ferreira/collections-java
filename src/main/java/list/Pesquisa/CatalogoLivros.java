package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //atributos

    private List<Livro> livroList;

    //Constructor
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Adicionando livro ao catálogo
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisar por Autor - metódo
    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
//Pesquisar por intervalo de ano - metódo

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalAnos.add(l);
                }
            }
        }
        return livrosPorIntervalAnos;
    }

//Pesquisar livro por título

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
// Criação do metódo main para rodar os testes
    public static void main(String[] args){
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
    catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
    catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
    catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
    catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
    //Imprimir, print o resultado da pesquisa
    System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));
    System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}
