package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EContratado extends Empleado{
    private float salarioB;

    public EContratado() {
    }

    public EContratado(float salarioB, String dni, String nombre, String apellidos, GregorianCalendar fechaIngreso) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.salarioB = salarioB;
    }

    public void setSalario(float salarioB) {
        this.salarioB = salarioB;
    }

    public float getSalario() {
        GregorianCalendar Actual = new GregorianCalendar();
        int anios = fechaIngreso.get(Calendar.YEAR) - Actual.get(Calendar.YEAR);
        if(fechaIngreso.get(Calendar.MONTH)>Actual.get(Calendar.MOTH)
                || fechaIngreso.get(Calendar.MONTH)==Actual.get(Calendar.MONTH)
                )
        return salarioB;
    }
    
    
}
