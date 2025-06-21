package br.com.sysdoa.sysdoa.app.domain.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.sysdoa.sysdoa.app.domain.dtos.details.CandidateDetailDto;
import br.com.sysdoa.sysdoa.app.domain.dtos.save.CandidateSaveDto;
import br.com.sysdoa.sysdoa.app.domain.models.CandidateModel;

@Component
public class CandidateMapper {
    public CandidateSaveDto toDto(CandidateModel candidateModel) {
        if (candidateModel == null) {
            return null;
        }
        return new CandidateSaveDto(candidateModel.getId(), candidateModel.getNome(), candidateModel.getCpf(),
                candidateModel.getRg(), candidateModel.getData_nasc(), candidateModel.getSexo(),
                candidateModel.getMae(), candidateModel.getPai(), candidateModel.getEmail(), candidateModel.getCep(),
                candidateModel.getEndereco(), candidateModel.getNumero(), candidateModel.getBairro(),
                candidateModel.getCidade(), candidateModel.getEstado(), candidateModel.getTelefone_fixo(),
                candidateModel.getCelular(), candidateModel.getAltura(), candidateModel.getPeso(),
                candidateModel.getTipoSanguineo());
    }

    public CandidateModel toEntity(CandidateSaveDto saveCadidatesDto) {
        if (saveCadidatesDto == null) {
            return null;
        }

        CandidateModel candidateModel = new CandidateModel();

        if (saveCadidatesDto.id() != null) {
            candidateModel.setId(saveCadidatesDto.id());
        }

        candidateModel.setNome(saveCadidatesDto.nome());
        candidateModel.setCpf(saveCadidatesDto.cpf());
        candidateModel.setRg(saveCadidatesDto.rg());
        candidateModel.setPai(saveCadidatesDto.pai());
        candidateModel.setMae(saveCadidatesDto.mae());
        candidateModel.setCep(saveCadidatesDto.cep());
        candidateModel.setCidade(saveCadidatesDto.cidade());
        candidateModel.setAltura(saveCadidatesDto.altura());
        candidateModel.setPeso(saveCadidatesDto.peso());
        candidateModel.setNumero(saveCadidatesDto.numero());
        candidateModel.setData_nasc(saveCadidatesDto.data_nasc());
        candidateModel.setSexo(saveCadidatesDto.sexo());
        candidateModel.setTelefone_fixo(saveCadidatesDto.telefone_fixo());
        candidateModel.setCelular(saveCadidatesDto.celular());
        candidateModel.setEstado(saveCadidatesDto.estado());
        candidateModel.setBairro(saveCadidatesDto.bairro());
        candidateModel.setTipoSanguineo(saveCadidatesDto.tipo_sanguineo());
        candidateModel.setEmail(saveCadidatesDto.email());
        candidateModel.setEndereco(saveCadidatesDto.endereco());

        return candidateModel;
    }

    public List<CandidateModel> toListEntity(List<CandidateSaveDto> cadidateSaveDtoList) {
        if (cadidateSaveDtoList == null) {
            return null;
        }
        return cadidateSaveDtoList.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    public CandidateDetailDto toDetailDto(CandidateModel candidateModel) {
        if (candidateModel == null)
            return null;

        return new CandidateDetailDto(
                candidateModel.getId(),
                candidateModel.getNome(),
                candidateModel.getCpf(),
                candidateModel.getRg(),
                candidateModel.getData_nasc(),
                candidateModel.getSexo(),
                candidateModel.getMae(),
                candidateModel.getPai(),
                candidateModel.getEmail(),
                candidateModel.getCep(),
                candidateModel.getEndereco(),
                candidateModel.getNumero(),
                candidateModel.getBairro(),
                candidateModel.getCidade(),
                candidateModel.getEstado(),
                candidateModel.getTelefone_fixo(),
                candidateModel.getCelular(),
                candidateModel.getAltura(),
                candidateModel.getPeso(),
                candidateModel.getTipoSanguineo());
    }

    public List<CandidateDetailDto> toListDetailDto(List<CandidateModel> candidates) {
        if (candidates == null)
            return null;

        return candidates.stream()
                .map(this::toDetailDto)
                .collect(Collectors.toList());
    }

}
