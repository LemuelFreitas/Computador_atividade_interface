package Computador_atividade_interface;

public class Home implements Computador{
	@Override
	public void ligar() {
		System.out.println("ligando o PC Home");
	}
	@Override
	public void desligar() {
		System.out.println("desligando o PC Home");
	}
	@Override
	public void reiniciar() {
		System.out.println("reiniciando o PC Home");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("carregando o sistema do PC Home");
	}
}
