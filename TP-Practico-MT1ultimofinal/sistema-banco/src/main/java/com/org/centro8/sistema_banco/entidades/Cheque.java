package com.org.centro8.sistema_banco.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public class Cheque {
    private int nroCheque;
    private String bancoEmisor;
    private String fechaCobro;
    private double monto;

  

}
