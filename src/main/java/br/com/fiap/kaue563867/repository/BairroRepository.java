package br.com.fiap.kaue563867.repository;

import br.com.fiap.kaue563867.domain.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BairroRepository extends JpaRepository<Bairro, Long> {
    List<Bairro> findAllByOrderByNomeAsc();
}
