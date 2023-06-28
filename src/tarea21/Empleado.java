package tarea21;

public class Empleado extends Persona{
	
	private double remuneracion;
	private int empleadoId;
	
	
	
	public Empleado (String numeroFiscal, String nombre, String apellido, String direccion, double remuneracion, int empleadoId) {
		super(numeroFiscal, nombre, apellido, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }
	
	public double getRemuneracion() {
		return remuneracion;
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	
	public void aumentarRem(int porcentaje){
        this.remuneracion += (remuneracion * porcentaje)/100;
    }
	
	 @Override
	    public String toString() {
	        return "empleadoId=" + empleadoId + ", remuneracion=" + remuneracion + ", " + super.toString();
	    }
	
}
