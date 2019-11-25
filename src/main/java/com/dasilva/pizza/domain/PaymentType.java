package com.dasilva.pizza.domain;

import java.util.Arrays;
import java.util.List;

public enum PaymentType {

	VISA, MASTERCAD, AMEX;

	public static List<PaymentType> asList() {

		PaymentType[] all = PaymentType.values();
		return Arrays.asList(all);
	}

	@Override
	public String toString() {
		return name();
	}

}
