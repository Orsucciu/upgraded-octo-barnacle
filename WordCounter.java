import java.io.*;
import java.util.Scanner;

//Exercice 2 du tp

public class WordCounter {

	public static void main(String args[]){
	
		File file = new File(args[0]);
		String mot = args[1];
		int count = 0;
		
		try{
			Reader reader = new BufferedReader(new FileReader(file));
	        StreamTokenizer stoken = new StreamTokenizer(reader);
	        
	        boolean eof = false;
	        
	        while(eof != true){
	        	
	        	int token = stoken.nextToken();
	        	if(token == StreamTokenizer.TT_WORD){
	        		if(mot.equals(stoken.sval)){
	        			count++;
	        		}
	        	}else if(token == StreamTokenizer.TT_EOF){
	        		eof = true;
	        		System.out.println("Fin du fichier");
	        	}
	        }
	        System.out.println("Nombre d'occurences : " + count);

			
		}catch(Exception e){
			System.out.println("Erreur !");
			e.printStackTrace();
		}
	}
}
