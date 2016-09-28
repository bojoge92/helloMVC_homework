package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	Map<String, Customer> customers;

	private static final CustomerService instance = new CustomerService();

	private CustomerService() {
		customers = new HashMap<String, Customer>();
	}

	public static CustomerService getInstance() {
		return instance;
	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}

	public Customer findCustomer(String id) {
		if (id != null)
			return customers.get(id.toLowerCase());
		else
			return null;
	}

	public Customer login(String id, String password) {

		System.out.println(customers.size());

		System.out.println("Login");
		System.out.println(customers.get(id.toLowerCase()).equals(id));
		
		try {
			customers.get(id.toLowerCase());
			return customers.get(id.toLowerCase());
		} catch(NullPointerException  e) {
			return null;
		}
		
	}

}