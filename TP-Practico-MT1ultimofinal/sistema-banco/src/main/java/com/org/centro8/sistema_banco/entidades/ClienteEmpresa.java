package com.org.centro8.sistema_banco.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ClienteEmpresa extends Cliente {

    // Atributos de clase 
    private String cuit;
    private String nombreFantasia;

    public ClienteEmpresa(String numCliente, String cuit, String nombreFantasia) {
        super(numCliente);
        this.cuit = cuit;
        this.nombreFantasia = nombreFantasia;

    }
    //Metodo que hereda de la clase padre donde aca si se implementa y sobreescribe con una accion. 

    @Override
    public void getCliente() {
        System.out.println("Cliente empresa");
    }
}
