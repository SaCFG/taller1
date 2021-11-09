package t1;

public class listaCuentas {
	private int max;
	private int cantidad = 0;
	private cuenta [] lista;
	
	public listaCuentas (int max) {
		this.max = max;
		lista = new cuenta[max];
	}
	
	public int getMax() {
		return max;
	}
	public int getCantCuentas() {
		return cantidad;
	}
	
	public int buscarCuenta(String cuenta) {
		int indice = 0;
		for (int i = 0; i<cantidad; i++) {
			if (lista[i].getNameCuenta().equals(cuenta)){
				indice = i;
				break;
			}
			else indice = -1;
		}
		return indice;
	}
	
	public boolean agregarCuenta(cuenta cuenta) {
		if (cantidad<max){
			lista[cantidad] = cuenta;
			cantidad++;
			return true;
		}
		else return false;
	}
	
	public cuenta getCuenta(int indice) {
		return lista[indice];
	}
	

}
