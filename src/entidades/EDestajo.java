package entidades;

import java.util.GregorianCalendar;

public class EDestajo extends Empleado{
    private int clientescaptados;
    public static final float salarioD = 130.05f;

    public EDestajo() {
        super();
        clientescaptados = 0;
    }

    public EDestajo(int clientescaptados, String dni, String nombre, String apellidos, GregorianCalendar fechaIngreso) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.clientescaptados = clientescaptados;
    }

    public int getClientescaptados() {
        return clientescaptados;
    }

    public void setClientescaptados(int clientescaptados) {
        this.clientescaptados = clientescaptados;
    }

    public float getsalario() {
        return salarioD * clientescaptados;
    }
    
    public String toString(){
        
    }

}
