package br.com.fiap.kaue563867.service;

import br.com.fiap.kaue563867.domain.Leitura;
import br.com.fiap.kaue563867.mapper.LeituraMapper;
import br.com.fiap.kaue563867.repository.LeituraRepository;
import br.com.fiap.kaue563867.web.dto.LeituraDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeituraService {
    private final LeituraRepository repo;
    private final LeituraMapper mapper;

    public LeituraService(LeituraRepository repo, LeituraMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<LeituraDTO> listar() {
        return repo.findAll().stream().map(leitura -> mapper.paraResposta(leitura)).toList();
    }

    public void deletar(Long id) {
        repo.deleteById(id);
    }

    public LeituraDTO incluir(LeituraDTO dto) {
        Leitura leitura = mapper.paraEntidade(dto);
        Leitura aux = repo.save(leitura);
        return mapper.paraResposta(aux);
    }

    public LeituraDTO alterar(LeituraDTO dto, Long id) {
        Leitura leitura = repo.findById(id).orElseThrow();
        leitura.setDataHora(dto.dataHora());
        leitura.setLaminaCm(dto.laminaCm());
        leitura.setStatus(dto.status());
        leitura.setTrechoId(dto.TrechoId());
        return mapper.paraResposta(leitura);
    }
}
