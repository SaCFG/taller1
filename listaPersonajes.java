package t1;

public class listaPersonajes {
	private int max;
	private int cantidad = 0;
	private personaje [] lista;
	
	public listaPersonajes (int max) {
		this.max = max;
		lista = new personaje[max];
	}
	
	public int getMax() {
		return max;
	}
	public int getCantPjs() {
		return cantidad;
	}
	
	public boolean agregarPersonaje(personaje personaje) {
		if (cantidad<max){
			lista[cantidad] = personaje;
			cantidad++;
			return true;
		}
		else return false;
	}
	
	public personaje getPersonaje(int indice) {
		return lista[indice];
	}
	
}
