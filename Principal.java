package moduo1;

import java.util.Scanner;

/*
 * @author
 * Danilo Sánchez
 * Leonardo Rodríguez
 * Joaquín Astorga
 * Miguel Ahumada
 * 
 * Este el menú principal el cual se despliega las opciones que tendrá el usuario
 * para ingresar tanto Clientes, Profesionales, Administrativos y Capacitaciones,
 * además de listar todos los datos ingresados y eliminar a los usuarios ingresados
 * 
 * @version 3.21
 */

public class Principal {

	public static void main(String[] args) {
		Contenedor con = new Contenedor();
		Scanner sc = new Scanner(System.in);
		Cliente cli = new Cliente();
		Cliente cli2 = new Cliente();
		Profesional prof = new Profesional();
		Profesional prof2 = new Profesional();
		Administrativo adm = new Administrativo();
		Administrativo adm2 = new Administrativo();
		Capacitacion capa = new Capacitacion();
		Capacitacion capa2 = new Capacitacion();
		Scanner leer = new Scanner(System.in);
		String run, nombre, fechaNac;
		String apellido, fono, sisSalud, direccion, comuna, afp, tipoCli;
		String titulo, fecIngreso, tipoProf;
		String area, expPrevia, tipoAdm;
		String rutCliente, diaCapacitacion, horaFinal, lugar, duracion;
		int cantAsistentes = 0;
		String tecla;
		int op = 0;
		
		do {
			do {
				System.out.println("\tMENU PRINCIPAL\n");
				System.out.println("\t\t1.Ingrese Cliente.");
				System.out.println("\t\t2.Ingrese Profesional.");
				System.out.println("\t\t3.Ingrese Administrativo.");
				System.out.println("\t\t4.Ingrese Capacitación.");
				System.out.println("\t\t5.Eliminar Usuario.");
				System.out.println("\t\t6.Mostrar Usuarios.");
				System.out.println("\t\t7.Mostrar Usuarios por tipo.");
				System.out.println("\t\t8.Mostrar Capacitaciones.");
				System.out.println("\t\t9.Salir.");
				System.out.print("\tIngrese opción: ");
				op = sc.nextInt();
				switch (op) {
				case 1:
					System.out.println("\tIngrese Datos del Cliente.");
					do {
						sc.nextLine();
						System.out.print("\t\tIngrese rut: ");
						run = cli.descomponerRun(leer.nextLine().trim());
					} while(cli.getRun().equals(""));
					do {
						System.out.print("\t\tIngrese nombre: (mínimo 2 y un máximo de 50 caracteres.) ");
						nombre = cli.validarNombre(leer.nextLine().trim());
					} while(cli.getNombreU().equals(""));
					do {
						System.out.print("\t\tIngrese apellido: (mínimo 2 y un máximo de 50 caracteres.) ");
						apellido = cli.validarApellido(leer.nextLine().trim());
					} while(cli.getApellido().equals(""));
					do {
						System.out.print("\t\tIngrese teléfono: ");
						fono = cli.validarTelefono(leer.next().trim());
					} while(cli.getFono().equals(""));
					do {
						System.out.print("\t\tIngrese AFP: (mínimo 4 y un máximo de 30 caracteres.) ");
						afp = cli.validarAFP(leer.next().trim());
					} while(cli.getAfp().equals(""));
					do {
						System.out.println("\t\tSeleccione su Sistema Salud: ");
						System.out.println("\t\t\t1.Fonasa.");
						System.out.println("\t\t\t2.Isapre.");
						System.out.print("\t\tIngrese opción: ");
						sisSalud = cli.sistemaSalud(leer.next().trim());
					} while(cli.getSistSalud().equals(""));
					do {
						//sc.nextLine();
						System.out.print("\t\tIngrese dirección: (un máximo de 70 caracteres.) ");
						direccion = cli.validarDireccion(sc.nextLine().trim());
					} while(cli.getDireccion().equals(""));
					do {
						System.out.print("\t\tIngrese comuna: (un máximo de 50 caracteres.) ");
						comuna = cli.validarComuna(sc.nextLine().trim());
					} while(cli.getComuna().equals(""));
					do {
						System.out.print("\t\tIngrese fecha de nacimiento: (DD/MM/AAAA) ");
						fechaNac = cli.ingresarFecha(leer.next().trim());
					} while(cli.getFecNac().equals("") && cli.getEdad() == -1);
					tipoCli = "cliente";
					cli2 = new Cliente(run, nombre, apellido, fono, afp, sisSalud, direccion, comuna, fechaNac, tipoCli);
					con.almacenarCliente(cli2);
					break;
				case 2:
					System.out.println("\tIngrese Datos del Profesional.");
					do {
						System.out.print("\t\tIngrese rut: ");
						run = prof.descomponerRun(sc.next().trim());
					} while(prof.getRun().equals(""));
					
					do {
						sc.nextLine();
						System.out.print("\t\tIngrese nombre: (mínimo 2 y un máximo de 50 caracteres.) ");
						nombre = prof.validarNombre(sc.nextLine().trim());
					} while(prof.getNombreU().equals(""));
					do {
						System.out.print("\t\tIngrese título: (mínimo 10 y un máximo de 50 caracteres.) ");
						titulo = prof.validarTitulo(sc.nextLine().trim());
					} while(prof.getTitulo().equals(""));
					do {
						System.out.print("\t\tIngrese fecha de ingreso: (DD/MM/AAAA) ");
						fecIngreso = prof.validarFechaIngreso(leer.next().trim());
					} while(prof.getFecIngreso().equals(""));
					do {
						System.out.print("\t\tIngrese fecha de nacimiento: (DD/MM/AAAA) ");
						fechaNac = prof.ingresarFecha(leer.next().trim());
					} while(prof.getFecNac().equals("") && prof.getEdad() == -1);
					tipoProf = "profesional";
					prof2 = new Profesional(run, nombre, titulo, fecIngreso, fechaNac, tipoProf);
					con.almacenarProfesional(prof2);
					break;
				case 3:
					System.out.println("\tIngrese Datos del Administrativo.");
					do {
						System.out.print("\t\tIngrese rut: ");
						run = adm.descomponerRun(leer.next().trim());
					} while(adm.getRun().equals(""));
					do {
						System.out.print("\t\tIngrese nombre: (mínimo 2 y un máximo de 50 caracteres.) ");
						nombre = adm.validarNombre(leer.next().trim());
					} while(adm.getNombreU().equals(""));
					do {
						sc.nextLine();
						System.out.print("\t\tIngrese el área: (mínimo 5 y un máximo de 20 caracteres.) ");
						area = adm.validarArea(leer.next().trim());
					} while(adm.getArea().equals(""));
					do {
						System.out.print("\t\tIngrese su experiencia previa: (máximo 100 caracteres.) ");
						expPrevia = adm.validarExperiencia(sc.nextLine().trim());
					} while(adm.getExpPrevia().equals(""));
					do {
						System.out.print("\t\tIngrese fecha de nacimiento: (DD/MM/AAAA) ");
						fechaNac = adm.ingresarFecha(leer.next().trim());
					} while(adm.getFecNac().equals(""));
					tipoAdm = "administrativo";
					adm2 = new Administrativo(run, nombre, fechaNac, area, expPrevia, tipoAdm);
					con.almacenarAdministrativo(adm2);
					break;
				case 4:
					System.out.println("\tIngrese Datos de la Capacitación.");
					System.out.println("\t\tEl numero de la Capacitación es " + capa.numID());
					do {
						System.out.print("\t\tIngrese rut del cliente: ");
						rutCliente = capa.validarRun(leer.next().trim());
					} while (capa.getRutCliente().equals(""));
					do{
						System.out.print("\t\t1.Lunes||2.Martes||3.Miercoles||4.jueves||5.viernes||6.sabado||7.domingo: ");
						diaCapacitacion = capa.validarDia(leer.next());
						
					} while(capa.getDia().equals(""));
					do {
						System.out.print("\t\tIngrese la hora de la capacitación (HH:MM)(desde 00 a 23 hrs.) ");
						horaFinal = capa.validarHora(leer.next().trim());
					} while(capa.getHora().equals(""));
					
					do {
						sc.nextLine();
						System.out.print("\t\tIngrese el lugar de la capacitación (mínimo 10 y un máximo de 50 caracteres.): ");
						lugar = capa.validarLugar(sc.nextLine().trim());
					} while(capa.getLugar().equals(""));
					do {
						System.out.print("\t\tIngrese duración de la capacitación (máximo 70 caracteres): ");
						duracion = capa.validarDuracion(sc.nextLine().trim());
					} while(capa.getDuracion().equals("") && capa.getDuracion().length() <= 70);
					 do {
							System.out.print("\t\tIngrese cantidad de asistentes (máximo 1000): ");
							cantAsistentes = capa.validarCantidad(leer.nextInt());
						} while(capa.getCantAsistentes() < 0 && capa.getCantAsistentes() > 1001);
					 capa2 = new Capacitacion(rutCliente,diaCapacitacion,horaFinal,lugar,duracion,cantAsistentes);
					 con.almacenarCapacitacion(capa2);
					break;
				case 5:
					System.out.println("\tIngrese Datos del Cliente.");
					System.out.print("Ingrese rut a eliminar: ");
					String rutEliminar = leer.next().trim();
					con.eliminarUsuarios(rutEliminar);
					break;
				case 6:
					con.listarUsuarios();
					break;
				case 7:
					int opTipo = 0;
					String tipo;
					do {
						System.out.println("\tListar Datos de los Usuarios por tipo.");
						System.out.println("\t\t1.Cliente.\n\t\t2.Profesional.\n\t\t3.Administrativo.\n");
						System.out.print("Ingrese tipo de usuario a mostrar: ");
						opTipo = leer.nextInt();
						switch (opTipo) {
						case 1:
							tipo = "cliente";
							con.listarTipoUsuario(tipo);
							break;
						case 2:
							tipo = "profesional";
							con.listarTipoUsuario(tipo);
							break;
						case 3:
							tipo = "administrativo";
							con.listarTipoUsuario(tipo);
							break;
						default:
							System.out.println("\t\tOpción no válida.");
						} 
					}while(opTipo >= 1 && opTipo <= 3);
					break;
				case 8:
					con.listarCapacitaciones();
					break;
				}
			} while(op!=9);
	        System.out.print("\n\tPara volver al Menú Principal presione 's', \n"
	                + "\t\tde lo contrario presione otra tecla y luego ENTER.\n");
	        tecla = sc.next().trim();
		} while(tecla.equals("s") || tecla.equals("S"));
		System.out.println("\tHasta luego, gracias por confiar en nosotros.");
	sc.close();
	leer.close();
	}
}
