package com.loja.api.domain.avaliacoes;

import com.loja.api.domain.aplicativo.Aplicativo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "avaliacoes")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class avaliacoes {
    @Id
    @GeneratedValue
    private UUID id;
    private Integer classificacao;
    private String comentario;
    private Date data_avaliacao;
    @OneToOne
    @JoinColumn(name = "aplicativo_id")
    private Aplicativo aplicativo_id;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Aplicativo usuario_id;
}
