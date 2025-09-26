package com.org.centro8.sistema_banco.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)

public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public CuentaConvertibilidad(Cliente cliente, String nroCuenta, double saldo, double montoDescubiertoAutorizado,
            double saldoDolares) {
        super(cliente, nroCuenta, saldo, montoDescubiertoAutorizado);
        this.saldoDolares = saldoDolares;
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
