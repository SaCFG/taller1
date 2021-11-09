package t1;

public class sistemaJuegoImlp implements sistemaJuego{
	
	private listaCuentas lCuentas;
	private listaPersonajes lPersonajes;
	private listaSkins lSkins;
	private listaRecaudaciones lRecaudaciones;

	
	 public sistemaJuegoImlp() {
		lCuentas = new listaCuentas(9999);
		lPersonajes = new listaPersonajes(9999);
		lSkins = new listaSkins(9999);
		lRecaudaciones = new listaRecaudaciones(9999);
	}	  
		
	public boolean agregarPersonaje(personaje personaje) {
		return lPersonajes.agregarPersonaje(personaje);
	}
	
	public boolean agregarSkin(skin skin) {
		return lSkins.agregarSkin(skin);
	}
	
	public boolean agregarCuenta(cuenta cuenta) {
		return lCuentas.agregarCuenta(cuenta);
	}
	
	public boolean agregarRecaudacion(recaudacion recaudacion) {
		return lRecaudaciones.agregarRecaudacion(recaudacion);
	}

	
	public int iniciarSesion(String usuario, String password) {
		
		if (lCuentas.buscarCuenta(usuario) != -1 && password.equals(lCuentas.getCuenta(lCuentas.buscarCuenta(usuario)).getPassword())){
			return 1;
		}
		
		else if (usuario.equals("ADMIN") && password.equals("ADMIN")) {
			return 2;
		}
		else return 0;
		

		
	}

	
	public void enlazarPeronajeSkin() {
		for (int i = 0; i<lPersonajes.getCantPjs();i++) {
			personaje perosnaje = lPersonajes.getPersonaje(i);
			String nombre = perosnaje.getNombre();
			for (int k = 0; k<lSkins.getCantSkins(); k++) {
				skin skin = lSkins.getSkin(k);
				String pj = skin.getPj();
				if (nombre.equals(pj)){
					listaSkins personajeListaSkins = perosnaje.getSkins();
					personajeListaSkins.agregarSkin(skin);
				}
			}	
		}
		
	}

	
	public boolean comprarSkin(cuenta cuenta, skin skin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean comprarPersonaje(String usuario, String personaje) {
		int saldo = lCuentas.getCuenta(lCuentas.buscarCuenta(usuario)).getRp();
		
		
		return true;
	}

	
	public boolean añadirSaldo(cuenta Cuenta) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean infoCliente() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean infoRecaudaciones() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bannear(String cuenta_cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cierreSistema() {
		// TODO Auto-generated method stub
		return false;
	}


		

	

}
