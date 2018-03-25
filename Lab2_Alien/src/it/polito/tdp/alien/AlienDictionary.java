package it.polito.tdp.alien;

import java.util.TreeMap;
import java.util.Iterator;

public class AlienDictionary {
	
	private TreeMap <String,WordEnhanced> paroleAliene;
	
	public AlienDictionary() {
		
		paroleAliene= new TreeMap <>();
	}

	public void addWord(String alienWord, String translate){
	
		if(paroleAliene.isEmpty()==true){  //prima parola inserita
			
			paroleAliene.put(alienWord,new WordEnhanced(alienWord, translate));					
		
		}
		
		else{
						//parola nuova
			if(!paroleAliene.containsKey(alienWord)){
				
				paroleAliene.put(alienWord,new WordEnhanced(alienWord, translate));
			}
			
			else{	//parola presente con traduzione diversa
				
				WordEnhanced temp = paroleAliene.get(alienWord);
				
				Iterator <WordEnhanced> iter = paroleAliene.values().iterator();
				
				while (iter.hasNext()) {
					WordEnhanced str = iter.next();

				    if(str.getAlienWord().compareTo(alienWord)==0 && str.contiene(translate)==false)
				        iter.remove();
				    else if(str.getAlienWord().compareTo(alienWord)==0 && str.contiene(translate)==true)
				    	return ;
				}			
						temp.addTranslate(translate);
						paroleAliene.put(alienWord,temp);			
			}
		}	
	}

/*	public boolean cerca(String parolaDaCercare) {
		
		for(Wordhenanced p : paroleAliene){
		
		//	if(p.equals(parolaDaCercare))
			
			if(p.getAlienWord().compareTo(parolaDaCercare)==0)
						
				return true;
		}
				
			return false;
	}
*/
	public String translateWord(String word) {
		
		if(paroleAliene.containsKey(word))
				
			return paroleAliene.get(word).getTranslations();
	
		else				
		
			return "null";
	}

	public void destroy() {
		
		paroleAliene.keySet().clear();
		paroleAliene.values().clear();
		
	}
}