import java.io.*;

public class LecturePaire {

	/***
	 Ce programme doit prendre un fichier texte en parametre et retourner les lignes paires dans la sortie standard.
	 Pour cela, on peut supprimer une ligne sur deux ou copier une ligne sur deux du fichier.
	 ***/
	
	public static void main(String args[]){
		
		File file = new File(args[0]);
		boolean lignePaire = false;
		String ligne_courante = "";
		
		try{
			Reader reader = new BufferedReader(new FileReader(file));
	        StreamTokenizer stoken = new StreamTokenizer(reader);
	        int token = stoken.nextToken();
	        
	        while(token != StreamTokenizer.TT_EOF){
	        	
	        	System.out.println(stoken.sval);
	        	
	        	if(lignePaire == true){
	        		ligne_courante = ligne_courante + stoken.sval;
	        		
	        	}
	        	if(token == StreamTokenizer.TT_EOL){
	        		System.out.println("Fin de ligne !");
	        		
	        		if(lignePaire == true){
	        			lignePaire = false;
	        		}else{
	        			lignePaire = true;
	        		}
	        	}
	        	token = stoken.nextToken();
	        }
	        System.out.println(ligne_courante);

		}catch(Exception e){
			System.out.println("Erreur !");
			e.printStackTrace();
		}
	}
}
