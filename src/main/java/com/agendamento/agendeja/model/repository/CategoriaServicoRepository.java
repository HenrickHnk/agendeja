package com.agendamento.agendeja.model.repository;

import com.agendamento.agendeja.model.entity.CategoriaServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaServicoRepository extends JpaRepository<CategoriaServico, Long> {

}
