import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;

//Exercice 1 du tp

public class CatFileInputStream {

		public static void main(String args[]){
			
			File file = new File(args[0]);
			FileInputStream fileInput = null;
			
			try{
				
				fileInput = new FileInputStream(file);

				int content;
				while ((content = fileInput.read()) != -1) {
					// convert to char and display it
					System.out.print((char) content);
				}
				fileInput.close();
			}catch(Exception e){
				System.out.println("Erreur !");
			}
			
		}
}
