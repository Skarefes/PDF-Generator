package com.yama.nf.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Servico {
    private String servicoPrestado;
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;
    private Date dataServico;
}
