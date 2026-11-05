package br.com.fiap.kaue563867.web.dto;

import java.time.LocalDateTime;

public record LeituraDTO(
        Long id,
        LocalDateTime dataHora,
        Integer laminaCm,
        String status,
        Long TrechoId
) {
}
