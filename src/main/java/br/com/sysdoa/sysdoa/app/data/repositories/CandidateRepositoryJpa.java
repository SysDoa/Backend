package br.com.sysdoa.sysdoa.app.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sysdoa.sysdoa.app.domain.models.CandidateModel;

public interface CandidateRepositoryJpa extends JpaRepository<CandidateModel, String> {
}