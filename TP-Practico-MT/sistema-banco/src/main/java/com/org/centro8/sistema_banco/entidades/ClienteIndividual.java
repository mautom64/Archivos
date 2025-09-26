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
    public ClienteIndividual(String NumCliente, String nombre, String apellido, String dni) {
        super(NumCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
public ClienteIndividual(int i, String nombre2, String apellido2, String dni2) {
        //TODO Auto-generated constructor stub
    }
    // Metodo
    @Override
    public void getCliente() {
        System.out.println("Cliente individual");
    }
}