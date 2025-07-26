package com.yama.nf.model;

import lombok.Getter;
import lombok.Setter;

import java.lang.foreign.SymbolLookup;

@Getter
@Setter
public class Emitente extends Pessoa{
    private Boolean isMei;

    public Emitente(Boolean isMei) {
        this.isMei = false;
    }
}
