package br.com.sysdoa.sysdoa.app.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SexEnum {
    Feminino("Feminino"),
    Masculino("Masculino");

    private String sex;
}
