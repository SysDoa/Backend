package br.com.sysdoa.sysdoa.app.data.services;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.com.sysdoa.sysdoa.app.domain.dtos.details.CandidateDetailDto;
import br.com.sysdoa.sysdoa.app.domain.dtos.save.CandidateSaveDto;
import br.com.sysdoa.sysdoa.app.domain.mappers.CandidateMapper;
import br.com.sysdoa.sysdoa.app.domain.repositories.CandidateRepository;
import br.com.sysdoa.sysdoa.infra.constants.ExceptionMessageConstant;
import br.com.sysdoa.sysdoa.infra.exceptions.DomainException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;
    private final CandidateMapper candidateMapper;

    @SuppressWarnings("null")
    @Override
    public List<CandidateDetailDto> saveAllCandidates(List<CandidateSaveDto> dataList) {
        try {
            return candidateMapper.toListDetailDto(candidateRepository.saveAllCandidates(candidateMapper.toListEntity(dataList)));
        } catch (DataIntegrityViolationException e) {
            throw new DomainException(ExceptionMessageConstant.errorDataBase + e.getRootCause().getMessage());
        }catch (Exception e) {
            throw new DomainException(ExceptionMessageConstant.errorSave + e.getMessage());
        }
    }

}
