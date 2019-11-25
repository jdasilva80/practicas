package com.dasilva.pizza.actions;

import org.springframework.stereotype.Component;

import com.dasilva.pizza.domain.Customer;
import com.dasilva.pizza.domain.Order;
import com.dasilva.pizza.domain.PaymentDetails;

@Component
public class PizzaFlowActions {

	private Order order;

	public void saveOrder(Order order) {

		System.out.println("save order");

	}

	public Customer lookUpCustomer(int phoneNumber) throws Exception {

		if (phoneNumber == 933987503) {

			Customer customer = new Customer();
			customer.setPhoneNumber(phoneNumber);
			customer.setZipCode(9999);
			customer.setApellidos("da silva lopez");
			customer.setNombre("jose manuel");
			order.setCustomer(customer);
			return customer;

		} else {

			throw new Exception("cliente no encontrado");
		}
	}

	public boolean checkDeliveryArea(int zipCode) {

		if (zipCode == 9999) {
			return true;
		} else {
			return false;
		}
	}

	public Customer addCustomer(Customer customer) {

		if (order == null) {
			order = new Order();
		}
		order.setCustomer(customer);

		return customer;
	}

	public PaymentDetails verifyPayment(PaymentDetails paymentDetails) {

		return paymentDetails;
	}
}
