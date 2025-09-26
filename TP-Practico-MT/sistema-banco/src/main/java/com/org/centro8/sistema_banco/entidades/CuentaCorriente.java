package com.org.centro8.sistema_banco.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CuentaCorriente extends Cuenta {
    private final double montoDescubiertoAutorizado;

    public Cuentacorriente(String nroCuenta, double saldoInicial, double montoDescubiertoAutorizado) {
        super(nroCuenta, saldoInicial);
        this.montoDescubiertoAutorizado = montoDescubiertoAutorizado;
    }

    public void depositarCheque(cheque cheque) {
        depositarEfectivo(cheque.getMonto());
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