package br.com.sysdoa.sysdoa.app.domain.dtos.details;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.sysdoa.sysdoa.app.domain.enums.BloodTypeEnum;
import br.com.sysdoa.sysdoa.app.domain.enums.SexEnum;
import br.com.sysdoa.sysdoa.app.domain.enums.StateEnum;

public record CandidateDetailDto(
                String id,
                String nome,
                String cpf,
                String rg,
                @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") LocalDate data_nasc,
                SexEnum sexo,
                String mae,
                String pai,
                String email,
                String cep,
                String endereco,
                String numero,
                String bairro,
                String cidade,
                StateEnum estado,
                String telefone_fixo,
                String celular,
                BigDecimal altura,
                BigDecimal peso,
                BloodTypeEnum tipoSanguineo) {
}
