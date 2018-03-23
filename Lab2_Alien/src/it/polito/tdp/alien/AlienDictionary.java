package it.polito.tdp.alien;

import java.util.List;
import java.util.LinkedList;

public class AlienDictionary {
	
	private List <Word> paroleAliene;
	
	public AlienDictionary() {
		
		paroleAliene= new LinkedList<>();
	}

	public void addWord(Word parola){
				
		paroleAliene.add(parola);
	
	}

	@Override
	public String toString() {
		return "AlienDictionary [paroleAliene=" + paroleAliene + "]";
	}

	public boolean cerca(String parolaDaCercare) {
		
		for(Word p : paroleAliene){
		
		if(p.getAlienWord().compareTo(parolaDaCercare)==0)
			
		//	paroleAliene.remove(p);
				
			return true;
		}
				
			return false;
	}

	public String getTransaltion(String word) {
		
		for(Word p : paroleAliene){
			
			if(p.getAlienWord().compareTo(word)==0)
				
				return p.getTranslation();
		}
				
		return "";
	}

}
