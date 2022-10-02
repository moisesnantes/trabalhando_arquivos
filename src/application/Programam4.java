package application;

import java.io.File;
import java.util.Scanner;

public class Programam4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILEC: ");
		
		for (File file : files) {
			System.out.println(file);
			
			
		}
		
		boolean success = new File(strPath + "\\subir").mkdir();
		System.out.println("Directory created sucessfully: " + success);
		
		
		
		
		sc.close();
		

	}

}
