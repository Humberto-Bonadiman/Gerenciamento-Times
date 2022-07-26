package com.trybe.gestaotime.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe Documento.
 */
@Entity
public class Documento {
  /**
   * Atributos.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  
  private String cpf;
  private String numeroCateiraTrabalho;
  private String numeroCbf;

  @OneToOne(
      mappedBy = "documento",
      cascade = CascadeType.ALL,
      orphanRemoval = true,
      fetch = FetchType.LAZY
  )
  private Jogador jogador;

  public Jogador getJogador() {
    return this.jogador;
  }

  public void setJogador(Jogador jogador) {
    this.jogador = jogador;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNumeroCarteiraTrabalho() {
    return this.numeroCateiraTrabalho;
  }

  public void setNumeroCarteiraTrabalho(String numeroCateiraTrabalho) {
    this.numeroCateiraTrabalho = numeroCateiraTrabalho;
  }

  public String getNumeroCbf() {
    return this.numeroCbf;
  }

  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }

}
