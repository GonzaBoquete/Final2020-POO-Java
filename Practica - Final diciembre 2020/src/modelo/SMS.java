package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class SMS extends Mensaje {
	private int numeroOrigen;
	private int numeroDestino;
	private String texto;
	private boolean visto;
	private OperadorMovil operadorOrigen;
	private OperadorMovil operadorDestino;
		
	public SMS(int idMensaje, LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino,
			String texto, boolean visto, OperadorMovil operadorOrigen, OperadorMovil operadorDestino) throws Exception {
		super(idMensaje, fechaEnvio, horaEnvio);
		this.setNumeroOrigen(numeroOrigen);
		this.setNumeroDestino(numeroDestino);
		this.texto = texto;
		this.visto = visto;
		this.operadorOrigen = operadorOrigen;
		this.operadorDestino = operadorDestino;
	}
	
	public int getNumeroOrigen() {
		return numeroOrigen;
	}

	public int getNumeroDestino() {
		return numeroDestino;
	}

	public String getTexto() {
		return texto;
	}

	public boolean isVisto() {
		return visto;
	}

	public OperadorMovil getOperadorOrigen() {
		return operadorOrigen;
	}

	public OperadorMovil getOperadorDestino() {
		return operadorDestino;
	}

	public void setNumeroOrigen(int numeroOrigen) throws Exception {
		if(String.valueOf(numeroOrigen).length()!=10)throw new Exception("ERROR: El numero de origen ingresado no es de 10 digitos.");
		this.numeroOrigen = numeroOrigen;
	}

	public void setNumeroDestino(int numeroDestino) throws Exception {
		if(String.valueOf(numeroDestino).length()!=10)throw new Exception("ERROR: El numero de destino ingresado no es de 10 digitos.");
		this.numeroDestino = numeroDestino;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public void setOperadorOrigen(OperadorMovil operadorOrigen) {
		this.operadorOrigen = operadorOrigen;
	}

	public void setOperadorDestino(OperadorMovil operadorDestino) {
		this.operadorDestino = operadorDestino;
	}
	
	@Override
	public String toString() {
		return "SMS [numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", texto=" + texto
				+ ", visto=" + visto + ", operadorOrigen=" + operadorOrigen + ", operadorDestino=" + operadorDestino
				+ ", idMensaje=" + idMensaje + ", fechaEnvio=" + fechaEnvio + ", horaEnvio=" + horaEnvio + "]";
	}

	@Override
	public void cambiarDeEstado(boolean estadoNuevo) {
		this.setVisto(estadoNuevo);
	}
}
