package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Email extends Mensaje {
	private String origen;
	private String destino;
	private String asunto;
	private String cuerpo;
	private boolean recibido;
	
	public Email(int idMensaje, LocalDate fechaEnvio, LocalTime horaEnvio, String origen, String destino, String asunto, String cuerpo, boolean recibido) throws Exception {
		super(idMensaje, fechaEnvio, horaEnvio);
		this.setOrigen(origen);
		this.setDestino(destino);
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.recibido = recibido;
	}
	
	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public String getAsunto() {
		return asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public boolean isRecibido() {
		return recibido;
	}

	public void setOrigen(String origen) throws Exception {
		if(origen.indexOf("@")== -1)throw new Exception("ERROR: El mail de origen no contiene @");
		this.origen = origen;
	}

	public void setDestino(String destino) throws Exception {
		if(destino.indexOf("@")== -1)throw new Exception("ERROR: El mail de destino no contiene @");
		this.destino = destino;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public void setRecibido(boolean recibido) {
		this.recibido = recibido;
	}
	
	@Override
	public String toString() {
		return "Email [origen=" + origen + ", destino=" + destino + ", asunto=" + asunto + ", cuerpo=" + cuerpo
				+ ", recibido=" + recibido + ", idMensaje=" + idMensaje + ", fechaEnvio=" + fechaEnvio + ", horaEnvio="
				+ horaEnvio + "]";
	}

	@Override
	public void cambiarDeEstado(boolean estadoNuevo) {
		this.setRecibido(estadoNuevo);
	}

}
