package co.com.brayandrc.logic;

public class Cliente {
	
	private String nombreUsuario;
	private String mensajeUsuario;
	
	public String getNombreUsuario(){
		
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombre){
		this.nombreUsuario = nombre;
	}
	
	public String getmensajeUsuario(){
		
		return mensajeUsuario;
	}
	
	public void setMensajeUsuario(String msj){
		this.mensajeUsuario = msj;
	}
	
	
	
}
