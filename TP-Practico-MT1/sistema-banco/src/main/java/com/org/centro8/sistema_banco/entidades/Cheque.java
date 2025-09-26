package com.org.centro8.sistema_banco.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cheque {
   private int  nroCheque;
   private String bancoEmisor;
   private String fechaCobro;
    private double monto;

    public Cheque(String bancoEmisor, String fechaCobro, double monto, int nroCheque) {
        this.bancoEmisor = bancoEmisor;
        this.fechaCobro = fechaCobro;
        this.monto = monto;
        this.nroCheque = nroCheque;
    }

    
 }

