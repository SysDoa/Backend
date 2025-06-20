package br.com.sysdoa.sysdoa.app.domain.repositories;

import java.util.List;
import br.com.sysdoa.sysdoa.app.domain.models.CandidateModel;

public interface CandidateRepository {
    public List<CandidateModel> saveAllCandidates(List<CandidateModel> listData);
}