package moduo1;

import java.util.ArrayList;

public class Contenedor {
	private ArrayList<Iasesoria> ase = new ArrayList<Iasesoria>();
	private ArrayList<Capacitacion> cap = new ArrayList<Capacitacion>();
	public Contenedor() {}
	/*
	 * los metodos almacenarCliente, almacenarProfesional, almacenarAdministrativo reciben el @param el cual contiene los datos del tipo Iasesoria
	 * y agrega los tipos de usuarios a las listas correspondientes
	 * @param Iasesoria cliente, profesional, administrativo
	 * 
	 */
	public void almacenarCliente(Iasesoria cliente) {
		ase.add(cliente);
	}
	public void almacenarProfesional(Iasesoria profesional) {
		ase.add(profesional);
	}
	public void almacenarAdministrativo(Iasesoria administrativo) {
		ase.add(administrativo);
	}
	/*
	 * el metodo almacenarCapacitacion recibe el @param el cual contiene los datos del tipo Capacitacion
	 * y agrega los tipos de capacitaciones a la lista correspondiente
	 * @param Capacitacion capa
	 */
	public void almacenarCapacitacion(Capacitacion capa) {
		cap.add(capa);
	}
	/*
	 * el metodo eliminarUsuarios recibe el @param, el cual busca dentro de la lista y elimina si es verdadero
	 * @param String run
	 */
	public void eliminarUsuarios(String run) {
		boolean encontrado = false;
		int cont = 0, cont2 = 0;
		for(Iasesoria eliminar: ase) {
			cont2++;
			if(eliminar.eliminarUsuario().equals(run)) {
				encontrado = true;
				if(encontrado) {
					System.out.println("\tRUT encontrado.");
					ase.remove(eliminar);
					System.out.println("\tRUT eliminado.");
					cont++;
					break;
				} 
			}else {
				System.out.println("\tRUT no encontrado.");
				break;
			}
		}
		if(cont == 0 && cont2 == 0) {
			System.out.println("\tRUT no encontrado.");
		}
		System.out.println("\n\n");
	}
	/*
	 * el metodo listarUsuarios muestra a todos los usuarios
	 */
	public void listarUsuarios() {
		for(Iasesoria lista: ase) {
			lista.analizarUsuario();
		}
	}
	/*
	 * el metodo listarTipoUsuario recibe el @param el cual muestra el tipo de usuario que se requiera
	 * @param String usuario
	 */
	public void listarTipoUsuario(String usuario) {
		boolean encontrado = false;
		int cont = 0, cont2 = 0;
		for(Iasesoria us: ase) {
			cont2++;
			if(us.buscarCliente().equals(usuario)) {
				encontrado = true;
				if(encontrado) {
					us.analizarUsuario();
					cont++;
				} 
			}else if(!us.buscarCliente().equals(usuario)) {
			}
		}
		if(cont==0 && cont2 == 0) {
			System.out.println("\n\tSin información.\n");
		}
	}
	/*
	 * el metodo listarCapacitaciones muestra todas las capacitaciones
	 */
	public void listarCapacitaciones() {
		for(Capacitacion us: cap) {
			us.mostrarDetalle();
		}
	}
}
