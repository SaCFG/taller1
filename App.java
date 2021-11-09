package t1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class App {
	public static void main(String[] args){
		sistemaJuegoImlp sistema = new sistemaJuegoImlp();
		leerCuentas(sistema);
		leerPersonajes(sistema);
		leerRecaudaciones(sistema);	
		
		
		sistema.enlazarPeronajeSkin();
		
		menu(sistema);

	}


	public static void leerCuentas(sistemaJuegoImlp system){
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
		try {
			archivo = new File ("C:\\Cuentas.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String [] partes = linea.split(",");
				String nameCuenta = partes[0];
				String password = partes[1];
				String nick = partes[2];
				int lvl = Integer.parseInt(partes[3]);
				int rp = Integer.parseInt(partes[4]);
				int cantPjs = Integer.parseInt(partes[5]);
				if (cantPjs > 155) {
					System.out.println("Existe un problema con los archivos de entrada, porfavor revisar los archivos");
					System.exit(0);
				}
				//recordatorio: recorre el string partes por la cantidad de datos dictados por los contadores, falta añadir a la lista de cada cuenta
				int contadorPjs = cantPjs;
				int parteActual = 6;
				while (contadorPjs != 0) {
					
					contadorPjs = contadorPjs -1;
				}
				
				int cantSkins = Integer.parseInt(partes[parteActual]);
				int contadorSkins = cantSkins;
				parteActual = parteActual +1;
				while(contadorSkins != 0) {
					contadorSkins = contadorSkins - 1;
				}
				cuenta cuenta = new cuenta(nameCuenta, password, nick, lvl, rp, cantPjs, cantSkins);
				
				system.agregarCuenta(cuenta);
				
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	
	public static void leerPersonajes(sistemaJuegoImlp system){
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
		try {
			archivo = new File ("C:\\Personajes.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String [] partes = linea.split(",");
				String nombre = partes[0];
				String rol = partes[1];
				int cantSkins = Integer.parseInt(partes[2]);
				int contadorSkins = cantSkins;
				int parteActual = 3;
				while(contadorSkins != 0) {
					String [] partesNombre = partes[parteActual].split(" ", 2);
					String pj = partesNombre[0];
					String nombreSkin = partesNombre[1];
					parteActual += 1;
					String calidad = partes[parteActual];
					parteActual += 1;
					contadorSkins = contadorSkins - 1;
					skin skin = new skin(pj, nombreSkin, calidad);
					system.agregarSkin(skin);
					
				}				
				personaje personaje = new personaje(nombre, rol, cantSkins);
				system.agregarPersonaje(personaje);
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}	
	
	public static void leerRecaudaciones(sistemaJuegoImlp system){
		 File archivo = null;
	     FileReader fr = null;
	     BufferedReader br = null;
		try {
			archivo = new File ("C:\\Recaudaciones.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String [] partes = linea.split(",");
				String personaje = partes[0];
				String recau = partes[1];
				String dato = personaje + " " + recau;
				recaudacion recaudacion = new recaudacion(dato);
				system.agregarRecaudacion(recaudacion);
	
			}
		}catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	private static void menu(sistemaJuegoImlp system) {
		System.out.println("Bienvenido al Juego Generico");
		int sesion = 0;
		Scanner sc = new Scanner(System.in);
		boolean closeProgram = false; 
		while (closeProgram == false) {
			while (sesion == 0) {
				System.out.println("Ingrese su Nombre de cuenta:");
				String usuario = sc.next();
				System.out.println("Ingrese su contraseña:");
				String password = sc.next();
				sesion = system.iniciarSesion(usuario, password);
				switch (sesion) {
				case 1://cliente
					{
					menuCliente(usuario);
				}
				case 2://admin
					{
					
				}
				case 3://nuevo
					{
					String nom;
					String pass;
					String nick;
					int lvl = 0;
					int rp = 0;
					int cantPjs = 0;
					int cantSkins = 0;
					System.out.println("Ingrese su cuneta del cliente: ");
					nom = sc.next();
					System.out.println("Ingrese su password: ");
					pass = sc.next();
					System.out.println("Ingrese su nick: ");
					nick = sc.next();
					
					cuenta cuenta = new cuenta(nom, pass, nick, lvl, rp, cantPjs, cantSkins);	
					system.agregarCuenta(cuenta);
						
					menuCliente(usuario);	
				}
				default:
					System.out.println("Cuenta no encontrada desea registrase?");
					System.out.println("No = 0");
					System.out.println("Si = 3");
					sesion = Integer.parseInt(sc.next());
				}
			}
		}	
	}
	
	public static void menuCliente(String usuario) {
		int cond = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			int opcion;
			System.out.println("Su rut no se encuentra o esta mal escrito desea: "
					+ "\n1) Comprar entrada "
					+ "\n2) Info usuario"
					+ "\n3) Devolver entrada"
					+ "\n4) Cartelera"
					+ "\n5) Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Que personaje va a comprar?: ");
				String perosnaje = sc.next();
				
		
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opcion no valida");
			}
		} while (cond != 1);
	}
	
	
}
