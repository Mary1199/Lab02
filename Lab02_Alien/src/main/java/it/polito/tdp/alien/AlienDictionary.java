package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	
	// List<Word> SOLUZIONE 1
	List<WordEnhanced> dizionario = new LinkedList<WordEnhanced>();
	                                      
	                                  
   public void addWord(String alienWord, String translation) {
	   
	   //SOLUZIONE ESERCIZIO 1 
	  /*Word p = new Word(alienWord, translation);
	  
	  for(Word d : dizionario) {
		  if(d.getAlienWord().equals(alienWord)) {
			  dizionario.remove(d);
			  dizionario.add(p);                     
			  return;
		  }
	  }
	  dizionario.add(p);
	  return;*/
	 
	   //SOLUZIONE ESERCIZIO 2   
	   WordEnhanced p = new WordEnhanced(alienWord);
		if (dizionario.contains(p)) {
			dizionario.get(dizionario.indexOf(p)).setTranslation(translation);
			return;
		}
		p.setTranslation(translation);
		dizionario.add(p);
	 }
   
   public String translateWord(String alienWord) {
	   
	   //SOLUZIONE ESERCIZIO 1
	   /* for(Word d : dizionario) {
		   if(d.getAlienWord().equals(alienWord)) {
			   return d.getTranslation();
		   }
	   }
	   return null; */
	   
	   //SOLUZIONE ESERCIZIO 2
	   WordEnhanced w = new WordEnhanced(alienWord);
		if (dizionario.contains(w)) {
			return dizionario.get(dizionario.indexOf(w)).getTranslation();
		}
		return null;
	   
   }
   
   public void resetDictionary(){
		dizionario.clear(); 
	}
}
