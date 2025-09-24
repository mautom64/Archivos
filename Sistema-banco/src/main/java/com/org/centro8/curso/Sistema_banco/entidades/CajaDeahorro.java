package com.org.centro8.curso.Sistema_banco.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@getter
@setter
@AllArgsConstructor

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    // Constructor personalizado que llama al constructor de la clase padre
    public CajaDeAhorro(String nroCuenta, double saldoInicial, double tasaDeInteres) {
        super(nroCuenta, saldoInicial); // llama al constructor de Cuenta
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres() {
        depositarEfectivo(getSaldo() * tasaDeInteres); // suponiendo que getSaldo()*
