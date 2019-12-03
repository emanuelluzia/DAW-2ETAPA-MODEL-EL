package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @SequenceGenerator(
            name = "seq_usu", 
            sequenceName = "seq_usu_id",
            allocationSize = 1)
    @GeneratedValue(
            generator = "seq_usu", 
            strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotEmpty(message = "O Apelido deve ser informado")
    @Length(max = 20 , message = "O apelido não pode ter mais que {max} caracteres")
    @Column(name = "apelido", length = 20, nullable = false, unique=true)    
    private String Apelido;
    
    @NotEmpty(message = "O nome deve ser informado")
    @Length(max = 20 , message = "O nome não pode ter mais que {max} caracteres")
    @Column(name = "nome", length = 20, nullable = false, unique=true)    
    private String nome;
    
    
    @NotEmpty(message = "A senha deve ser informado")
    @Length(max = 20 , message = "A senha não pode ter mais que {max} caracteres")
    @Column(name = "senha", length = 20, nullable = false)    
    private String senha;
    
   
    
    @NotNull(message = "Informe se o usuário está ativo ou não")
    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    

    
  

    
}