import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GestorIncidencia {

	public static void main(String[] args) {
		
		try {
							       
           //**hacer un menu con opciones para: ABM cliente -- Repotar  Incidente--listar técnicos - salir
			//en un bucle que me permita seguir ejecutando hasta que seleccione salir/terminar
			//cada llamado funciona bien por separado, cuando se ejecuta todo junto da un error en Scanner
			//veamos si se soluciona con el menu

	       //*******Instancia un empleado nvo
		   ConexionDB.conexionDB();//
	       Empleado emp1 = Empleado.altaEmpleado();
	       ConexionDB.altaEmpleadoDB(emp1);
	       ConexionDB.closeConX();
     
	     /*
	       //*******Instancia un soporte nvo // 
	       ConexionDB.conexionDB();
	       SoporteServicio sop1 = SoporteServicio.altaSoporte();
      	   ConexionDB.altaSoporteDB(sop1);
      	   ConexionDB.closeConX();
	   
	       //*******Instancia un cliente nvo
	       //lista de los soportes para que el cliente elija
      	   ConexionDB.conexionDB();
		   ConexionDB.listarSoporte();
		   ConexionDB.closeConX();

		   ConexionDB.conexionDB();
	       Cliente cli1 = Cliente.altaCliente();
	       ConexionDB.altaClienteDB(cli1);
	       ConexionDB.closeConX();
	          

	       //*******Instancia un tecnico nvo
		   //*******LISTA LOS EMPLEADOS
	       ConexionDB.conexionDB();
	       ConexionDB.listarEmpleado();
	       ConexionDB.closeConX();
		   
	       //*******BUSCA EMPELADO POR CUIT	
		   //ConexionDB.buscarEmpleado();
	       ConexionDB.conexionDB();
	       Tecnico tec1 = Tecnico.altaTecnico();
	       ConexionDB.altaTecnicoDB(tec1);
	       ConexionDB.closeConX();
	    
	      
	       //*******Instancia un incidente nvo
	       ConexionDB.conexionDB();
	       Incidente inc1 = Incidente.altaIncidente();
	       ConexionDB.altaIncidenteDB(inc1);
	       ConexionDB.closeConX();
	             */
		}
		catch(Exception obj) {
		    	
		    System.out.println("Error en ABM de la base de datos MAIN");
		    System.out.println(obj.fillInStackTrace());
		    }

	}
		
}
	
