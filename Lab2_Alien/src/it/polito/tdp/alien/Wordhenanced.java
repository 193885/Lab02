package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class Wordhenanced {
	
	private String alienWord;
	private List<String> translations=new LinkedList<>();
	
	public Wordhenanced(String alienWord,String traduzione) {
	
		this.alienWord=alienWord;
		this.translations.add(traduzione);	
	}

	public String getAlienWord() {
		return alienWord;
	}
	
	public String getTranslations() {
		
		String result="";
		
		for(String s :translations)
				
			result+=" "+s;
		
		return result;
	}

	public void addTranslate(String translate) {
		translations.add(translate);	
	}

	public boolean contiene(String translate) {

		if(translations.contains(translate))
			
			return true;
		
		else

			return false;
	}
}