package com.org.centro8.sistema_banco.entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor

public abstract class Cliente {
    // Atributos
    private  String numCliente;
      // Metodo
    public abstract void getCliente();
}
