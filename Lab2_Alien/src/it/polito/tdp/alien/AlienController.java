package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private AlienDictionary dizionario = new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
    
    @FXML
    void doTranslate(ActionEvent event) {
    	
	    	String [] nuovaParola= txtWord.getText().split(" ");
	    	txtWord.clear();  //per pulire il campo d'inserimento
	    	txtResult.clear();
	    	
	    	if(nuovaParola[0].matches("[a-zA-Z]+")==false){
	    		 txtResult.clear();
	    		 txtResult.appendText("parola errata!");
	    		 return;   //per imperdire al programma di funzionare lo stesso anche se regex fallita
	    	}
	    	
		    	if(nuovaParola.length==2){ // per inserire parola
		    			    			    		
			    		//se non c'è la parola in dizionario  l'aggiungo 
			    		
			        	dizionario.addWord(nuovaParola[0].toLowerCase(),nuovaParola[1].toLowerCase());	
		    	}
		    	
		    	else{ //per ottenere la traduzione della parola 
		    			txtResult.clear();
		        		txtResult.appendText(dizionario.translateWord(nuovaParola[0].toLowerCase()));
		    	}
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	txtWord.clear();
    	dizionario.destroy();

    }
    
}