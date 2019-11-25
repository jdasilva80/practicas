package com.dasilva.pizza.domain;

import java.util.Arrays;
import java.util.List;

public enum Topping {

	SETAS,SALAMI,ATUN,CEBOLLA,BACON,PIMIENTO;
	
	public static List<Topping> asList(){
		
		Topping[] all = Topping.values();
		return Arrays.asList(all);
	}
	
	@Override
	public String toString() {
		return name();
	}
	
}
