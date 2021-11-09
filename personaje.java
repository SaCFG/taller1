package t1;

public class personaje {
	private String nombre;
	private String rol;
	private int cantSkins;
	private listaSkins skins;
		
	public personaje(String nombre, String rol, int cantSkins) {
		this.nombre = nombre;
		this.rol = rol;
		this.cantSkins = cantSkins;
		skins = new listaSkins(99);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public int getCantSkins() {
		return cantSkins;
	}

	public void setCantSkins(int cantSkins) {
		this.cantSkins = cantSkins;
	}

	public listaSkins getSkins() {
		return skins;
	}

	public void setSkins(listaSkins skins) {
		this.skins = skins;
	} 
		
		

}
