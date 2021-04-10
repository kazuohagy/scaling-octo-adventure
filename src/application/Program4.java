package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		//pega o nome
		System.out.println("getName: " + path.getName());
		//pega so o caminho sem o nome arquivo
		System.out.println("getParent: " + path.getParent());
		//pega o diretorio inteiro
		System.out.println("getPath: " + path.getPath());
		
	}
}
