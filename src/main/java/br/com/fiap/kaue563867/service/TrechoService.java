package br.com.fiap.kaue563867.service;

import br.com.fiap.kaue563867.domain.Trecho;
import br.com.fiap.kaue563867.mapper.TrechoMapper;
import br.com.fiap.kaue563867.repository.TrechoRepository;
import br.com.fiap.kaue563867.web.dto.TrechoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrechoService {
    private final TrechoRepository repo;
    private final TrechoMapper mapper;

    public TrechoService(TrechoRepository repo, TrechoMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<TrechoDTO> listar() {
        return repo.findAll().stream().map(trecho -> mapper.paraResposta(trecho)).toList();
    }

    public TrechoDTO incluir(TrechoDTO dto) {
        Trecho trecho = mapper.paraEntidade(dto);
        Trecho aux = repo.save(trecho);
        return mapper.paraResposta(aux);
    }

    public TrechoDTO alterar(TrechoDTO dto, Long id) {
        Trecho trecho = repo.findById(id).orElseThrow();
        trecho.setAltitude(dto.altitude());
        trecho.setLogradouro(dto.logradouro());
        trecho.setTipoCalcada(trecho.getTipoCalcada());
        return mapper.paraResposta(trecho);
    }
}
