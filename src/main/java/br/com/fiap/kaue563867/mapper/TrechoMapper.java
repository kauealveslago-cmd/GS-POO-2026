package br.com.fiap.kaue563867.mapper;

import br.com.fiap.kaue563867.domain.Trecho;
import br.com.fiap.kaue563867.web.dto.TrechoDTO;
import org.springframework.stereotype.Component;

@Component
public class TrechoMapper {
    public Trecho paraEntidade(TrechoDTO dto) {
        Trecho trecho = new Trecho();
        trecho.setId(dto.id());
        trecho.setLogradouro(dto.logradouro());
        trecho.setTipoCalcada(dto.tipoCalcada());
        trecho.setAltitude(dto.altitude());
        trecho.setBairroId(dto.bairroId());
        return trecho;
    }

    public TrechoDTO paraResposta(Trecho trecho) {
        return new TrechoDTO(
                trecho.getId(),
                trecho.getLogradouro(),
                trecho.getTipoCalcada(),
                trecho.getAltitude(),
                trecho.getBairroId()
        );
    }
}
