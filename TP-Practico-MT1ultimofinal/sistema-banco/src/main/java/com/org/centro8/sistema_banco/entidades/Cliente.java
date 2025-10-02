package com.org.centro8.sistema_banco.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// Atributos de la clase cliente
public abstract class Cliente {
 
  private String numCliente;

/* Metodo(accion o comportamiento) no implementado que se va intanciar en la clase hija (cliente empresa o cliente invididual) donde se mostrara que tipo de cliente es. */ 
  public abstract void getCliente();
}
