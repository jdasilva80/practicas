package com.dasilva.pizza.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Customer customer;
	private List<Pizza> pizzas = new ArrayList<>();;
	private PaymentDetails paymentDetails;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails payment) {
		this.paymentDetails = payment;
	}

	public Pizza addPizza(Pizza pizza) {

		pizzas.add(pizza);

		return pizza;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", pizzas=" + pizzas + ", paymentDetails=" + paymentDetails + "]";
	}

}
