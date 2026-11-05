package br.com.fiap.kaue563867.service;

import br.com.fiap.kaue563867.domain.Bairro;
import br.com.fiap.kaue563867.mapper.BairroMapper;
import br.com.fiap.kaue563867.repository.BairroRepository;
import br.com.fiap.kaue563867.web.dto.BairroDTO;
import org.springframework.stereotype.Service;

@Service
public class BairroService {
    private final BairroRepository repo;
    private final BairroMapper mapper;

    public BairroService(BairroRepository repo, BairroMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public BairroDTO salvar(BairroDTO dto) {
        Bairro bairro = mapper.paraEntidade(dto);
        Bairro aux = repo.save(bairro);
        return mapper.paraResposta(aux);
    }

    public BairroDTO pesquisar(Long id) {
        Bairro bairro = repo.findById(id).orElseThrow();
        return mapper.paraResposta(bairro);
    }

    public BairroDTO listar() {
        return repo.findAll().stream().map(bairro -> mapper.paraResposta(bairro)).toList();
    }
}
