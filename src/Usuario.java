import Enums.Genero;

import java.time.LocalDate;

public class Usuario {
    private String nomeCompleto;
    private String nomeSocial;
    private String Senha;
    private LocalDate dataNascimento;
    private String Cpf;
    private Genero genero;
    private String Email;
    private String Telefone;
    private Integer Id;
    private String Cep;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public Integer getId() {
        return Id;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getCep() {
        return Cep;
    }
    public void setCep(String cep) {
        Cep = cep;
    }

    public void setId(Integer id) {
        Id = id;
    }



    public Usuario(String nomeCompleto, String nomeSocial, String senha, LocalDate dataNascimento, String cpf, Genero genero, String email, String telefone, Integer id, String cep) {
        this.nomeCompleto = nomeCompleto;
        this.nomeSocial = nomeSocial;
        Senha = senha;
        this.dataNascimento = dataNascimento;
        Cpf = cpf;
        this.genero = genero;
        Email = email;
        Telefone = telefone;
        Id = id;
        Cep = cep;
    }


}

