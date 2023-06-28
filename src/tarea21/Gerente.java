package tarea21;

public class Gerente extends Empleado{
	
	private double presupuesto;
	
	public Gerente(String numeroFiscal, String nombre, String apellido, String direccion, double remuneracion, int empleadoId, double presupuesto) {
        super(numeroFiscal, nombre, apellido, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }
	

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@Override
    public String toString() {
        return "presupuesto=" + presupuesto + ", " + super.toString();
    }
}
