package com.loja.api.domain.transacoes;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "Transacoes")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Transacoes {
    @Id
    @GeneratedValue
    private UUID id;
    private Date data_compra;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_pagamento", nullable = false)
    private Status statusPagamento;

    // Método para definir valor padrão
    @PrePersist
    protected void onPrePersist() {
        if (this.statusPagamento == null) {
            this.statusPagamento = Status.PENDENTE;
        }
    }
}
