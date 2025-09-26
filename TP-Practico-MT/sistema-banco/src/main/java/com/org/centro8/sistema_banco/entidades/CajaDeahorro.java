package com.org.centro8.sistema_banco.entidades;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@Data
@ToString(callSuper=true) 

public class CajaDeahorro extends Cuenta {
    private double tasaDeInteres;

    // Constructor personalizado que llama al constructor de la clase padre
    public CajaDeahorro(String nroCuenta, double saldoInicial, double tasaDeInteres) {
        super(nroCuenta,saldo ); // llama al constructor de Cuenta
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres() {
        depositarEfectivo(getSaldo() * tasaDeInteres); // suponiendo que getSaldo()*
