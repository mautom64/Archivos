package test;

import com.org.centro8.sistema_banco.entidades.CajaDeahorro;
import com.org.centro8.sistema_banco.entidades.Cheque;
import com.org.centro8.sistema_banco.entidades.ClienteEmpresa;
import com.org.centro8.sistema_banco.entidades.ClienteIndividual;
import com.org.centro8.sistema_banco.entidades.CuentaConvertibilidad;
import com.org.centro8.sistema_banco.entidades.CuentaCorriente;

public class Test {

    public static void main(String[] args) {
        /* */ System.out.println("** Test de cliente individual **");
        ClienteIndividual Cliente1 = new ClienteIndividual("1", "cosme", "Fulanito", "25969985");
        System.out.println(Cliente1);
        Cliente1.getCliente();
        System.out.println("El nombre del cliente es" + Cliente1.getNombre());
        System.out.println("El Apellido del cliente es:" + Cliente1.getApellido());
        System.out.println("El DNI del cliente 1 es:" + Cliente1.getDni());
        System.out.println("El Nro de cliente del cliente 1 es" + Cliente1.getNumCliente());
        System.out.println("**test del cliente empresa");
        ClienteEmpresa cliente2 = new ClienteEmpresa("2", "235698594", "Donbarredora");
        System.out.println(cliente2);
        cliente2.getCliente();
        System.out.println("El nro de cliente es: " + cliente2.getNombreFantasia());
        System.out.println("El cuit es: " + cliente2.getCuit());
        ClienteEmpresa cliente3 = new ClienteEmpresa("3", "244566879", "pizzeria luigi");
        cliente3.getCliente();
        System.out.println(cliente3);
        System.out.println("****Test Caja de ahorro***");
        CajaDeahorro cuenta1 = new CajaDeahorro(Cliente1, "1", 0, 9);
        System.out.println(cuenta1);
        System.out.println(cuenta1.getCliente());
        System.out.println("*** Test depositar***");
        cuenta1.depositarEfectivo(5000);
        System.out.println(cuenta1.getSaldo());
        System.out.println("***Test de Extraer***");
        // cuenta1.extraer(6000); No hay saldo
        cuenta1.extraerEfectivo(6000);
        System.out.println(cuenta1.getSaldo());
        System.out.println("***Cobrar Interes***");
        cuenta1.depositarEfectivo(5100);
        cuenta1.cobrarInteres();
        System.out.println(cuenta1.getSaldo());
        System.out.println("*** Cuenta Corriente ***");
        CuentaCorriente cuenta2 = new CuentaCorriente(cliente2, "2", 0, 8000);
        System.out.println(cuenta2.getCliente());
        cuenta2.depositarEfectivo(8000);
        System.out.println(cuenta2.getSaldo());

        // Extraer
        cuenta2.extraerEfectivo(10000);// supera el monto autorizado
        cuenta2.extraerEfectivo(6000);
        System.out.println(cuenta2.getSaldo());
        cuenta2.extraerEfectivo(4000);// la cuenta queda en 0
        cuenta2.extraerEfectivo(1000);// no deja extraer porque ya el saldo es 0
        System.out.println(cuenta2.getSaldo());
        System.out.println("*** Cuenta convertivilidad ***");
        CuentaConvertibilidad cuenta3 = new CuentaConvertibilidad(cliente3, "3", 0, 9000, 0);
        // Llamo al método para convertir 5000 pesos a dólares con cotización 100
        cuenta3.convertirPesoADolar(5000, 100);
        System.out.println(cuenta3);
        // Depositar pesos
        cuenta3.depositarEfectivo(6000);
        System.out.println("El saldo de la cuenta3 en $:" + cuenta3.getSaldo());
        // depositar dolares
        cuenta3.depositarDolar(400);
        System.out.println("El saldo de la cuenta 3 en USD:" + cuenta3.getSaldoDolares());
        //Extraer Dolares
        cuenta3.extraerDolar(60);
        System.out.println(cuenta3.getSaldoDolares());
        // depositar cheque
        System.out.println("Se prueba lo de cheques");
        Cheque cheque1 = new Cheque(1, "BBVA", "11/09/2025", 230000);
        cuenta2.depositarCheque(cheque1);
        System.out.println("el saldo de la cuenta 2 es $:" + cuenta2.getSaldo());
        Cheque cheque2 = new Cheque(3, "Creedicoop", "5/5/23", 600);
        cuenta3.depositarCheque(cheque2);

        System.out.println("el saldo de la cuenta 3 es :" + cuenta3.getSaldo());

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }

}
