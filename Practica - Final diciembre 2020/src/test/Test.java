package test;
import java.time.LocalDate;
import java.time.LocalTime;

import modelo.OperadorMovil;
import modelo.Sistema;

public class Test {
	
	public static void main(String[] args) throws Exception {
		Sistema pruebaSistema = new Sistema();
		
		System.out.println("1-1)");
		try {
			System.out.println(pruebaSistema.agregarSMS(LocalDate.of(2020, 12, 11), LocalTime.of(17, 37), 1523456780, 156543210, "Voy a llegar más tarde", new OperadorMovil(1, "Personal"), new OperadorMovil(2, "Claro")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("1-2)");
		System.out.println(pruebaSistema.agregarSMS(LocalDate.of(2020, 12, 11), LocalTime.of(17, 37), 1523456780, 1565432109, "Voy a llegar más tarde", new OperadorMovil(1, "Personal"), new OperadorMovil(2, "Claro")));
	
		System.out.println("1-3)");
		try {
			System.out.println(pruebaSistema.agregarEmail(LocalDate.of(2020, 12, 11), LocalTime.of(17, 37), "informacion@unla.gob.ar", "alumno.com", "Información - UNLa", "Estimado alumno, le enviamos el protocolo para rendir el examen final virtual"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("1-4)");
		System.out.println(pruebaSistema.agregarEmail(LocalDate.of(2020, 12, 11), LocalTime.of(17, 37), "informacion@unla.gob.ar", "alumno@gmail.com", "Información - UNLa", "Estimado alumno, le enviamos el protocolo para rendir el examen final virtual"));
		
		System.out.println("2-1)");
		System.out.println(pruebaSistema.traerMensaje(1));
		pruebaSistema.traerMensaje(1).cambiarDeEstado(true);
		
		System.out.println("2-2)");
		System.out.println(pruebaSistema.traerMensaje(2));
		pruebaSistema.traerMensaje(2).cambiarDeEstado(true);
		
		System.out.println("3)");
		System.out.println(pruebaSistema.agregarSMS(LocalDate.of(2020, 12, 15), LocalTime.of(12, 03), 1523456780, 1598760883, "Recibido OK", new OperadorMovil(3, "Movistar"), new OperadorMovil(2, "Claro")));
		System.out.println(pruebaSistema.agregarSMS(LocalDate.of(2020, 12, 10), LocalTime.of(13, 16), 1523456780, 1598768250, "Gracias", new OperadorMovil(1, "Personal"), new OperadorMovil(3, "Movistar")));
		System.out.println(pruebaSistema.agregarEmail(LocalDate.of(2020, 11, 8), LocalTime.of(17, 15), "oo1@unla.gob.ar", "alumno@gmail.com.ar", "Orientación a Objetos 1 - UNLa", "Se adjunta la grilla de inscripciones al final de Diciembre"));
		System.out.println(pruebaSistema.agregarEmail(LocalDate.of(2020, 11, 10), LocalTime.of(8, 19), "informacion@gmail.gob.ar", "cliente@gmail.com", "Ofertas", "Aproveche nuestras Ofertas"));
		
		System.out.println("4-1)");
		System.out.println(pruebaSistema.traerMensaje("Personal"));
		
		System.out.println("4-2)");
		System.out.println(pruebaSistema.traerMensaje(LocalDate.of(2020, 12, 10), LocalTime.of(8, 0), LocalTime.of(14, 0)));
	
		System.out.println("5)");
		System.out.println(pruebaSistema.traerMensaje(LocalDate.of(2020, 12, 10), LocalTime.of(8, 0), LocalTime.of(14, 0), "1"));
	}
}
