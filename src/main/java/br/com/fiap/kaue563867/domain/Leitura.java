package br.com.fiap.kaue563867.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "GS668_LEITURA")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Leitura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dataHora", nullable = false)
    private LocalDateTime dataHora;

    @Column(name = "laminaCm", nullable = false)
    private Integer laminaCm;

    @Column(name = "status ", nullable = false, length = 10)
    private String status;

    @Column(name = "trecho_id", nullable = false)
    private Long trechoId;
}
