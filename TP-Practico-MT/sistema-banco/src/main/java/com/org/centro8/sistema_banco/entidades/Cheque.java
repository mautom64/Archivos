package com.org.centro8.sistema_banco.entidades;
import lombok.AllArgsConstructor;
import lombok.Data;

public class Cheque {
@Data
@AllArgsConstructor

public class cheque {
    private double monto;
     private String bancoEmisor;
     private String fechaPago;
 }
}
