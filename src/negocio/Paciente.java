/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.util.Date;

/**
 *
 * @author cpl.5614124135
 */
public class Paciente {
    
    private String nome;
    private String nomeMae;
    private Date dataNascimento;
    private String estadoCivil;
    private String cor;
    private String telefone;
    private String prontuario;

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getCor() {
        return cor;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
    
    
}
