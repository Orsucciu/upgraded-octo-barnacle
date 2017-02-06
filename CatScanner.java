import java.io.File;
import java.util.Scanner;

//Exercice 1 du tp avec scanner

public class CatScanner {
	
	public static void main(String args[]){
		
		File file = new File(args[0]);
		
		try{
			Scanner scan = new Scanner(file);
			String sortie;
			while(scan.hasNextLine() == true){
				sortie = scan.nextLine();
				System.out.println(sortie);
			}
			System.out.println("Ca marche, Mazeltov ! ");
			scan.close();
			
		}catch(Exception e){
			System.out.println("Erreur !");
			e.printStackTrace();
		}
	}
}
