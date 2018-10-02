package Aula_01a04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Aula04Arquivos {

	public static void main(String[] args) throws Exception {
		
		File file = new File("src/Series.txt");

		BufferedReader bufRdr  = new BufferedReader(
		    new InputStreamReader(new FileInputStream(file),"ISO-8859-1"));
		String linha = null;
		linha = bufRdr.readLine(); 

		while (linha != null) {
			linha = bufRdr.readLine();
			String campos [] = linha.split(";");
			System.out.println(campos[0]); 
		}
		
		bufRdr.close();

	}

}
