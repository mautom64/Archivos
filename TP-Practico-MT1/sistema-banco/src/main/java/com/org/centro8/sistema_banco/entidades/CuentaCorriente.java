package com.org.centro8.sistema_banco.entidades;
import lombok.Data;

@Data


public class CuentaCorriente extends Cuenta {
    private final double montoDescubiertoAutorizado;

    

    public CuentaCorriente(String nroCuenta, double saldo, double montoDescubiertoAutorizado) {
        super(nroCuenta, saldo);
        this.montoDescubiertoAutorizado = montoDescubiertoAutorizado;
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (getSaldo() + montoDescubiertoAutorizado >= monto) {
            super.extraerEfectivo(monto);
        } else {
            System.out.println("fondos insuficientes incluso con descubierto autorizado.");
        }
    }
}