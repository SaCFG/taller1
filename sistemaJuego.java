package t1;


public interface sistemaJuego{
	boolean agregarPersonaje(personaje personaje);
	boolean agregarSkin (skin skin);
	boolean agregarCuenta (cuenta cuenta);
	boolean agregarRecaudacion (recaudacion recaudacion);
	int iniciarSesion (String usuario, String password); 
	
	void enlazarPeronajeSkin();
	
	boolean comprarSkin(cuenta cuenta, skin skin);
	boolean comprarPersonaje(String usuario, String personaje);
	
	boolean añadirSaldo (cuenta Cuenta);
	
	boolean infoCliente (); 
	boolean infoRecaudaciones();
	boolean bannear (String cuenta_cliente);
	boolean cierreSistema ();
	
}
