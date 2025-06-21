package br.com.sysdoa.sysdoa.app.domain.dtos.save;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import br.com.sysdoa.sysdoa.app.domain.enums.BloodTypeEnum;
import br.com.sysdoa.sysdoa.app.domain.enums.SexEnum;
import br.com.sysdoa.sysdoa.app.domain.enums.StateEnum;
import br.com.sysdoa.sysdoa.infra.serial.DateDeserializerSerial;
import br.com.sysdoa.sysdoa.infra.validations.GroupValidation;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CandidateSaveDto(
        String id,
        @NotBlank(groups = GroupValidation.Create.class) @Size(max = 255) String nome,

        @NotBlank(groups = GroupValidation.Create.class) @Size(min = 14, max = 14) String cpf,

        @Size(min = 12, max = 12) String rg,

        @NotNull  @JsonDeserialize(using = DateDeserializerSerial.class) LocalDate data_nasc,

        @NotNull SexEnum sexo,

        String mae,
        String pai,

        @Email @NotBlank String email,

        @NotBlank @Size(min = 9, max = 9) String cep,

        @NotBlank String endereco,

        @NotBlank @Size(max = 10) String numero,

        @NotBlank String bairro,

        @NotBlank String cidade,

        @NotNull StateEnum estado,

        @Size(max = 14, min = 14) String telefone_fixo,

        @NotBlank @Size(max = 15, min = 15) String celular,

        @NotNull @Digits(integer = 1, fraction = 2) BigDecimal altura,

        @NotNull @Digits(integer = 3, fraction = 2) BigDecimal peso,

        @NotNull BloodTypeEnum tipo_sanguineo) {

}
