import java.time.LocalDate;

public class Cartaz {
    public String titulo;
    public String imagem;
    public Integer Classificacao;
    public LocalDate estreia;
    public String genero;
    public Integer duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Integer getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        Classificacao = classificacao;
    }

    public LocalDate getEstreia() {
        return estreia;
    }

    public void setEstreia(LocalDate estreia) {
        this.estreia = estreia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
}
