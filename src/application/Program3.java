package application;

import java.io.File;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folder: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		System.out.println("File:");
		for(File file : files ) {
			System.out.println(file);
		}
		boolean sucess =new File(strPath + "\\Street Fighter").mkdir();
		System.out.print("Directory created successfully: "+sucess);
		
	}
}
