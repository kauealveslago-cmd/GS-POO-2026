package br.com.fiap.kaue563867.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "GS668_BAIRRO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 80)
    private String nome;

    @Column(name = "zona", nullable = false, length = 10)
    private String zona;

    @Column(name = "possuiPiscinao", length = 1)
    private Integer possuiPiscinao;
}
