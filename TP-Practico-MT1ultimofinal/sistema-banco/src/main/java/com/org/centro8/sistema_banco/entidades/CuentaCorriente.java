package com.org.centro8.sistema_banco.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CuentaCorriente extends Cuenta {

    private double montoDescubiertoAutorizado;

    public CuentaCorriente(Cliente cliente, String nroCuenta, double saldo, double montoDescubiertoAutorizado) {
        super(cliente, nroCuenta, saldo);
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

    /**
     * Depositar cheque
     *
     * @param cheque
     */
    public void depositarCheque(Cheque cheque) {

        setSaldo(getSaldo() + cheque.getMonto());

    }
}
