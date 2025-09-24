package com.org.centro8.curso.Sistema_banco.entidades;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuentaCorriente extends Cuenta {
    private final double montoDescubiertoAutorizado;

    public cuentacorriente(String nroCuenta, double saldoInicial, double montoDescubiertoAutorizado) {
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