
package dominio2;


public class Empleado1 extends Persona{
       private int idEmpleado;
       private double  sueldo;
       private static int contadorEmpleado;

    public Empleado1(String nombre, double sueldo) {
       super(nombre);
        this.idEmpleado = ++Empleado1.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado1{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(",{").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
       
       
       
}
