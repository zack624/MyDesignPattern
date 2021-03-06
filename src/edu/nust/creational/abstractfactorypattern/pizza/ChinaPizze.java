package edu.nust.creational.abstractfactorypattern.pizza;

import edu.nust.creational.abstractfactorypattern.source.AbstractSourceFactory;


public class ChinaPizze extends ProductPizza {
	
	public ChinaPizze(AbstractSourceFactory asf){
		this.name = "china pizza";
		this.dough = asf.createDough();
		this.sauce = asf.createSauce();
	}

	@Override
	public void cut() {
		System.out.println("pizza is cutting in chinese way.");
	}
	
	
}
