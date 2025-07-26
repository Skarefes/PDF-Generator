package com.yama.nf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;


    @Override
    public String toString() {
        return "Rua: " + rua + "Numero: " + numero + "Cidade: " + cidade + "Estado: " + estado;
    }
}

