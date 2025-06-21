package br.com.sysdoa.sysdoa.app.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sysdoa.sysdoa.app.data.services.CandidateService;
import br.com.sysdoa.sysdoa.app.domain.dtos.details.CandidateDetailDto;
import br.com.sysdoa.sysdoa.app.domain.dtos.save.CandidateSaveDto;
import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/candidate")
@AllArgsConstructor
public class CandidateController {
    private final CandidateService candidateService;

    @PostMapping("/register")
    public List<CandidateDetailDto> saveAllCandidates(@RequestBody List<CandidateSaveDto> dataList) {
        return candidateService.saveAllCandidates(dataList);
    }

}
