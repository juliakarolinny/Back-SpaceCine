import Enums.GeneroFilme;

import java.time.LocalDate;

public class Filme{

    public int Id;
    public String nome;
    public GeneroFilme genero;
    public Double duracao;
    public String idioma;
    public String sinopse;
    public String distribuidora;
    public LocalDate dataestreia;

   //construtor vazio
  // public Filme(){

   //}

//construtor com argumentos
    public Filme(int id, String nome, GeneroFilme genero, Double duracao, String idioma, String sinopse, String distribuidora, LocalDate dataestreia) {
        Id = id;
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.distribuidora = distribuidora;
        this.dataestreia = dataestreia;
    }
}

