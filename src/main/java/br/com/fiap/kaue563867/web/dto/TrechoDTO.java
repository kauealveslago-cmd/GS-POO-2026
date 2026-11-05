package br.com.fiap.kaue563867.web.dto;

import br.com.fiap.kaue563867.domain.Bairro;

public record TrechoDTO(
        Long id,
        String logradouro,
        String tipoCalcada,
        Integer altitude,
        Long bairroId
) {
}
