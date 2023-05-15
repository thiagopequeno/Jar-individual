/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jar.individual;

/**
 *
 * @author thiag
 */
public class Usuario {
    private Integer idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String cargo;

    public Usuario(Integer id, String email, String senha) {
        this.idUsuario = id;
        this.email = email;
        this.senha = senha;
    }


    public Usuario() {
        
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "id=" + idUsuario + ", email=" + email + ", senha=" + senha + '}';
    }


    public Integer getId() {
        return idUsuario;
    }

    public void setId(Integer id) {
        this.idUsuario = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
