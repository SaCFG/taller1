package t1;

public class listaRecaudaciones {
	private int max;
	private int cantidad = 0;
	private recaudacion [] lista;
	
	public listaRecaudaciones (int max) {
		this.max = max;
		lista = new recaudacion[max];
	}
	
	public int getMax() {
		return max;
	}
	public int getCantRecaudaciones() {
		return cantidad;
	}
	
	public boolean agregarRecaudacion(recaudacion recaudacion) {
		if (cantidad<max){
			lista[cantidad] = recaudacion;
			cantidad++;
			return true;
		}
		else return false;
	}
}
