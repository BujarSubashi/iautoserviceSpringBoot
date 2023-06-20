package com.cindytech.iautoservice.utils;

import java.util.ResourceBundle;
public class Language {

	ResourceBundle config = ResourceBundle.getBundle("config");
	String lanaguage="en"; 

	//HOME VIEW
	private String HELLO_MESSAGE_LABEL = "Hello";
	private String COMPANY_LABEL = "COMPANY: ";
	private String ADDRESS_LABEL = "ADDRESS: ";
	private String VAT_LABEL = "VAT: ";
	private String PHONE_LABEL = "PHONE: ";
	private String SESSION_INFO_TITLE = "Session Info";
	private String TIME_COUNTRY_ID= "us";
	private String POS_BUTTON_NAME = "POS";
	private String SERVICES_BUTTON_NAME = "Services";
	private String PRODUCTS_BUTTON_NAME = "Products";
	private String CATEGORY_BUTTON_NAME = "Category";
	private String SUPPLIER_BUTTON_NAME = "Supplier";
	private String USERS_BUTTON_NAME = "Users";
	private String SETTINGS_BUTTON_NAME = "Settings";

	/*SETTINGS VIEW*/
	private String SETTINGS_HEADER = "SETTINGS";
	private String SETTINGS_LABEL_CHOOSE_LANGUAGE = "CHOOSE LANGUAGE";
	private String SETTINGS_LABEL_CHOOSE_PRINTER = "CHOOSE PRINTER";
	private String SETTINGS_LABEL_BACKUP_DB = "BACKUP DATABASE";


	public Language() {
		lanaguage = config.getString("language.config");
		setLanguage(lanaguage);
	}

	public void setLanguage(String language) {

		//Setup Albanian Language
		if(language.equals("al")) {
			//HOME
			HELLO_MESSAGE_LABEL = "Mire se erdhe";
			COMPANY_LABEL="SUBJEKTI: ";
			ADDRESS_LABEL="ADRESA: ";
			VAT_LABEL="NIPT: ";
			PHONE_LABEL="CEL: ";
			SESSION_INFO_TITLE = " Informacione te Sistemit ";
			TIME_COUNTRY_ID = "sq";
			POS_BUTTON_NAME = "POS";
			SERVICES_BUTTON_NAME = "Sherbime";
			PRODUCTS_BUTTON_NAME = "Produktet";
			CATEGORY_BUTTON_NAME = "Kategorite";
			SUPPLIER_BUTTON_NAME = "Fornitoret";
			USERS_BUTTON_NAME = "Perderuesit";
			SETTINGS_BUTTON_NAME = "Sistemi";

			//SETTINGS
			SETTINGS_HEADER = "SETTINGS";
			SETTINGS_LABEL_CHOOSE_LANGUAGE = "ZGJIDH GJUHEN";
			SETTINGS_LABEL_CHOOSE_PRINTER = "ZGJIDH PRINTERIN";
			SETTINGS_LABEL_BACKUP_DB = "BEJ KOPJE DATABASE-IT";

			//Setup Italian La
		}else if (language.equals("it")) {
			//HOME
			HELLO_MESSAGE_LABEL = "Benvenuto";
			COMPANY_LABEL="AZIENDA: ";
			ADDRESS_LABEL="INDIRIZZO: ";
			VAT_LABEL="P.IVA: ";
			PHONE_LABEL="TELEFONO: ";
			SESSION_INFO_TITLE = " Informaioni Sistema ";
			TIME_COUNTRY_ID = "it";
			POS_BUTTON_NAME = "POS";
			SERVICES_BUTTON_NAME = "Servizi";
			PRODUCTS_BUTTON_NAME = "Prodotti";
			CATEGORY_BUTTON_NAME = "Categorie";
			SUPPLIER_BUTTON_NAME = "Fornitori";
			USERS_BUTTON_NAME = "Utenti";
			SETTINGS_BUTTON_NAME = "Impostazioni";

			//SETTINGS
			SETTINGS_HEADER = "IMPOSTAZIONI";
			SETTINGS_LABEL_CHOOSE_LANGUAGE = "SCEGLI LA LINGUA";
			SETTINGS_LABEL_CHOOSE_PRINTER = "SCEGLI IL PRINTER";
			SETTINGS_LABEL_BACKUP_DB = "EFFETTUA BACKUP";

		} else {
			//HOME
			HELLO_MESSAGE_LABEL = "Hello";
			COMPANY_LABEL = "COMPANY: ";
			ADDRESS_LABEL = "ADDRESS: ";
			VAT_LABEL = "VAT: ";
			PHONE_LABEL = "PHONE: ";
			SESSION_INFO_TITLE = "Session Info";
			TIME_COUNTRY_ID= "us";
			POS_BUTTON_NAME = "POS";
			SERVICES_BUTTON_NAME = "Services";
			PRODUCTS_BUTTON_NAME = "Products";
			CATEGORY_BUTTON_NAME = "Category";
			SUPPLIER_BUTTON_NAME = "Supplier";
			USERS_BUTTON_NAME = "Users";
			SETTINGS_BUTTON_NAME = "Settings";

			//SETTINGS
			SETTINGS_HEADER = "SETTINGS";
			SETTINGS_LABEL_CHOOSE_LANGUAGE = "CHOOSE LANGUAGE";
			SETTINGS_LABEL_CHOOSE_PRINTER = "CHOOSE PRINTER";
			SETTINGS_LABEL_BACKUP_DB = "BACKUP DATABASE";
		}
	}

	public String getHELLO_MESSAGE_LABEL() {
		return HELLO_MESSAGE_LABEL;
	}

	public String getCompany() {
		return COMPANY_LABEL;
	}

	public String getAddress() {
		return ADDRESS_LABEL;
	}

	public String getVat() {
		return VAT_LABEL;
	}


	public String getPhone() {
		return PHONE_LABEL;
	}

	public String getSession_info() {
		return SESSION_INFO_TITLE;
	}

	public String getTime_country() {
		return TIME_COUNTRY_ID;
	}

	public String getPos() {
		return POS_BUTTON_NAME;
	}


	public String getServices() {
		return SERVICES_BUTTON_NAME;
	}

	public String getProducts() {
		return PRODUCTS_BUTTON_NAME;
	}

	public String getCategory() {
		return CATEGORY_BUTTON_NAME;
	}

	public String getSupplier() {
		return SUPPLIER_BUTTON_NAME;
	}

	public String getUsers() {
		return USERS_BUTTON_NAME;
	}

	public String getSettings() {
		return SETTINGS_BUTTON_NAME;
	}

	public String getSETTINGS_LABEL_CHOOSE_LANGUAGE() {
		return SETTINGS_LABEL_CHOOSE_LANGUAGE;
	}

	public String getSETTINGS_LABEL_CHOOSE_PRINTER() {
		return SETTINGS_LABEL_CHOOSE_PRINTER;
	}

	public String getSETTINGS_LABEL_BACKUP_DB() {
		return SETTINGS_LABEL_BACKUP_DB;
	}

	public String getSETTINGS_HEADER() {
		return SETTINGS_HEADER;
	}

}
