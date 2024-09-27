package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    protected java.util.GregorianCalendar fechaIngreso;

    public Empleado() {
        dni = "00000000";
        nombre = "NN";
        apellidos = "NA";
        fechaIngreso = new java.util.GregorianCalendar(1800,0,1);
    }

    public Empleado(String dni, String nombre, String apellidos, GregorianCalendar fechaIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    @Override
    public String toString(){
        int dia, mes, año;
        dia = getFechaIngreso().get(Calendar.DAY_OF_MONTH);
        mes = getFechaIngreso().get(Calendar.MONTH)+1;
        año = getFechaIngreso().get(Calendar.YEAR);
        
        return "DNI: " + getDni() + "\nNombre y Apellidos: " + getNombre() +
               " "+ getApellidos() + "\nFecha de ingreso:" + 
               (dia<10?"0"+dia:dia)+"/" + (mes<10?"0"+mes:mes) +"/"+año;
    }
}
