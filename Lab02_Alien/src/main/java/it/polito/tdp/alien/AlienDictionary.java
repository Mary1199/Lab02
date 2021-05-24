package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	
	List<Word> dizionario = new LinkedList<Word>();
	
   public void addWord(String alienWord, String translation) {
	   
	  Word p = new Word(alienWord, translation);
	  
	  for(Word d : dizionario) {
		  if(d.getAlienWord().equals(alienWord)) {
			  dizionario.remove(d);
			  dizionario.add(p);
			  return;
		  }
	  }
	  dizionario.add(p);
	  return;
   }
   
   public String translateWord(String alienWord) {
	   for(Word d : dizionario) {
		   if(d.getAlienWord().equals(alienWord)) {
			   return d.getTranslation();
		   }
	   }
	   return null;
   }
   
   public void resetDictionary(){
		dizionario.clear();
	}
}
