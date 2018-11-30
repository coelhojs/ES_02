import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Campeonato");
		System.out.print("Informe a quantidade de times: ");
		int quantTimes = Integer.parseInt(br.readLine());

		// Implementei a lista de times e partidas utilizando Collections, mas
		// ordenarei sem bibliotecas auxiliares.
		List<Time> times = new ArrayList<Time>();

		while (quantTimes > 0) {
			System.out.print("Nome do time " + quantTimes + ":");
			String nomeTime = br.readLine();
			Time time = new Time(nomeTime);
			times.add(time);
			quantTimes--;
		}

		System.out.print("Informe a quantidade de partidas: ");
		int quantPartidas = Integer.parseInt(br.readLine());

		while (quantPartidas > 0) {
			int pontosTime1, pontosTime2;

			System.out.println("Gols do primeiro time: ");
			int gols1 = Integer.parseInt(br.readLine());
			System.out.println("Nome do primeiro time: ");
			String time1 = br.readLine();
			System.out.println("Gols do segundo time: ");
			int gols2 = Integer.parseInt(br.readLine());
			System.out.println("Nome do segundo time: ");
			String time2 = br.readLine();
			if (gols1 < gols2) {
				pontosTime1 = 0;
				pontosTime2 = 3;
			} else if (gols2 < gols1) {
				pontosTime1 = 3;
				pontosTime2 = 0;
			} else {
				pontosTime1 = 1;
				pontosTime2 = 1;
			}
			for (Time t : times) {
				if (time1.equals(t.getNome())) {
					t.addGols(gols1);
					t.addPontos(pontosTime1);
				}
				if (time2.equals(t.getNome())) {
					t.addGols(gols2);
					t.addPontos(pontosTime2);
				}
			}
			quantPartidas--;
		}

		for (int i = 0; i < times.size(); i++) {
			Time maior = times.get(i);
			for (int j = 0; j < times.size(); j++) {
				if (times.get(j).getPontos() > times.get(i).getPontos()) {
					Time aux = times.get(i);
					maior = times.get(j);

				}
			}
		}

		System.out.println("Time:     Pontos:     Gols:");

		int i = times.size();
		int j = 0;
		while (i > 0) {
			System.out.println(times.get(j));
			i--;
			j++;
		}
	}
}
