package com.loja.api.domain.aplicativo;

import com.loja.api.domain.categoria.Categoria;
import com.loja.api.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "aplicativo")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Aplicativo {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String descricao;
    private Double preco;
    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Categoria categoria_id;
    @OneToOne
    @JoinColumn(name = "usuario_id_dono")
    private Usuario usuario_id_dono;
}
