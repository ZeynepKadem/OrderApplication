package service.abstracts;

import java.util.List;

import entity.concretes.Customer;

public interface CustomerService {

	List<Customer> getAllCustomersContainsC();
	List<Customer> getAll();
	Customer getById(int id);
	Customer getByFirstNameAndLastName(String firstName , String lastName);
	Customer add(Customer customer);
	void printAllCustomer(List<Customer> customers);
}
