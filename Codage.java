import java.io.*;

//Exercice 3 du tp

public class Codage {

	public static void main(String args[]){
		
		String entree = args[0];
		String change = args[1];
		String texte = "In Xanadu did Kubla Khan A stately pleasure-dome decree: Where Alph, the sacred river, ran Through caverns measureless to man Down to a sunless sea.";
		
		String ent[];
		String chan[];
		
		if(entree.length() == change.length()){
			
			ent = entree.split("");
			chan = change.split("");
			
			System.out.println("Le texte est : " + texte);
			System.out.println("Les " + entree + " du texte doivent etre remplaces par des " + change);
			
			for(int i=0; i < change.length(); i++){
                texte = texte.replace(ent[i],chan[i]);
            }
			
			System.out.println("le texte change est : " + texte);
			
		}else{
			System.out.println("Les deux entrees n'ont pas la meme longueur ! ");
		}
	}
}
