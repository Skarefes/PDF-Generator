package com.yama.nf.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class NF {
    private String numeroNota;
    private Date dataEmissao;
    private String observacao;
    private Double valorBruto;
    private Double desconto;
    private Double aliquotaIss;
    private Emitente emitente;
    private Cliente cliente;
    private Endereco endereco;



//    private Double valorLiquido(){
//        return valorBruto - desconto - calculoIss() - imposto;
//    }

}
