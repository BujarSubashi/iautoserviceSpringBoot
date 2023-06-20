package com.cindytech.iautoservice.main;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.ResourceBundle;

public class TestLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*ResourceBundle lingua = ResourceBundle.getBundle("config");
		String linguaConfigurata = lingua.getString("lingua.config");
		
		System.out.println("LINGUA: "+linguaConfigurata);
		
		ResourceBundle language = ResourceBundle.getBundle("lang/language", new Locale(linguaConfigurata));
		String welcomeMessage = language.getString("welcome.message");
		String goodbayMessage = language.getString("goodbay.message");
		System.out.println(welcomeMessage); 
		System.out.println(goodbayMessage); 
		
		String addButton = language.getString("add.button");
		String updateButton = language.getString("update.button");
		String deleteButton = language.getString("delete.button");
		System.out.println(addButton);
		System.out.println(updateButton);
		System.out.println(deleteButton);**/
		
		ResourceBundle config = ResourceBundle.getBundle("config");
		String user = config.getString("user.db");
		
		System.out.println("ENCODED USER: "+user);
		
		byte[] decoded = Base64.getDecoder().decode(user);
		String decodedUser = new String(decoded, StandardCharsets.UTF_8);
		
		System.out.println("DECODED USER: "+decodedUser);
	}
}
