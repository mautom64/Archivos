package com.org.centro8.sistema_banco.entidades;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public abstract class Cuenta {
    private Cliente cliente;
    private String nroCuenta;
    protected double saldo;

    public void depositarEfectivo(double monto) {
        saldo += monto;
    }

    public void extraerEfectivo(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("fondos insuficientes.");
        }
    }
}