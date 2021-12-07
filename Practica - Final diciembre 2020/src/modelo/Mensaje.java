package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Mensaje {
	protected int idMensaje;
	protected LocalDate fechaEnvio;
	protected LocalTime horaEnvio;
	
	public Mensaje(int idMensaje, LocalDate fechaEnvio, LocalTime horaEnvio) {
		this.idMensaje = idMensaje;
		this.fechaEnvio = fechaEnvio;
		this.horaEnvio = horaEnvio;
	}

	public int getIdMensaje() {
		return idMensaje;
	}

	public LocalDate getFechaEnvio() {
		return fechaEnvio;
	}

	public LocalTime getHoraEnvio() {
		return horaEnvio;
	}

	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}

	public void setFechaEnvio(LocalDate fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public void setHoraEnvio(LocalTime horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", fechaEnvio=" + fechaEnvio + ", horaEnvio=" + horaEnvio + "]";
	}
	
	public abstract void cambiarDeEstado(boolean estadoNuevo);
}
