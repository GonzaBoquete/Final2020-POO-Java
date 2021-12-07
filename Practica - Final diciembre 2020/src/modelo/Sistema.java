package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Mensaje> listaMensajes = new ArrayList<Mensaje>();

	public Sistema() {}
	
	public Mensaje traerMensaje(int idMensaje) {
		Mensaje auxMensaje = null;
		int i = 0;
		
		while(auxMensaje==null && i<listaMensajes.size()) {
			if(idMensaje == listaMensajes.get(i).getIdMensaje()) {
				auxMensaje = listaMensajes.get(i);
			}
			i++;
		}
		return auxMensaje;
	}
	
	public List<Mensaje> traerMensaje(String nombreCompania){
		List<Mensaje> auxLstMensajes = new ArrayList<Mensaje>();
		
		for(int i=0; i<listaMensajes.size(); i++) {
			if(listaMensajes.get(i) instanceof SMS) {
				SMS auxSMS = (SMS)listaMensajes.get(i);
				if(nombreCompania.equals(auxSMS.getOperadorOrigen().getCompaniaMovil())) {
					auxLstMensajes.add(listaMensajes.get(i));
				}
			}
		}
		return auxLstMensajes;
	}
	
	public List<Mensaje> traerMensaje(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta){
		List<Mensaje> auxLstMensajes = new ArrayList<Mensaje>();
		
		for(int i=0; i<listaMensajes.size(); i++) {
			if(fecha.isEqual(listaMensajes.get(i).getFechaEnvio())) {
				if(!horaDesde.isAfter(listaMensajes.get(i).getHoraEnvio()) && !horaHasta.isBefore(listaMensajes.get(i).getHoraEnvio())) {
					auxLstMensajes.add(listaMensajes.get(i));
				}
			}
		}
		return auxLstMensajes;
	}
	
	public List<Mensaje> traerMensaje(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta, String codigoCompania){
		List<Mensaje> auxLstMensajes = new ArrayList<Mensaje>();
		
		for(int i=0; i<listaMensajes.size(); i++) {
			if(fecha.isEqual(listaMensajes.get(i).getFechaEnvio())) {
				if(!horaDesde.isAfter(listaMensajes.get(i).getHoraEnvio()) && !horaHasta.isBefore(listaMensajes.get(i).getHoraEnvio())) {
					if(listaMensajes.get(i) instanceof SMS) {
						SMS auxSMS = (SMS)listaMensajes.get(i);
						if(codigoCompania.equals(String.valueOf(auxSMS.getOperadorOrigen().getCodigoMovil()))){
							auxLstMensajes.add(listaMensajes.get(i));
						}
					}
				}
			}
		}
		return auxLstMensajes;
	}
	
	public boolean agregarEmail(LocalDate fechaEnvio, LocalTime horaEnvio, String origen, String destino , String asunto, String cuerpo) throws Exception {
		Email auxEmail = new Email(1, fechaEnvio, horaEnvio, origen, destino, asunto, cuerpo, false);
		if(!listaMensajes.isEmpty()) {
			auxEmail.setIdMensaje(listaMensajes.get(listaMensajes.size()-1).getIdMensaje() +1);
		}
		return listaMensajes.add(auxEmail);
	}
	
	public boolean agregarSMS(LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino, String texto, OperadorMovil operadorOrigen, OperadorMovil operadorDestino) throws Exception {
		SMS auxSms = new SMS(1, fechaEnvio, horaEnvio, numeroOrigen, numeroDestino, texto, false, operadorOrigen, operadorDestino);
		if(!listaMensajes.isEmpty()) {
			auxSms.setIdMensaje(listaMensajes.get(listaMensajes.size()-1).getIdMensaje() +1);
		}
		return listaMensajes.add(auxSms);
	}
}





