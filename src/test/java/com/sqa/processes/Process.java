package com.sqa.processes;

import org.openqa.selenium.WebDriver;



/*Clase abstracta de la que heredan 'login' y 'sendmail'*/
public abstract class Process {

	protected WebDriver driver = null;
	
	public Process (WebDriver driver){
		this.driver = driver;	
	}
		
	
	public abstract void Run () throws Exception;

	
}
