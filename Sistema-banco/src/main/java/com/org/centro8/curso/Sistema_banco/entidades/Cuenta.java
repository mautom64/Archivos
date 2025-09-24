package com.org.centro8.curso.Sistema_banco.entidades;

@Data
@AllArgsConstructor


public abstract class Cuenta {
    private String nroCuenta;
    private double saldo;

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