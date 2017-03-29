package apsii;

public class Lampada implements EstadoLampada {
	@SuppressWarnings("unused")
	private int estadoDaLampada;
	public static final int on = 1; // liga lampada 
	public static final int off = 2; // desliga lampada
	public static final int pisca = 3; // pisca
	
	public void ligar(){
		estadoDaLampada = on;
		System.out.println("Lampada ligada");
	}
	public void desligar(){
		estadoDaLampada = off;
		System.out.println("Lampada desligada");
	}
	public void piscar(){
		estadoDaLampada = pisca;
		System.out.println("Lampada piscando");
	}
	public static int getOn() {
		return on;
	}
	public static int getOff() {
		return off;
	}
	public static int getPisca() {
		return pisca;
	}
		
}
	
	