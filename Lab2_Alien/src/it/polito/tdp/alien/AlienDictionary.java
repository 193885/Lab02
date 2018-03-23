package it.polito.tdp.alien;

import java.util.List;
import java.util.LinkedList;

public class AlienDictionary {
	
	private List <Word> paroleAliene;
	
	public AlienDictionary() {
		
		paroleAliene= new LinkedList<>();
	}

	public void addWord(String alienWorld, String translate){
		
		for(Word p : paroleAliene){
		
			if(p.getAlienWord().compareTo(alienWorld)==0){
				
				paroleAliene.remove(p);
			}				
		}
		paroleAliene.add(new Word(alienWorld,translate));
	}

	@Override
	public String toString() {
		return "AlienDictionary [paroleAliene=" + paroleAliene + "]";
	}

	public boolean cerca(Word parolaDaCercare) {
		
		for(Word p : paroleAliene){
		
			if(p.equals(parolaDaCercare))
									
				return true;
		}
				
			return false;
	}

	public String translateWord(String word) {
		
		for(Word p : paroleAliene){
			
			if(p.getAlienWord().compareTo(word)==0)
				
				return p.getTranslation();
		}
				
		return "null";
	}

}
