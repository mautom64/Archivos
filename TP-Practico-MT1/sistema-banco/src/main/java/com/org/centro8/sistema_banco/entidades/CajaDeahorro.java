package com.org.centro8.sistema_banco.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString(callSuper=true) 
public class CajaDeahorro extends Cuenta {
    //atributos
    
    private double tasaDeInteres;

    // Constructor personalizado que llama al constructor de la clase padre
   
    

    public void cobrarInteres() {
        double interes =saldo * tasaDeInteres;
        saldo+=interes;
    }

    public CajaDeahorro(String nroCuenta, double saldo, double tasaDeInteres) {
        super(nroCuenta,saldo);
        this.tasaDeInteres = tasaDeInteres;
    }
}
