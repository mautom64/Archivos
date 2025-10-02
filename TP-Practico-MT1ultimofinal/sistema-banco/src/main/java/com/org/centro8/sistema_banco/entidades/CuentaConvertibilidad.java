package com.org.centro8.sistema_banco.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)

public class CuentaConvertibilidad extends CuentaCorriente {

    protected double saldoDolares;

    public CuentaConvertibilidad(ClienteEmpresa cliente, String nroCuenta, double saldo, double montoDescubiertoAutorizado,
            double saldoDolares) {
        super(cliente, nroCuenta, saldo, montoDescubiertoAutorizado);
        this.saldoDolares = saldoDolares;
    }

    /**
     * Depositar Dolares
     *
     * @param monto
     */
    public void depositarDolar(double monto) {
        saldoDolares += monto;
    }

    /**
     * Para extraer los Dolares
     *
     * @param monto
     */
    public void extraerDolar(double monto) {
        if (saldoDolares >= monto) {
            saldoDolares -= monto;
        } else {
            System.out.println("no hay suficientes dólares.");
        }
    }

    /**
     * Metodo para pasar el saldo en dolares a Pesos
     *
     * @param tasa -> tasa de cambio
     */
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

    @Override
    public void setCliente(Cliente clienteEmpresa) {
        if (clienteEmpresa instanceof ClienteEmpresa) {
            super.setCliente(clienteEmpresa);
        } else {
            System.out.println("No se puede asignar un cliente que no sea cuenta empresa");
        }
    }

}
