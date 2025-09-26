package test;

import com.org.centro8.sistema_banco.entidades.ClienteEmpresa;
import com.org.centro8.sistema_banco.entidades.ClienteIndividual;

public class Test {
public static void main(String[] args) {
 System.out.println("** Test de la cliente individual **");
        ClienteIndividual Cliente1 = new ClienteIndividual("1","cosme","Fulanito","25969985");
        System.out.println(Cliente1);
System.out.println("**test del cliente empresa");
        ClienteEmpresa clienteEmpresa2= new ClienteEmpresa("1", "235698594", "Donbarredora");
     System.out.println(clienteEmpresa2);                 
    }


    
}
