package br.com.sysdoa.sysdoa.app.domain.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import br.com.sysdoa.sysdoa.app.domain.enums.BloodTypeEnum;
import br.com.sysdoa.sysdoa.app.domain.enums.SexEnum;
import br.com.sysdoa.sysdoa.app.domain.enums.StateEnum;
import br.com.sysdoa.sysdoa.infra.serial.DateDeserializerSerial;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "candidato")
@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CandidateModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    @Column(name = "id_candidato")
    private String id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(name = "rg", length = 12, unique = true)
    private String rg;

    @JsonDeserialize(using = DateDeserializerSerial.class)
    @Column(name = "data_nasc", nullable = false, length = 10)
    private LocalDate data_nasc;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    private SexEnum sexo;

    @Column(name = "mae")
    private String mae;

    @Column(name = "pai")
    private String pai;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;

    @Column(name = "endereco", nullable = false, columnDefinition = "TEXT")
    private String endereco;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private StateEnum estado;

    @Column(name = "telefone_fixo", length = 14)
    private String telefone_fixo;

    @Column(name = "celular", nullable = false, length = 15)
    private String celular;

    @Column(name = "altura", nullable = false, precision = 3, scale = 2)
    private BigDecimal altura;

    @Column(name = "peso", nullable = false, precision = 5, scale = 2)
    private BigDecimal peso;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_sanguineo", nullable = false)
    private BloodTypeEnum tipoSanguineo;
}