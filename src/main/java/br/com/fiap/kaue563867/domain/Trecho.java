package br.com.fiap.kaue563867.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DialectOverride;

@Entity
@Table(name = "GS668_TRECHO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Trecho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "logradouro", nullable = false, length = 120)
    private String logradouro;

    @Column(name = "tipoCalcada ", nullable = false, length = 20)
    private String tipoCalcada;

    @Column(name = "altitude", nullable = false)
    private Integer altitude;

    @Column(name = "bairro_id", nullable = false)
    private Long bairroId;
}
