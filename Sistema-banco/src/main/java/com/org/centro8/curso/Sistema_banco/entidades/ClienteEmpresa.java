package com.org.centro8.curso.Sistema_banco.entidades;





public class ClienteEmpresa extends cliente {
    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(String numCliente, String nombreFantasia, String cuit) {
       
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
}
