package br.com.fiap.kaue563867.mapper;

import br.com.fiap.kaue563867.domain.Leitura;
import br.com.fiap.kaue563867.web.dto.LeituraDTO;
import org.springframework.stereotype.Component;

@Component
public class LeituraMapper {
    public Leitura paraEntidade(LeituraDTO dto) {
        Leitura leitura = new Leitura();
        leitura.setId(leitura.getId());
        leitura.setDataHora(dto.dataHora());
        leitura.setLaminaCm(dto.laminaCm());
        leitura.setStatus(dto.status());
        leitura.setTrechoId(dto.TrechoId());
        return leitura;
    }

    public LeituraDTO paraResposta(Leitura leitura) {
        return new LeituraDTO(
                leitura.getId(),
                leitura.getDataHora(),
                leitura.getLaminaCm(),
                leitura.getStatus(),
                leitura.getTrechoId()
        );
    }
}
