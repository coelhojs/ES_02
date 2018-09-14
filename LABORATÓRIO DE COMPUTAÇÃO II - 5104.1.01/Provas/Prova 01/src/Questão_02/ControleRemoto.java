package Questão_02;

public class ControleRemoto {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		System.out.println("TELEVISAO");
		System.out.println("Volume atual: " + tv.getVolume());
		System.out.println("Canal atual: " + tv.getCanal());
		tv.aumentarVolume1();
		System.out.println("Aumentando volume em 1: " + tv.getVolume());
		tv.aumentarVolume1();
		System.out.println("Aumentando volume em mais 1: " + tv.getVolume());
		tv.diminuirVolume1();
		System.out.println("Diminuindo volume em 1: " + tv.getVolume());
		tv.aumentarCanal1();
		System.out.println("Aumentando canal em 1: " + tv.getCanal());
		tv.aumentarCanal1();
		tv.aumentarCanal1();
		tv.aumentarCanal1();
		System.out.println("Aumentando canal em mais 3: " + tv.getCanal());
		tv.diminuirCanal1();
		System.out.println("Diminuindo canal em 1: " + tv.getCanal());
		tv.setCanal(24);
		System.out.println("Escolhendo o canal 24: " + tv.getCanal());
		System.out.println("Volume atual: " + tv.getVolume());
		System.out.println("Canal atual: " + tv.getCanal());

	}
}
