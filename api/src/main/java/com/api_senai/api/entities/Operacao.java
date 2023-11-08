package com.api_senai.api.entities;

import java.time.LocalDateTime;

import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

    @Data
    @Entity
    @Table(name="operacoes")

    public class Operacao {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String tipo;
        private double valor;
        private LocalDateTime data;

        @ManyToOne
        @JoinColumn
        private Conta origem;

        @ManyToOne
        @JoinColumn
        private Conta destino;

    
}
