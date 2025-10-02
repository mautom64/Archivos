package com.org.centro8.sistema_banco.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class CajaDeahorro extends Cuenta {

    // atributos
    private double tasaDeInteres;

    // Constructor personalizado que llama al constructor de la clase padre
    public CajaDeahorro(Cliente cliente, String nroCuenta, double saldo, double tasaDeInteres) {
        super(cliente, nroCuenta, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres() {
        double interes = getSaldo() * tasaDeInteres;
        setSaldo(getSaldo() + interes);
    }
}
