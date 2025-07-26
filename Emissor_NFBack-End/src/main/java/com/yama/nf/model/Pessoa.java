package com.yama.nf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pessoa {
    private String nomeCompleto;
    private String cpf;
    private Endereco endereco;
}
