import Enums.Genero;

import java.time.LocalDate;

public class Usuario {
    public String nomeCompleto;
    public String nomeSocial;
    public String Senha;
    public LocalDate dataNascimento;
    public String Cpf;
    public Genero genero;
    public String Email;
    public String Telefone;
    public Integer Id;
    public String Cep;

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

