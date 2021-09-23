

package pruebaCliente;

import dominio2.Cliente;
import dominio2.Empleado1;
import java.util.Date;



public class PCliente {
    public static void main(String[] args) {
//        Empleado1 empleado3 =new Empleado1("juan",5000.0);
//        System.out.println("empleado3"+ empleado3);
       Cliente cliente1 = new Cliente (new Date(),true,"Sofyta",'F',39, "Las LIndas Montañas Canada 1221");
           System.out.println("cliente1 = " + cliente1);   
       
    }
}
