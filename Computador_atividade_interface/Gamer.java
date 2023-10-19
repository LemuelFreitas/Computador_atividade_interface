package Computador_atividade_interface;

public class Gamer implements Computador{
@Override
public void ligar() {
	System.out.println("ligando o PC GAMER");
}
@Override
public void desligar() {
	System.out.println("desligando o PC GAMER");
}
@Override
public void reiniciar() {
	System.out.println("reiniciando o PC GAMER");
}
@Override
public void carregandoSistema() {
	System.out.println("carregando o sistema do PC GAMER");
}
}
