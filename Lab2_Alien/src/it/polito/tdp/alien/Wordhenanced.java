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
	
	public boolean contieneTrad(String translation){
		
		if(translations.contains(translation))
		
		return true;
		
		else 
			
			return false;	
	}
	
	public String getTranslations() {
		
		String result="";
		
		for(String s :translations)
			
			result+=" "+s;
		
		return result;
	}

	@Override
	public String toString() {
		return "Wordhenanced [alienWord=" + alienWord + ", translations=" + translations + "]";
	}

	public void addTranslate(String translate) {
		translations.add(translate);	
	}
}