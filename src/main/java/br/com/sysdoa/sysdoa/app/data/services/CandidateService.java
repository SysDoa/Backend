package br.com.sysdoa.sysdoa.app.data.services;
import java.util.List;

import br.com.sysdoa.sysdoa.app.domain.dtos.details.CandidateDetailDto;
import br.com.sysdoa.sysdoa.app.domain.dtos.save.CandidateSaveDto;

public interface CandidateService {
    public List<CandidateDetailDto> saveAllCandidates(List<CandidateSaveDto> dataList);
}
