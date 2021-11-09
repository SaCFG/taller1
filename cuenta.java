package t1;


public class cuenta {
	private String nameCuenta;
	private String password;
	private String nick; 
	private int lvl;
	private int rp;
	private int cantPjs;
	private listaPersonajes personajes;
	private int cantSkins;
	private listaSkins skins;
		
		
	public cuenta(String nameCuenta, String password, String nick, int lvl, int rp, int cantPjs, int cantSkins) {
		this.nameCuenta = nameCuenta;
		this.password = password;
		this.nick = nick;
		this.lvl = lvl;
		this.rp = rp;
		this.cantPjs = cantPjs;
		personajes = new listaPersonajes(154);
		this.cantSkins = cantSkins;
		skins = new listaSkins(9999);
		
	}


	public String getNameCuenta() {
		return nameCuenta;
	}

	public void setNameCuenta(String nameCuenta) {
		this.nameCuenta = nameCuenta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getCantPjs() {
		return cantPjs;
	}

	public void setCantPjs(int cantPjs) {
		this.cantPjs = cantPjs;
	}

	public listaPersonajes getPersonajes() {
		return personajes;
	}

	public void setPersonajes(listaPersonajes personajes) {
		this.personajes = personajes;
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

	public int getRp() {
		return rp;
	}

	public void setRp(int rp) {
		this.rp = rp;
	}

	public boolean añadirPersoanje(personaje personaje) {
		personajes.agregarPersonaje(personaje);
		return true;
	}
}
	