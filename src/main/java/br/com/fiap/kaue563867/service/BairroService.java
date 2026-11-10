package br.com.fiap.kaue563867.service;

import br.com.fiap.kaue563867.domain.Bairro;
import br.com.fiap.kaue563867.mapper.BairroMapper;
import br.com.fiap.kaue563867.repository.BairroRepository;
import br.com.fiap.kaue563867.web.dto.BairroDTO;
import br.com.fiap.kaue563867.web.dto.TrechoDTO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BairroService {
    private final BairroRepository repo;
    private final BairroMapper mapper;

    public BairroService(BairroRepository repo, BairroMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<BairroDTO> listar() {
        return repo.findAll().stream().map(bairro -> mapper.paraResposta(bairro)).toList();
    }

    @Transactional
    public BairroDTO incluir(BairroDTO dto) {
        Bairro bairro = mapper.paraEntidade(dto);
        Bairro aux = repo.save(bairro);
        return mapper.paraResposta(aux);
    }

    @Transactional
    public BairroDTO alterar(BairroDTO dto, Long id) {
        Bairro bairro = repo.findById(id).orElseThrow();
        bairro.setNome(dto.nome());
        bairro.setZona(dto.zona());
        bairro.setPossuiPiscinao(dto.possuiPiscinao());
        return mapper.paraResposta(bairro);
    }

    @Transactional
    public void excluir(Long id) {
        repo.deleteById(id);
    }
}
