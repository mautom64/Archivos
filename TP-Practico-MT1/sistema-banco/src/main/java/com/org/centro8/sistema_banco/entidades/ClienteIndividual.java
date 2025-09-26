package com.org.centro8.sistema_banco.entidades;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)



public class ClienteIndividual extends Cliente {

    // Atributos
    private String nombre;
    private String apellido;
    private String dni;

    // Constructores
    public ClienteIndividual(String numCliente, String nombre, String apellido, String dni) {
        super(numCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    // Metodo
    @Override
    public void getCliente() {
        System.out.println("Cliente individual");
    }
}