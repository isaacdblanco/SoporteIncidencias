import java.sql.*;
import java.util.Scanner;
public class GestorIncidencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			boolean salir = false;

			while (!salir) {
				mostrarMenu();
				if (scanner.hasNextInt()){
				int opcion = scanner.nextInt();

				switch (opcion) {
					case 1:
						altaEmpleado();
						break;
					case 2:
						altaSoporte();
						break;
					case 3:
						listarSoportes();
						break;
					case 4:
						altaCliente();
						break;
					case 5:
						listarEmpleados();
						break;
					case 6:
						altaTecnico();
						break;
					case 7:
						altaIncidente();
						break;
					case 8:
						salir = true;
						System.out.println("Gracias Arg Programa. ¡Unos genios!");
						break;
					default:
						System.out.println(" Por favor, ingrese una opción válida(un num de la lista.");
				}
			} else {
					System.out.println("Entrada no válida. Por favor, ingrese un número.");
					scanner.next(); // Para limpiar el buffer del scanner
				}
		}
		} catch (Exception e) {
			System.out.println("Error en el manejo de incidencias en el programa principal");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static void mostrarMenu() {
		System.out.println("----- Menú -----");
		System.out.println("1. Alta Empleado");
		System.out.println("2. Alta Soporte");
		System.out.println("3. Listar Soportes");
		System.out.println("4. Alta Cliente");
		System.out.println("5. Listar Empleados");
		System.out.println("6. Alta Técnico");
		System.out.println("7. Alta Incidente");
		System.out.println("8. Salir");
		System.out.print("Seleccione una opción: ");
	}

	// Aca empezamos a definir los metodos
	private static void altaEmpleado() throws SQLException {
		ConexionDB.conexionDB();//
		Empleado emp1 = Empleado.altaEmpleado();
		ConexionDB.altaEmpleadoDB(emp1);
		ConexionDB.closeConX();
		System.out.println("Ejecutando Alta Empleado");
	}

	private static void altaSoporte() throws SQLException {
		ConexionDB.conexionDB();
		SoporteServicio sop1 = SoporteServicio.altaSoporte();
		ConexionDB.altaSoporteDB(sop1);
		ConexionDB.closeConX();
		System.out.println("Ejecutando Alta Soporte");
	}

	private static void listarSoportes() throws SQLException {
		ConexionDB.conexionDB();
		ConexionDB.listarSoporte();
		ConexionDB.closeConX();
		System.out.println("Ejecutando Listar Soportes");
	}

	private static void altaCliente() throws SQLException {
		ConexionDB.conexionDB();
		Cliente cli1 = Cliente.altaCliente();
		ConexionDB.altaClienteDB(cli1);
		ConexionDB.closeConX();
		System.out.println("Ejecutando Alta Cliente");
	}

	private static void listarEmpleados() throws SQLException {
		ConexionDB.conexionDB();
		ConexionDB.listarEmpleado();
		ConexionDB.closeConX();
		System.out.println("Ejecutando Listar Empleados");
	}

	private static void altaTecnico() throws SQLException {
		ConexionDB.conexionDB();
		ConexionDB.listarEmpleado();
		ConexionDB.closeConX();
		ConexionDB.conexionDB();
		Tecnico tec1 = Tecnico.altaTecnico();
		ConexionDB.altaTecnicoDB(tec1);
		ConexionDB.closeConX();
		System.out.println("Ejecutando Alta Técnico");
	}

	private static void altaIncidente() throws SQLException {
		ConexionDB.conexionDB();
		Incidente inc1 = Incidente.altaIncidente();
		ConexionDB.altaIncidenteDB(inc1);
		ConexionDB.closeConX();
		System.out.println("Ejecutando Alta Incidente");
	}
}

	
