package com.cindytech.iautoservice.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class UpdateConfigProperty {
    public static void main(String[] args) throws IOException {
      
    	// Legge le proprietà dal file
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("resource/config.properties");
        props.load(in);
        in.close();

        // Aggiorna il valore della chiave "lingua" con il valore "it"
        props.setProperty("lingua.config", "al");

        // Scrive le proprietà aggiornate nel file
        FileOutputStream out = new FileOutputStream("resource/config.properties");
        props.store(out, null);
        out.close();
    }
}
