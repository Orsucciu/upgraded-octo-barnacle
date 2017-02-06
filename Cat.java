import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;

//Exercice 1 du tp

public class Cat {

	public static void main(String args[]){
		
		String sCurrentLine;
		try{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
		
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			br.close();
		}catch(Exception e){
			
			System.out.println("Erreur ! fichier introuvable, ou illisible.");
		}
	}
}
