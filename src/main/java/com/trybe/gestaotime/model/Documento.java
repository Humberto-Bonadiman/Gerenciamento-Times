package com.trybe.gestaotime.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
  private Long id;
  
  private String cpf;
  private String numeroCateiraTrabalho;
  private String numeroCbf;

  @JoinColumn(name = "jogador_id")
  @OneToOne(fetch = FetchType.LAZY)
  private Jogador jogador;

  public Jogador getJogador() {
    return this.jogador;
  }

  public void setJogador(Jogador jogador) {
    this.jogador = jogador;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNumeroCateiraTrabalho() {
    return this.numeroCateiraTrabalho;
  }

  public void setNumeroCateiraTrabalho(String numeroCateiraTrabalho) {
    this.numeroCateiraTrabalho = numeroCateiraTrabalho;
  }

  public String getNumeroCbf() {
    return this.numeroCbf;
  }

  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }

}
