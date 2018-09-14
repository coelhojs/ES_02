package Questão_02;

public class Televisao {
	private int volume;
	private int canal;

	public Televisao(int volume, int canal) {
		this.volume = volume;
		this.canal = canal;
	}

	public Televisao() {
		this.volume = 0;
		this.canal = 0;
	};

	public int getVolume() {
		return volume;
	}

	public int getCanal() {
		return canal;
	}

	public void aumentarVolume1() {
		this.volume++;
	}

	public void diminuirVolume1() {
		if (this.volume <= 0) {
			System.out.println("Volume já está em 0!");
		} else {

			this.volume--;
		}
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void aumentarCanal1() {
		this.canal++;
	}

	public void diminuirCanal1() {
		if (this.canal <= 0) {
			System.out.println("Canal já está em 0!");
		} else {

			this.canal--;
		}
	}

}
