package com.org.centro8.curso.Sistema_banco.entidades;


@Data
@ToString(callSuper=true)



public class Cuentaconvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public cuentaconvertibilidad(String nroCuenta, double saldoInicial) {
        super(nroCuenta, saldo);
        this.saldoDolares = 0.0;
    }

    public void depositarDolar(double monto) {
        saldoDolares += monto;
    }

    public void extraerDolar(double monto) {
        if (saldoDolares >= monto) {
            saldoDolares -= monto;
        } else {
            System.out.println("no hay suficientes dólares.");
        }
    }

    public void convertirPesoADolar(double montoPesos, double cotizacion) {
        if (getSaldo() >= montoPesos) {
            extraerEfectivo(montoPesos);
            saldoDolares += montoPesos / cotizacion;
        }
    }

    public void convertirDolarAPeso(double montoDolar, double cotizacion) {
        if (saldoDolares >= montoDolar) {
            saldoDolares -= montoDolar;
            depositarEfectivo(montoDolar * cotizacion);
        }
    }
}
