package tarea22;

public class EjemploProducto {

	public static void main(String[] args) {
		
		Producto [] productos = new Producto [8];
		productos[0] = new Lacteo (5, 600, "Leche Deslactosada", 5000.00);
		productos[1] = new Lacteo (3, 250, "Yogurt fresa", 2500.00);
		productos[2] = new Fruta ("Naranja",3500.00, 1000, "Naranja");
		productos[3] = new Fruta ("banano",5000.00, 1500, "Amarillo");
		productos[4] = new Limpieza ("Desengrasante",6000.00, "Bicarbonato", 2);
		productos[5] = new Limpieza ("Clorox",5500.00, "Hipoclorito", 3);
		productos[6] = new NoPerecible ("Lata Sardinas", 6500.00, 250, 300);
		productos[7] = new NoPerecible ("Lata Atún", 3500.00, 200, 250);
		
		
		
		for (Producto producto : productos) {
			System.out.println("********"+producto.getClass().getSimpleName()+"********");
			System.out.println("Nombre: "+ producto.getNombre());
			System.out.println("Precio: "+ producto.getPrecio());
			
			if (producto instanceof Lacteo) {
				System.out.println("Cantidad: " + ((Lacteo)producto).getCantidad());
				System.out.println("Proteinas: " + ((Lacteo)producto).getProteinas());
			} 
			if (producto instanceof Fruta) {
				System.out.println("Peso "+ ((Fruta)producto).getPeso()+ " Gramos");
				System.out.println("Color "+ ((Fruta)producto).getColor());
			}
			if (producto instanceof Limpieza ) {
				System.out.println("Componentes: " + ((Limpieza)producto).getComponentes());
				System.out.println("Litros: "+ ((Limpieza)producto).getLitros() + " lts");
			}
			if (producto instanceof NoPerecible) {
				System.out.println("Contenido: " + ((NoPerecible)producto).getContenido());
				System.out.println("Calorias: " + ((NoPerecible)producto).getCalorias() + " cal");
				
			}
			
		}
	}

}
