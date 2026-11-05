package br.com.fiap.kaue563867.mapper;

import br.com.fiap.kaue563867.domain.Bairro;
import br.com.fiap.kaue563867.web.dto.BairroDTO;
import org.springframework.stereotype.Component;

@Component
public class BairroMapper {
    public Bairro paraEntidade(BairroDTO dto) {
        Bairro bairro = new Bairro();
        bairro.setId(dto.id());
        bairro.setNome(dto.nome());
        bairro.setZona(dto.zona());
        bairro.setPossuiPiscinao(dto.possuiPiscinao());
        return bairro;
    }

    public BairroDTO paraResposta(Bairro bairro) {
        return new BairroDTO(
                bairro.getId(),
                bairro.getNome(),
                bairro.getZona(),
                bairro.getPossuiPiscinao()
        );
    }
}
