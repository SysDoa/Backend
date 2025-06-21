package br.com.sysdoa.sysdoa.app.data.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.sysdoa.sysdoa.app.domain.models.CandidateModel;
import br.com.sysdoa.sysdoa.app.domain.repositories.CandidateRepository;
import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CandidateRepositoryImpl implements CandidateRepository {

    private final CandidateRepositoryJpa candidateRepositoryJpa;

    @Override
    public List<CandidateModel> saveAllCandidates(List<CandidateModel> listData) {
        return candidateRepositoryJpa.saveAll(listData);
    }

}
