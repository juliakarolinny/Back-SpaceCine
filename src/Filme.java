import Enums.GeneroFilme;

import java.time.LocalDate;

public class Filme {

    private int Id;
    private String nome;
    private GeneroFilme genero;
    private Double duracao;
    private String idioma;
    private String sinopse;
    private String distribuidora;
    private LocalDate dataestreia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao < 0) {
            IO.println("duracao não pode ser negativo");
        } else {
            this.duracao = duracao;
        }
    }

    public LocalDate getDataestreia() {
        return dataestreia;
    }

    public void setDataestreia(LocalDate dataestreia) {
        this.dataestreia = dataestreia;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public GeneroFilme getGenero() {
        return genero;
    }

    public void setGenero(GeneroFilme genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSinopse() {
        return sinopse;

    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;

    }

    public String getDistribuidora() {
        return distribuidora;

    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
    //construtor vazio

    public Filme() {
    }

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

