package com.api_senai.api.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "contas")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numero;
    private double saldo;

    @OneToOne
    @JoinColumn
    Cliente cliente;

    @OneToMany(mappedBy = "origem")
    private List<Operacao> operacoesOrigem;

    @OneToMany(mappedBy = "destino")
    private List<Operacao> operacoesDestino;
}