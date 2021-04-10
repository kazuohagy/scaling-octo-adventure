package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
	String[] lines = new String[] {"Mario", "Luigi","Pocahontas"};
	String path = "c:\\teste\\out.txt";
	//INSERINDOS DADOS E CRIANDO ARQUIVOS OU ATUALIZANDO DADOS
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
		for(String s : lines) {
			bw.write(s);
			bw.newLine();
		}
	}catch(IOException e) {
		e.getStackTrace();
	}
}
}
