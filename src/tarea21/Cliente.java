package tarea21;

public class Cliente extends Persona{
	
	private int clienteId;
	
	public Cliente (String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.clienteId = clienteId;
	}
	
	

	public int getClienteId() {
		return clienteId;
	}
	
	@Override
    public String toString() {
        return "clienteId=" + clienteId + ", " + super.toString();
    }
	
	
}
