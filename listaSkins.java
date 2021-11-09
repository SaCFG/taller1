package t1;

public class listaSkins {
	private int max;
	private int cantidad = 0;
	private skin [] lista;
	
	public listaSkins (int max) {
		this.max = max;
		lista = new skin[max];
	}
	
	public int getMax() {
		return max;
	}
	public int getCantSkins() {
		return cantidad;
	}
	
	public boolean agregarSkin(skin skin) {
		if (cantidad<max){
			lista[cantidad] = skin;
			cantidad++;
			return true;
		}
		else return false;
	}

	public skin getSkin(int indice) {
		return lista[indice];
	}
	
}
